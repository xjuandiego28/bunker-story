package views;

import controllers.JsonController;
import javax.swing.JOptionPane;
import models.User;

public class RegisterPage extends javax.swing.JPanel {
    private final Application application;
    private final JsonController jsonModifier = new JsonController(); 
    public RegisterPage(Application application) {
        this.application = application;
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        titleLoginLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        registerButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        noAccountLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(210, 180, 140));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPanel.setBackground(new java.awt.Color(193, 154, 107));
        loginPanel.setPreferredSize(new java.awt.Dimension(360, 580));

        titleLoginLabel.setFont(new java.awt.Font("Dosis", 0, 35)); // NOI18N
        titleLoginLabel.setForeground(new java.awt.Color(51, 51, 51));
        titleLoginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLoginLabel.setText("¡Bienvenido/a!");

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(51, 51, 51));
        nameLabel.setText("Nombre:");

        nameField.setBackground(new java.awt.Color(217, 217, 217));
        nameField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameField.setForeground(new java.awt.Color(51, 51, 51));

        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(51, 51, 51));
        emailLabel.setText("Email:");

        emailField.setBackground(new java.awt.Color(217, 217, 217));
        emailField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailField.setForeground(new java.awt.Color(51, 51, 51));

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(51, 51, 51));
        passwordLabel.setText("Contraseña:");

        passwordField.setBackground(new java.awt.Color(217, 217, 217));
        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordField.setForeground(new java.awt.Color(51, 51, 51));

        registerButton.setBackground(new java.awt.Color(217, 217, 217));
        registerButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        registerButton.setForeground(new java.awt.Color(51, 51, 51));
        registerButton.setText("Registrarme");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(217, 217, 217));
        loginButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(51, 51, 51));
        loginButton.setText("Iniciar Sesión");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        noAccountLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        noAccountLabel.setForeground(new java.awt.Color(51, 51, 51));
        noAccountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noAccountLabel.setText("¿Ya tienes cuenta?");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLoginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(noAccountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordLabel)
                            .addComponent(emailLabel))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(loginButton))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
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
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerButton)
                .addGap(65, 65, 65)
                .addComponent(noAccountLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginButton)
                .addGap(47, 47, 47))
        );

        add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 59, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        application.showPage("Login Page");
    }//GEN-LAST:event_loginButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        String userName = nameField.getText();
        String userEmail = emailField.getText();
        char[] passwordArray = passwordField.getPassword();
        String userPassword = new String(passwordArray);
        
        if (userName.isBlank() || userEmail.isBlank() || userPassword.isBlank()){
            JOptionPane.showMessageDialog(this, "¡Faltan campos por llenar!");
        } else {
            if (jsonModifier.userExists(userEmail, userPassword)){
                JOptionPane.showMessageDialog(this, "Tu cuenta ya existe, por favor inicia sesión");
                this.eraseFields();
                application.showPage("Login Page");
            } else {
                User currentUser = new User(userName,userEmail,userPassword);
                jsonModifier.createUser(currentUser);
                JOptionPane.showMessageDialog(this, "¡Bienvenido/a a la aventura!");
                application.showPage("Page 1");
            }
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void eraseFields(){
        nameField.setText("");
        emailField.setText("");
        passwordField.setText("");
    }
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel noAccountLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel titleLoginLabel;
    // End of variables declaration//GEN-END:variables
}
