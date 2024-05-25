package controllers;

import models.Vehicle;
import java.io.*;
import java.util.*;
import org.apache.poi.ss.usermodel.*;

public class TableController {
    private final ArrayList<Vehicle> vehicleList;

    public TableController() {
        this.vehicleList = new ArrayList<>();
    }
    
    public ArrayList<Vehicle> getVehicleTable() {
        try{
            File tableFile = new File(".\\src\\main\\java\\resources\\data\\datos.xlsx");

            if (!tableFile.exists()) {
                return vehicleList;
            } else {
                FileInputStream inputStream = new FileInputStream(tableFile);
                Workbook workbook = WorkbookFactory.create(inputStream);
                Sheet sheet = workbook.getSheetAt(1);
                Iterator<Row> rowIterator = sheet.iterator();
                
                if (rowIterator.hasNext()) {
                    rowIterator.next();
                }
                
                while (rowIterator.hasNext()) {
                    Row row = rowIterator.next();
                    String brand = "";
                    String vehicleClass = "";
                    String code = "";
                    String homologationCode = "";
                    String reference = "";
                    int price = 0;
                    int cylinderCapacity = 0;
                    String nationality = "";
                    
                    for (Cell cell : row) {
                        int columnIndex = cell.getColumnIndex();
                        switch (columnIndex) {
                        case 1:
                            if (cell.getCellType() == CellType.STRING) {
                                brand = cell.getStringCellValue();
                            }
                            break;
                        case 2:
                            if (cell.getCellType() == CellType.STRING) {
                                vehicleClass = cell.getStringCellValue();
                            }
                            break;
                        case 3:
                            if (cell.getCellType() == CellType.STRING) {
                                code = cell.getStringCellValue();
                            }
                            break;
                        case 4:
                            if (cell.getCellType() == CellType.STRING) {
                                homologationCode = cell.getStringCellValue();
                            }
                            break;
                        case 5:
                            if (cell.getCellType() == CellType.STRING) {
                                reference = cell.getStringCellValue();
                            }
                            break;
                        case 6:
                            if (cell.getCellType() == CellType.NUMERIC) {
                                price = (int) cell.getNumericCellValue();
                            }
                            break;
                        case 71:
                            if (cell.getCellType() == CellType.NUMERIC) {
                                cylinderCapacity = (int) cell.getNumericCellValue();
                            }
                            break;
                        case 72:
                            if (cell.getCellType() == CellType.STRING) {
                                nationality = cell.getStringCellValue();
                            }
                            break;
                        }
                    }
                    Vehicle vehicle = new Vehicle(brand,vehicleClass, code, homologationCode, reference, price, cylinderCapacity, nationality);
                    vehicleList.add(vehicle);
                }
                workbook.close();
                inputStream.close();
            }
        } catch (IOException e){
            System.err.println("Ocurrió el siguiente error al tratar de leer el archivo: " + e.getMessage()); 
        } catch (IllegalArgumentException  e){
            System.err.println("El archivo especificado no es un archivo Excel válido: " + e.getMessage());
        } catch (RuntimeException e) {
            System.err.println("Error: Ocurrió un error inesperado: " + e.getMessage());
        }
        return vehicleList;
    }
}    