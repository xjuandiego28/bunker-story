package views;

import javax.swing.JOptionPane;
import java.util.Calendar;

public class Page2 extends javax.swing.JPanel {
    private final Application application;
    private String codeText = "";
    private int code;
    private boolean isValidCode;
    public Page2(Application application) {
        this.application = application;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundImage2 = new javax.swing.JLabel();
        textPage1 = new javax.swing.JLabel();
        textPage2 = new javax.swing.JLabel();
        buttonNumber1 = new javax.swing.JButton();
        buttonNumber2 = new javax.swing.JButton();
        buttonNumber3 = new javax.swing.JButton();
        buttonNumber4 = new javax.swing.JButton();
        buttonNumber5 = new javax.swing.JButton();
        buttonNumber6 = new javax.swing.JButton();
        buttonNumber7 = new javax.swing.JButton();
        buttonNumber8 = new javax.swing.JButton();
        buttonNumber9 = new javax.swing.JButton();
        buttonNumber0 = new javax.swing.JButton();
        codePanel = new javax.swing.JLayeredPane();
        codeLabel = new javax.swing.JLabel();
        continueButton = new javax.swing.JButton();
        buttonErase = new javax.swing.JButton();

        setBackground(new java.awt.Color(210, 180, 140));
        setForeground(new java.awt.Color(149, 149, 152));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundImage2.setForeground(new java.awt.Color(0, 0, 0));
        backgroundImage2.setIcon(new javax.swing.ImageIcon(".\\src\\main\\java\\resources\\images\\2. Exploring.jpeg"));
        backgroundImage2.setText("image2");
        backgroundImage2.setAlignmentY(0.0F);
        add(backgroundImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 700, 620));

