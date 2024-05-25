package views;

import javax.swing.JOptionPane;

public class Page1 extends javax.swing.JPanel {
    private final Application application;
    private String userName;
    private String userOrigin;
    private int userAge;
    private String userWork;
    
    public Page1(Application application) {
        this.application = application;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        image1 = new javax.swing.JLabel();
        textPage1 = new javax.swing.JLabel();
        textPage2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        ageField = new javax.swing.JTextField();
        workField = new javax.swing.JTextField();
        originField = new javax.swing.JTextField();
        continueButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(210, 180, 140));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image1.setForeground(new java.awt.Color(0, 0, 0));
        image1.setIcon(new javax.swing.ImageIcon(".\\src\\main\\java\\resources\\images\\1. Entrance.png"));
        image1.setText("image1");
        image1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        add(image1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 700, 620));

        textPage1.setFont(new java.awt.Font("Dosis", 0, 35)); // NOI18N
        textPage1.setForeground(new java.awt.Color(0, 0, 0));
        textPage1.setText("<html><div style='text-align: center;'>Despiertas... Estás atrapado en un búnker lleno de ruinas y polvo; no tienes ni idea de como llegaste allí...</div></html>");
        textPage1.setToolTipText("");
        add(textPage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 70, 437, 181));

        textPage2.setFont(new java.awt.Font("Dosis", 0, 35)); // NOI18N
        textPage2.setForeground(new java.awt.Color(0, 0, 0));
        textPage2.setText("<html><div style='text-align: center;'>Tratas de recordar quien eres...</div></html>");
        textPage2.setToolTipText("");
        textPage2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(textPage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 260, -1, 72));

        nameField.setBackground(new java.awt.Color(217, 217, 217));
        nameField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameField.setForeground(new java.awt.Color(51, 51, 51));
        nameField.setText("Tu posible nombre ...");
        nameField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nameField.setMinimumSize(new java.awt.Dimension(70, 26));
        nameField.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        nameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFieldFocusLost(evt);
            }
        });
        nameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nameFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nameFieldMouseExited(evt);
            }
        });
        add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 350, 341, 47));

        ageField.setBackground(new java.awt.Color(217, 217, 217));
        ageField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ageField.setForeground(new java.awt.Color(51, 51, 51));
        ageField.setText("Tu posible edad ...");
        ageField.setActionCommand("<Not Set>");
        ageField.setMinimumSize(new java.awt.Dimension(70, 26));
        ageField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ageFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ageFieldFocusLost(evt);
            }
        });
        ageField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ageFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ageFieldMouseExited(evt);
            }
        });
        add(ageField, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 410, 341, 47));

        workField.setBackground(new java.awt.Color(217, 217, 217));
        workField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        workField.setForeground(new java.awt.Color(51, 51, 51));
        workField.setText("Tu posible ocupación ...");
        workField.setMinimumSize(new java.awt.Dimension(70, 26));
        workField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                workFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                workFieldFocusLost(evt);
            }
        });
        workField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                workFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                workFieldMouseExited(evt);
            }
        });
        add(workField, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 530, 341, 47));

        originField.setBackground(new java.awt.Color(217, 217, 217));
        originField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        originField.setForeground(new java.awt.Color(51, 51, 51));
        originField.setText("Tu posible lugar de origen ...");
        originField.setMinimumSize(new java.awt.Dimension(70, 26));
        originField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                originFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                originFieldFocusLost(evt);
            }
        });
        originField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                originFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                originFieldMouseExited(evt);
            }
        });
        add(originField, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 470, 341, 47));

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
    }// </editor-fold>//GEN-END:initComponents

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserOrigin() {
        return userOrigin;
    }

    public void setUserOrigin(String userOrigin) {
        this.userOrigin = userOrigin;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserWork() {
        return userWork;
    }

    public void setUserWork(String userWork) {
        this.userWork = userWork;
    }
    
    private void nameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFieldFocusGained
        if (nameField.getText().equals("Tu posible nombre ...")){        
            nameField.setText("");
        }
    }//GEN-LAST:event_nameFieldFocusGained

    private void nameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFieldFocusLost
        if (nameField.getText().equals("")){
            nameField.setText("Tu posible nombre ...");
        }
    }//GEN-LAST:event_nameFieldFocusLost

    private void nameFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameFieldMouseEntered
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    }//GEN-LAST:event_nameFieldMouseEntered

    private void nameFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameFieldMouseExited
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_nameFieldMouseExited

    private void ageFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ageFieldFocusGained
        if (ageField.getText().equals("Tu posible edad ...")){
            ageField.setText("");
        }
    }//GEN-LAST:event_ageFieldFocusGained

    private void ageFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ageFieldFocusLost
        if (ageField.getText().equals("")){
            ageField.setText("Tu posible edad ...");
        }
    }//GEN-LAST:event_ageFieldFocusLost

    private void ageFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ageFieldMouseEntered
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    }//GEN-LAST:event_ageFieldMouseEntered

    private void ageFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ageFieldMouseExited
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_ageFieldMouseExited

    private void workFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_workFieldFocusGained
        if (workField.getText().equals("Tu posible ocupación ...")){
            workField.setText("");
        }
    }//GEN-LAST:event_workFieldFocusGained

    private void workFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_workFieldFocusLost
        if (workField.getText().equals("")){
            workField.setText("Tu posible ocupación ...");
        }
    }//GEN-LAST:event_workFieldFocusLost

    private void workFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workFieldMouseEntered
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    }//GEN-LAST:event_workFieldMouseEntered

    private void workFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workFieldMouseExited
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_workFieldMouseExited

    private void originFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_originFieldFocusGained
        if (originField.getText().equals("Tu posible lugar de origen ...")){
            originField.setText("");
        }
    }//GEN-LAST:event_originFieldFocusGained

    private void originFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_originFieldFocusLost
        if (originField.getText().equals("")){
            originField.setText("Tu posible lugar de origen ...");
        }
    }//GEN-LAST:event_originFieldFocusLost

    private void originFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_originFieldMouseEntered
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    }//GEN-LAST:event_originFieldMouseEntered

    private void originFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_originFieldMouseExited
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_originFieldMouseExited

    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButtonActionPerformed
        userName = nameField.getText();
        userOrigin = originField.getText();
        userWork = workField.getText();
        
        if (ageField.getText().isBlank() || userName.isBlank() || userOrigin.isBlank() || userWork.isBlank()){
            JOptionPane.showMessageDialog(this, "¡Faltan campos por llenar!");
        } else {
            try {
                userAge = Integer.parseInt(ageField.getText());
                if (userAge < 1 || userAge > 150){
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "¡Tu edad no es un valor entero válido!");
                ageField.setText("");
            }
            if (!ageField.getText().isBlank()){
                application.showPage("Page 2");
            }
        }
    }//GEN-LAST:event_continueButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JButton continueButton;
    private javax.swing.JLabel image1;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField originField;
    private javax.swing.JLabel textPage1;
    private javax.swing.JLabel textPage2;
    private javax.swing.JTextField workField;
    // End of variables declaration//GEN-END:variables
}
