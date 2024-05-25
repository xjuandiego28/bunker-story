package views;

import controllers.JsonController;
import javax.swing.JOptionPane;

public class LoginPage extends javax.swing.JPanel {
    private final Application application;
    JsonController jsonModifier = new JsonController(); 
    public LoginPage(Application application) {
        this.application = application;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        passwordField = new javax.swing.JPasswordField();
        emailField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        titleLoginLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        showPasswordCheckbox = new javax.swing.JCheckBox();
        noAccountLabel = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(210, 180, 140));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPanel.setBackground(new java.awt.Color(193, 154, 107));

        passwordField.setBackground(new java.awt.Color(217, 217, 217));
        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordField.setForeground(new java.awt.Color(51, 51, 51));

        emailField.setBackground(new java.awt.Color(217, 217, 217));
        emailField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailField.setForeground(new java.awt.Color(51, 51, 51));

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(51, 51, 51));
        nameLabel.setText("Ingresa tu email:");

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(51, 51, 51));
        passwordLabel.setText("Ingresa tu contraseña:");

        titleLoginLabel.setFont(new java.awt.Font("Dosis", 0, 35)); // NOI18N
        titleLoginLabel.setForeground(new java.awt.Color(51, 51, 51));
        titleLoginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLoginLabel.setText("Comienza tu aventura");

        loginButton.setBackground(new java.awt.Color(217, 217, 217));
        loginButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(51, 51, 51));
        loginButton.setText("Iniciar Sesión");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        showPasswordCheckbox.setBackground(new java.awt.Color(255, 255, 255));
        showPasswordCheckbox.setForeground(new java.awt.Color(51, 51, 51));
        showPasswordCheckbox.setText("Mostrar contraseña");
        showPasswordCheckbox.setToolTipText("");
        showPasswordCheckbox.setContentAreaFilled(false);
        showPasswordCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordCheckboxActionPerformed(evt);
            }
        });

        noAccountLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        noAccountLabel.setForeground(new java.awt.Color(51, 51, 51));
        noAccountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noAccountLabel.setText("¿No tienes cuenta?");

        registerButton.setBackground(new java.awt.Color(217, 217, 217));
        registerButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        registerButton.setForeground(new java.awt.Color(51, 51, 51));
        registerButton.setText("Regístrate");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLoginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
            .addComponent(noAccountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordLabel)
                            .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(showPasswordCheckbox)
                                .addGroup(loginPanelLayout.createSequentialGroup()
                                    .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nameLabel)
                                        .addComponent(emailField)
                                        .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                                    .addGap(10, 10, 10)))))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(loginButton))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(registerButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(titleLoginLabel)
                .addGap(31, 31, 31)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showPasswordCheckbox)
                .addGap(28, 28, 28)
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(noAccountLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerButton)
                .addGap(47, 47, 47))
        );

        add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 59, 360, 580));
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        application.showPage("Register Page");
    }//GEN-LAST:event_registerButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String userEmail = emailField.getText();
        char[] passwordArray = passwordField.getPassword();
        String userPassword = new String(passwordArray);
       
        if (userEmail.isBlank() || userPassword.isBlank()){
            JOptionPane.showMessageDialog(this, "¡Faltan campos por llenar!");
        } else {
            if (jsonModifier.userExists(userEmail, userPassword)){
                JOptionPane.showMessageDialog(this, "¡Bienvenido/a a la aventura!");
                application.showPage("Page 1");
            } else {
                JOptionPane.showMessageDialog(this, "Email o contraseña incorrectos");
                passwordField.setText("");
            }
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void showPasswordCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordCheckboxActionPerformed
        if (showPasswordCheckbox.isSelected()){
            passwordField.setEchoChar((char)0);
        }else{
            passwordField.setEchoChar('*');
        }
    }//GEN-LAST:event_showPasswordCheckboxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailField;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel noAccountLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JCheckBox showPasswordCheckbox;
    private javax.swing.JLabel titleLoginLabel;
    // End of variables declaration//GEN-END:variables

}