        textPage1.setFont(new java.awt.Font("Dosis", 0, 35)); // NOI18N
        textPage1.setForeground(new java.awt.Color(0, 0, 0));
        textPage1.setText("<html><div style='text-align: center;'>Decides explorar el búnker en busca de respuestas. ¿Por qué estás allí? ¿Qué hay fuera? ¿Hay alguien más ahí dentro?</div></html>");
        textPage1.setToolTipText("");
        add(textPage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 437, 181));

        textPage2.setFont(new java.awt.Font("Dosis", 0, 35)); // NOI18N
        textPage2.setForeground(new java.awt.Color(0, 0, 0));
        textPage2.setText("<html><div style='text-align: center;'>Encuentras una puerta con contraseña... Algo me dice que está asociada a ti.</div></html>");
        textPage2.setToolTipText("");
        textPage2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(textPage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 210, 450, 170));

        buttonNumber1.setBackground(new java.awt.Color(157, 157, 157));
        buttonNumber1.setFont(new java.awt.Font("Lato Black", 0, 27)); // NOI18N
        buttonNumber1.setForeground(new java.awt.Color(0, 0, 0));
        buttonNumber1.setText("1");
        buttonNumber1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonNumber1.setMargin(new java.awt.Insets(1, 1, 1, 1));
        buttonNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNumber1ActionPerformed(evt);
            }
        });
        add(buttonNumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 390, 50, 50));

        buttonNumber2.setBackground(new java.awt.Color(157, 157, 157));
        buttonNumber2.setFont(new java.awt.Font("Lato Black", 0, 27)); // NOI18N
        buttonNumber2.setForeground(new java.awt.Color(0, 0, 0));
        buttonNumber2.setText("2");
        buttonNumber2.setAlignmentY(0.0F);
        buttonNumber2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonNumber2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        buttonNumber2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNumber2ActionPerformed(evt);
            }
        });
        add(buttonNumber2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 390, 50, 50));

        buttonNumber3.setBackground(new java.awt.Color(157, 157, 157));
        buttonNumber3.setFont(new java.awt.Font("Lato Black", 0, 27)); // NOI18N
        buttonNumber3.setForeground(new java.awt.Color(0, 0, 0));
        buttonNumber3.setText("3");
        buttonNumber3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonNumber3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        buttonNumber3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNumber3ActionPerformed(evt);
            }
        });
        add(buttonNumber3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 390, 50, 50));

        buttonNumber4.setBackground(new java.awt.Color(157, 157, 157));
        buttonNumber4.setFont(new java.awt.Font("Lato Black", 0, 27)); // NOI18N
        buttonNumber4.setForeground(new java.awt.Color(0, 0, 0));
        buttonNumber4.setText("4");
        buttonNumber4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonNumber4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        buttonNumber4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNumber4ActionPerformed(evt);
            }
        });
        add(buttonNumber4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 390, 50, 50));

        buttonNumber5.setBackground(new java.awt.Color(157, 157, 157));
        buttonNumber5.setFont(new java.awt.Font("Lato Black", 0, 27)); // NOI18N
        buttonNumber5.setForeground(new java.awt.Color(0, 0, 0));
        buttonNumber5.setText("5");
        buttonNumber5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonNumber5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        buttonNumber5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNumber5ActionPerformed(evt);
            }
        });
        add(buttonNumber5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 450, 50, 50));

        buttonNumber6.setBackground(new java.awt.Color(157, 157, 157));
        buttonNumber6.setFont(new java.awt.Font("Lato Black", 0, 27)); // NOI18N
        buttonNumber6.setForeground(new java.awt.Color(0, 0, 0));
        buttonNumber6.setText("6");
        buttonNumber6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonNumber6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        buttonNumber6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNumber6ActionPerformed(evt);
            }
        });
        add(buttonNumber6, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 450, 50, 50));

        buttonNumber7.setBackground(new java.awt.Color(157, 157, 157));
        buttonNumber7.setFont(new java.awt.Font("Lato Black", 0, 27)); // NOI18N
        buttonNumber7.setForeground(new java.awt.Color(0, 0, 0));
        buttonNumber7.setText("7");
        buttonNumber7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonNumber7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        buttonNumber7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNumber7ActionPerformed(evt);
            }
        });
        add(buttonNumber7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 450, 50, 50));

        buttonNumber8.setBackground(new java.awt.Color(157, 157, 157));
        buttonNumber8.setFont(new java.awt.Font("Lato Black", 0, 27)); // NOI18N
        buttonNumber8.setForeground(new java.awt.Color(0, 0, 0));
        buttonNumber8.setText("8");
        buttonNumber8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonNumber8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNumber8ActionPerformed(evt);
            }
        });
        add(buttonNumber8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 450, 50, 50));

        buttonNumber9.setBackground(new java.awt.Color(157, 157, 157));
        buttonNumber9.setFont(new java.awt.Font("Lato Black", 0, 27)); // NOI18N
        buttonNumber9.setForeground(new java.awt.Color(0, 0, 0));
        buttonNumber9.setText("9");
        buttonNumber9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonNumber9.setMargin(new java.awt.Insets(0, 0, 0, 0));
        buttonNumber9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNumber9ActionPerformed(evt);
            }
        });
        add(buttonNumber9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 450, 50, 50));

        buttonNumber0.setBackground(new java.awt.Color(157, 157, 157));
        buttonNumber0.setFont(new java.awt.Font("Lato Black", 0, 27)); // NOI18N
        buttonNumber0.setForeground(new java.awt.Color(0, 0, 0));
        buttonNumber0.setText("0");
        buttonNumber0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonNumber0.setMargin(new java.awt.Insets(0, 0, 0, 0));
        buttonNumber0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNumber0ActionPerformed(evt);
            }
        });
        add(buttonNumber0, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 390, 50, 50));

        codePanel.setBackground(new java.awt.Color(193, 194, 198));
        codePanel.setForeground(new java.awt.Color(153, 153, 153));
        codePanel.setOpaque(true);
        codePanel.setPreferredSize(new java.awt.Dimension(250, 51));

        codeLabel.setFont(new java.awt.Font("Lato Black", 0, 27)); // NOI18N
        codeLabel.setForeground(new java.awt.Color(0, 0, 0));
        codeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        codeLabel.setText(codeText);
        codeLabel.setToolTipText("");
        codeLabel.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        codeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        codeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        codePanel.setLayer(codeLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout codePanelLayout = new javax.swing.GroupLayout(codePanel);
        codePanel.setLayout(codePanelLayout);
        codePanelLayout.setHorizontalGroup(
            codePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(codeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        codePanelLayout.setVerticalGroup(
            codePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(codeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        add(codePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 520, 200, 51));

        continueButton.setBackground(new java.awt.Color(217, 217, 217));
        continueButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        continueButton.setForeground(new java.awt.Color(0, 0, 0));
        continueButton.setText("Continuar");
        continueButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        continueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });
        add(continueButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 620, 125, 35));

        buttonErase.setBackground(new java.awt.Color(157, 157, 157));
        buttonErase.setFont(new java.awt.Font("Lato Black", 0, 27)); // NOI18N
        buttonErase.setForeground(new java.awt.Color(0, 0, 0));
        buttonErase.setIcon(new javax.swing.ImageIcon(".\\src\\main\\java\\resources\\images\\trash-icon.png"));
        buttonErase.setBorder(null);
        buttonErase.setBorderPainted(false);
        buttonErase.setContentAreaFilled(false);
        buttonErase.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonErase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEraseActionPerformed(evt);
            }
        });
        add(buttonErase, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 520, 50, 50));
    }// </editor-fold>//GEN-END:initComponents
    
    private void buttonNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNumber1ActionPerformed
        if (codeText.length() < 4){
           codeText = codeText + "1"; 
           codeLabel.setText(codeText);
        }
    }//GEN-LAST:event_buttonNumber1ActionPerformed

    private void buttonNumber2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNumber2ActionPerformed
        if (codeText.length() < 4){
           codeText = codeText + "2";
           codeLabel.setText(codeText);
        }
    }//GEN-LAST:event_buttonNumber2ActionPerformed

    private void buttonNumber3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNumber3ActionPerformed
        if (codeText.length() < 4){
           codeText = codeText + "3";
           codeLabel.setText(codeText);
        }
    }//GEN-LAST:event_buttonNumber3ActionPerformed

    private void buttonNumber4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNumber4ActionPerformed
        if (codeText.length() < 4){
           codeText = codeText + "4";
           codeLabel.setText(codeText);
        }
    }//GEN-LAST:event_buttonNumber4ActionPerformed

    private void buttonNumber5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNumber5ActionPerformed
        if (codeText.length() < 4){
           codeText = codeText + "5";
           codeLabel.setText(codeText);
        }
    }//GEN-LAST:event_buttonNumber5ActionPerformed

    private void buttonNumber6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNumber6ActionPerformed
        if (codeText.length() < 4){
           codeText = codeText + "6";
           codeLabel.setText(codeText);
        }
    }//GEN-LAST:event_buttonNumber6ActionPerformed

    private void buttonNumber7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNumber7ActionPerformed
        if (codeText.length() < 4){
           codeText = codeText + "7";
           codeLabel.setText(codeText);
        }
    }//GEN-LAST:event_buttonNumber7ActionPerformed

    private void buttonNumber8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNumber8ActionPerformed
        if (codeText.length() < 4){
           codeText = codeText + "8";
           codeLabel.setText(codeText);
        }
    }//GEN-LAST:event_buttonNumber8ActionPerformed

    private void buttonNumber9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNumber9ActionPerformed
        if (codeText.length() < 4){
           codeText = codeText + "9";
           codeLabel.setText(codeText);
        }
    }//GEN-LAST:event_buttonNumber9ActionPerformed

    private void buttonNumber0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNumber0ActionPerformed
        if (codeText.length() < 4){
           codeText = codeText + "0";
           codeLabel.setText(codeText);
        }
    }//GEN-LAST:event_buttonNumber0ActionPerformed

    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButtonActionPerformed
        if (codeLabel.getText().length() == 4){
            this.isValidCode = true;
            try{
                this.code = Integer.parseInt(codeText);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Hay problemas con el código. ¡Intenta de nuevo!");
                this.erasePassword();
                this.isValidCode = false;
            }
            
            Calendar calendar = Calendar.getInstance();
            int currentYear = calendar.get(Calendar.YEAR);
            int userAge = application.getPage1().getUserAge();
            if (this.isValidCode && (currentYear - userAge == this.code || currentYear - userAge == this.code + 1)){
                application.showPage("Page 3");
            } else {
                JOptionPane.showMessageDialog(this, "Contraseña incorrecta, intenta de nuevo");
                this.erasePassword();
            }
        } else{
            JOptionPane.showMessageDialog(this, "El tamaño de tu contraseña no es el correcto");
        }
    }//GEN-LAST:event_continueButtonActionPerformed

    private void buttonEraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEraseActionPerformed
        this.erasePassword();
    }//GEN-LAST:event_buttonEraseActionPerformed
    private void erasePassword(){
        codeText = "";
        codeLabel.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImage2;
    private javax.swing.JButton buttonErase;
    private javax.swing.JButton buttonNumber0;
    private javax.swing.JButton buttonNumber1;
    private javax.swing.JButton buttonNumber2;
    private javax.swing.JButton buttonNumber3;
    private javax.swing.JButton buttonNumber4;
    private javax.swing.JButton buttonNumber5;
    private javax.swing.JButton buttonNumber6;
    private javax.swing.JButton buttonNumber7;
    private javax.swing.JButton buttonNumber8;
    private javax.swing.JButton buttonNumber9;
    private javax.swing.JLabel codeLabel;
    private javax.swing.JLayeredPane codePanel;
    private javax.swing.JButton continueButton;
    private javax.swing.JLabel textPage1;
    private javax.swing.JLabel textPage2;
    // End of variables declaration//GEN-END:variables
}
