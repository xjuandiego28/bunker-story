package views;

public class Page3 extends javax.swing.JPanel {
    private final Application application;
    public Page3(Application application) {
        this.application = application;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundImage3 = new javax.swing.JLabel();
        textPage1 = new javax.swing.JLabel();
        textPage3 = new javax.swing.JLabel();
        textPage2 = new javax.swing.JLabel();
        continueButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(210, 180, 140));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundImage3.setIcon(new javax.swing.ImageIcon(".\\src\\main\\java\\resources\\images\\3. Racetrack.jpeg")
        );
        backgroundImage3.setText("image3");
        backgroundImage3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        backgroundImage3.setAlignmentY(0.0F);
        add(backgroundImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 700, 620));

        textPage1.setFont(new java.awt.Font("Dosis", 0, 35)); // NOI18N
        textPage1.setForeground(new java.awt.Color(0, 0, 0));
        textPage1.setText("<html><div style='text-align: center;'>La contraseña era tu año de nacimiento...  ¿Casualidad? </div></html>");
        add(textPage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, 518, 98));

        textPage3.setFont(new java.awt.Font("Dosis", 0, 35)); // NOI18N
        textPage3.setForeground(new java.awt.Color(0, 0, 0));
        textPage3.setText("<html><div style='text-align: center;'> Estás en el medio de una carrera y todos están esperandote para competir, necesitarás un vehículo ciertamente...</div></html>");
        textPage3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(textPage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, 518, 196));

        textPage2.setFont(new java.awt.Font("Dosis", 0, 35)); // NOI18N
        textPage2.setForeground(new java.awt.Color(0, 0, 0));
        textPage2.setText("<html><div style='text-align: center;'>A medida que te acercas a la puerta exterior comienzas a escuchar una multitud gritando tu nombre.</div></html>");
        textPage2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(textPage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 150, 518, 220));

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
       application.showPage("Page 4");
    }//GEN-LAST:event_continueButtonActionPerformed
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImage3;
    private javax.swing.JButton continueButton;
    private javax.swing.JLabel textPage1;
    private javax.swing.JLabel textPage2;
    private javax.swing.JLabel textPage3;
    // End of variables declaration//GEN-END:variables
}
