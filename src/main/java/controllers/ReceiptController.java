package controllers;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.*;
import java.util.*;
import models.Vehicle;

public class ReceiptController {
    File fileName = new File(".\\src\\main\\java\\resources\\data\\factura.pdf");
    private final Font titleFont = FontFactory.getFont(FontFactory.HELVETICA, 15, Font.BOLD);
    private final Font paragraphFont = FontFactory.getFont(FontFactory.HELVETICA, 12, Font.NORMAL);
    
    public void createReceipt(ArrayList<Vehicle> purchasedVehicleList){
        Document document = new Document(new Rectangle(400,1000));
        try {
            PdfWriter.getInstance(document, new FileOutputStream(fileName));
            document.open();
            document.addTitle("Factura de venta");
            document.addSubject("Compra de vehículos desde la base de datos de Fasecolda");
            document.addAuthor("JDPP - UdeA");

            Paragraph receiptTitle = new Paragraph("FACTURA DE VENTA", titleFont);
            receiptTitle.setAlignment(Element.ALIGN_CENTER);
            Chapter chapter = new Chapter(receiptTitle, 1);

            Image receiptLogo;
            try {
                receiptLogo = Image.getInstance(".\\src\\main\\java\\resources\\images\\receipt-logo.png");  
                receiptLogo.setAlignment(Element.ALIGN_CENTER);
                chapter.add(receiptLogo);
            } catch (BadElementException e) {
                System.out.println("Problemas con el elemento: " +  e);
            } catch (IOException e) {
                System.out.println("Problema cargando la imagen: " +  e);
            }

            String[] headerText = {"ADVENTURE CARS", "CALLE 67 #53-108","MEDELLÍN, COLOMBIA", "Tel: 6042198332"};
            for (String text : headerText){
                Paragraph paragraph = new Paragraph(text, paragraphFont);
                paragraph.setAlignment(Element.ALIGN_CENTER);
                chapter.add(paragraph);
            }

            chapter.add(new Paragraph("\n"));
            
            int rowNumber = purchasedVehicleList.size();
            String[] columnNames = {"Referencia", "Marca", "Precio", "IVA"};
            PdfPTable purchasedVehiclesTable = new PdfPTable(columnNames.length); 
            PdfPCell columnHeader;

            for (String columnName : columnNames) {
                columnHeader = new PdfPCell(new Paragraph(columnName));
                columnHeader.setHorizontalAlignment(Element.ALIGN_CENTER);
                purchasedVehiclesTable.addCell(columnHeader);
            }

            for(Vehicle vehicle : purchasedVehicleList){
                for (int column = 0; column < columnNames.length ; column++) {
                    switch (column) {
                        case 0:
                            purchasedVehiclesTable.addCell(vehicle.getReference());
                            break;
                        case 1:
                            purchasedVehiclesTable.addCell(vehicle.getBrand());
                            break;
                        case 2:
                            purchasedVehiclesTable.addCell(String.valueOf(vehicle.getPrice()));
                            break;
                        case 3:
                            purchasedVehiclesTable.addCell(String.valueOf(this.IVACalculator((float)vehicle.getPrice())));
                            break;
                        default: break;
                    }
                }
            }
            chapter.add(purchasedVehiclesTable);
            chapter.add(new Paragraph("\n"));
            
            Paragraph subTotalTitleParagraph = new Paragraph("Sub total (sin IVA): ", titleFont);
            subTotalTitleParagraph.setAlignment(Element.ALIGN_RIGHT);
            chapter.add(subTotalTitleParagraph);
            Paragraph subtotalPriceParagraph = new Paragraph("$" + String.valueOf(this.subTotalPriceCalculator(purchasedVehicleList)), paragraphFont);
            subtotalPriceParagraph.setAlignment(Element.ALIGN_RIGHT);
            chapter.add(subtotalPriceParagraph);
            
            chapter.add(new Paragraph("\n"));
            
            Paragraph totalTitleParagraph = new Paragraph("Total: ", titleFont);
            totalTitleParagraph.setAlignment(Element.ALIGN_RIGHT);
            chapter.add(totalTitleParagraph);
            Paragraph totalPriceParagraph = new Paragraph("$"+String.valueOf(this.totalPriceCalculator(purchasedVehicleList)), paragraphFont);
            totalPriceParagraph.setAlignment(Element.ALIGN_RIGHT);
            chapter.add(totalPriceParagraph);
            
            chapter.add(new Paragraph("\n"));
            
            String[] footerText = {"FECHA: " + this.getCurrentDate(),"GRACIAS POR TU COMPRA"};
            for(String text : footerText){
                Paragraph paragraph = new Paragraph(text, paragraphFont);
                paragraph.setAlignment(Element.ALIGN_CENTER);
                chapter.add(paragraph);
            }
            chapter.add(new Paragraph("\n"));
            
            document.add(chapter);
            document.close();
            
            System.out.println("Factura creada satisfactoriamente");
            
        } catch (DocumentException e) {
            System.err.println("Hay un problema con el archivo generador del documento: " + e.getMessage());
        } catch (FileNotFoundException e){
            System.err.println("No se encontró el archivo para generar el documento: " + e.getMessage());
        } catch (NullPointerException e){
            System.err.println("Hay un problema con un apuntador, retorna nulo: "+ e.getMessage());
        }
    }
    
    public String getCurrentDate(){
        Date currentDate = new Date();
        return currentDate.toString();
    }
    
    public float IVACalculator(float value){
        return (float) (value*0.19);
    }
   
    public float subTotalPriceCalculator(ArrayList<Vehicle> purchasedVehicleList){
        float subTotalPrice = 0;
               for(Vehicle vehicle: purchasedVehicleList){
            subTotalPrice += vehicle.getPrice();
        }
        return subTotalPrice;
    }
    
    public float totalPriceCalculator(ArrayList<Vehicle> purchasedVehicleList){
        float totalPrice = 0;
        for(Vehicle vehicle: purchasedVehicleList){
            totalPrice += (vehicle.getPrice() + this.IVACalculator(vehicle.getPrice()));
        }
        return totalPrice;
    }
}


