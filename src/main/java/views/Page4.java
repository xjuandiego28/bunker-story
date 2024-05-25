package views;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.TableRowSorter;
import models.Vehicle;
import models.VehicleTableModel;
import controllers.TableController;
import controllers.ReceiptController;

public class Page4 extends javax.swing.JPanel {
    private final Application application;
    private final TableController tableModifier = new TableController();
    private final ArrayList<Vehicle> vehicleList;
    private final VehicleTableModel tableModel;
    private final TableRowSorter<VehicleTableModel> rowSorter;
    private ArrayList<Vehicle> purchasedVehiclesList;

    public Page4(Application application) {
        this.application = application;
        this.vehicleList = tableModifier.getVehicleTable();
        this.purchasedVehiclesList = new ArrayList<>();
        this.tableModel = new VehicleTableModel(vehicleList);
        this.rowSorter = new TableRowSorter<>(tableModel);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        generatePDFLabel = new javax.swing.JLabel();
        generatePDFButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        vehicleTable = new javax.swing.JTable();
        titleLabel = new javax.swing.JLabel();
        searchLabel = new javax.swing.JLabel();
        searchBar = new javax.swing.JTextField();
        purchaseLabel = new javax.swing.JLabel();
        purchaseButton = new javax.swing.JButton();
        continueButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(210, 180, 140));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        generatePDFLabel.setFont(new java.awt.Font("Dosis", 0, 30)); // NOI18N
        generatePDFLabel.setForeground(new java.awt.Color(0, 0, 0));
        generatePDFLabel.setText("Generar Documento PDF");
        generatePDFLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        generatePDFLabel.setVisible(false);
        add(generatePDFLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 620, -1, -1));

        generatePDFButton.setBackground(new java.awt.Color(0, 0, 0));
        generatePDFButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        generatePDFButton.setForeground(new java.awt.Color(0, 0, 0));
        generatePDFButton.setIcon(new javax.swing.ImageIcon(".\\src\\main\\java\\resources\\images\\receipt-solid.png"));
        generatePDFButton.setBorderPainted(false);
        generatePDFButton.setContentAreaFilled(false);
        generatePDFButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generatePDFButton.setEnabled(false);
        generatePDFButton.setVisible(false);
        generatePDFButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatePDFButtonActionPerformed(evt);
            }
        });
        add(generatePDFButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 615, 50, 50));

        vehicleTable.setBackground(new java.awt.Color(217, 217, 217));
        vehicleTable.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        vehicleTable.setForeground(new java.awt.Color(51, 51, 51));
        vehicleTable.setModel(tableModel);
        vehicleTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vehicleTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        vehicleTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        vehicleTable.getTableHeader().setReorderingAllowed(false);
        vehicleTable.setRowSorter(rowSorter);
        jScrollPane1.setViewportView(vehicleTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 120, 1270, 470));

        titleLabel.setFont(new java.awt.Font("Lato Black", 0, 42)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 0, 0));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Lista de vehículos");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 523, 79));

        searchLabel.setFont(new java.awt.Font("Dosis", 0, 30)); // NOI18N
        searchLabel.setForeground(new java.awt.Color(0, 0, 0));
        searchLabel.setText("Buscar vehículo");
        searchLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(searchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 620, -1, -1));

        searchBar.setBackground(new java.awt.Color(217, 217, 217));
        searchBar.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                updateFilter();
            }
            public void removeUpdate(DocumentEvent e) {
                updateFilter();
            }
            public void insertUpdate(DocumentEvent e) {
                updateFilter();
            }

            public void updateFilter() {
                RowFilter<VehicleTableModel, Integer> rowFilter = RowFilter.regexFilter(searchBar.getText(), 0, 1, 2, 3, 4, 5, 6, 7);
                rowSorter.setRowFilter(rowFilter);
            }
        });
        add(searchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 620, 460, 40));

        purchaseLabel.setFont(new java.awt.Font("Dosis", 0, 30)); // NOI18N
        purchaseLabel.setForeground(new java.awt.Color(0, 0, 0));
        purchaseLabel.setText("Comprar");
        purchaseLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(purchaseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 620, -1, -1));

        purchaseButton.setBackground(new java.awt.Color(217, 217, 217));
        purchaseButton.setForeground(new java.awt.Color(0, 0, 0));
        purchaseButton.setIcon(new javax.swing.ImageIcon(".\\src\\main\\java\\resources\\images\\plus-solid.png"));
        purchaseButton.setBorder(null);
        purchaseButton.setBorderPainted(false);
        purchaseButton.setContentAreaFilled(false);
        purchaseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        purchaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseButtonActionPerformed(evt);
            }
        });
        add(purchaseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 615, 50, 50));

        continueButton.setBackground(new java.awt.Color(217, 217, 217));
        continueButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        continueButton.setForeground(new java.awt.Color(0, 0, 0));
        continueButton.setText("Continuar");
        continueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });
        add(continueButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 620, 125, 35));
    }// </editor-fold>//GEN-END:initComponents

    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButtonActionPerformed
        int counter = 0;
        if (!purchasedVehiclesList.isEmpty()){
            int selectedOption = JOptionPane.showConfirmDialog(this, "¿Deseas continuar? \n"
                        + "Hasta el momento has seleccionado los siguientes vehículos: \n "
                        + this.showPurchasedVehicles(), "Confirmación", JOptionPane.YES_NO_OPTION);
            if (selectedOption == JOptionPane.YES_OPTION) {
                if (counter == 0){
                    purchaseButton.setVisible(false);
                    purchaseButton.setEnabled(false);
                    purchaseLabel.setVisible(false);
                    searchBar.setVisible(false);
                    searchBar.setEnabled(false);
                    searchLabel.setVisible(false);
                    generatePDFButton.setVisible(true);
                    generatePDFButton.setEnabled(true);
                    generatePDFLabel.setVisible(true);
                    counter += 1;
                } else {
                    application.showPage("Page 5");
                }
            } else if (selectedOption == JOptionPane.NO_OPTION) {
                System.out.println("Continua en la vista de compra");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No has seleccionado ningún vehículo para tu compra");
        }
    }//GEN-LAST:event_continueButtonActionPerformed

    private void purchaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseButtonActionPerformed
        int selectedRow = vehicleTable.getSelectedRow();
        if (selectedRow != -1){
            int selectedRowInModel = vehicleTable.convertRowIndexToModel(selectedRow);   
            Vehicle vehicle = this.tableModel.getVehicule(selectedRowInModel);
            purchasedVehiclesList.add(vehicle);
            JOptionPane.showMessageDialog(this, "Vehículo agregado al carrito de compras satisfactoriamente");
        } else {
            JOptionPane.showMessageDialog(this, "No has seleccionado un vehículo para tu compra");
        }
    }//GEN-LAST:event_purchaseButtonActionPerformed

    private void generatePDFButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatePDFButtonActionPerformed
        ReceiptController purchaseReceipt = new ReceiptController();
        purchaseReceipt.createReceipt(purchasedVehiclesList);
        JOptionPane.showMessageDialog(this, "Factura de compra generada. Prepárate para competir");
        application.showPage("Page 5");
    }//GEN-LAST:event_generatePDFButtonActionPerformed

    private String showPurchasedVehicles(){
        String purchasedVehicles = "";
        for (Vehicle vehicle: purchasedVehiclesList){
            purchasedVehicles += ("Referencia: " + vehicle.getReference() + 
                                    ", Marca: " + vehicle.getBrand() + "\n");
        }
        return purchasedVehicles;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continueButton;
    private javax.swing.JButton generatePDFButton;
    private javax.swing.JLabel generatePDFLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton purchaseButton;
    private javax.swing.JLabel purchaseLabel;
    private javax.swing.JTextField searchBar;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTable vehicleTable;
    // End of variables declaration//GEN-END:variables
}
