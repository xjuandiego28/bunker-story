package views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Page5 extends javax.swing.JPanel implements KeyListener, ActionListener{
    private final Application application;
    private Timer timer;
    private boolean gameStarted = false;

    public Page5(Application application) {
        this.application = application;
        this.setFocusable(true);
        requestFocus(true);
        addKeyListener(this);
        timer = new Timer(100, this);
        timer.start();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        gameTextLabel = new javax.swing.JLabel();
        gamePanel = new javax.swing.JPanel();
        raceTrack = new javax.swing.JLabel();
        raceCarPlayer = new javax.swing.JLabel();
        raceCarAutomatic = new javax.swing.JLabel();
        startGameButton = new javax.swing.JButton();
        resetGameButton = new javax.swing.JButton();
        resetStoryButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(210, 180, 140));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Lato Black", 0, 48)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 0, 0));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("¡En marcha!");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 320, 79));

        gameTextLabel.setFont(new java.awt.Font("Dosis", 0, 35)); // NOI18N
        gameTextLabel.setForeground(new java.awt.Color(0, 0, 0));
        gameTextLabel.setText("<html><div style='text-align: center;'>Comienza la carrera con el botón. Usa las flechas del teclado para mover tu vehículo (naranja)...\nPreparados... Listos... ¡Fuera! </div></html>");
        jPanel1.add(gameTextLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 1330, 90));

        raceTrack.setBackground(new java.awt.Color(187, 187, 187));
        raceTrack.setIcon(new javax.swing.ImageIcon(".\\src\\main\\java\\resources\\images\\game-race-track.jpg"));
        raceTrack.setText("racetrack");

        raceCarPlayer.setIcon(new javax.swing.ImageIcon(".\\src\\main\\java\\resources\\images\\car1.png"));

        raceCarAutomatic.setIcon(new javax.swing.ImageIcon(".\\src\\main\\java\\resources\\images\\car2.png"));

        javax.swing.GroupLayout gamePanelLayout = new javax.swing.GroupLayout(gamePanel);
        gamePanel.setLayout(gamePanelLayout);
        gamePanelLayout.setHorizontalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(raceCarAutomatic, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(raceCarPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1235, Short.MAX_VALUE))
            .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(gamePanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(raceTrack, javax.swing.GroupLayout.PREFERRED_SIZE, 1350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        gamePanelLayout.setVerticalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(raceCarPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(raceCarAutomatic, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(gamePanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(raceTrack, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(gamePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 1350, 360));

        startGameButton.setBackground(new java.awt.Color(217, 217, 217));
        startGameButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        startGameButton.setForeground(new java.awt.Color(0, 0, 0));
        startGameButton.setText("Iniciar Juego");
        startGameButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        startGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameButtonActionPerformed(evt);
            }
        });
        jPanel1.add(startGameButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 610, 170, 35));

        resetGameButton.setBackground(new java.awt.Color(217, 217, 217));
        resetGameButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        resetGameButton.setForeground(new java.awt.Color(0, 0, 0));
        resetGameButton.setText("Reiniciar Juego");
        resetGameButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetGameButtonActionPerformed(evt);
            }
        });
        jPanel1.add(resetGameButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 580, 170, 35));

        resetStoryButton.setBackground(new java.awt.Color(255, 102, 102));
        resetStoryButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        resetStoryButton.setForeground(new java.awt.Color(0, 0, 0));
        resetStoryButton.setText("Reiniciar Historia");
        resetStoryButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetStoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetStoryButtonActionPerformed(evt);
            }
        });
        jPanel1.add(resetStoryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 630, 170, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void resetGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetGameButtonActionPerformed
        reStartGame();
    }//GEN-LAST:event_resetGameButtonActionPerformed

    private void resetStoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetStoryButtonActionPerformed
        application.setVisible(false);
        Application application = new Application();
        application.showPage("Page 1");
    }//GEN-LAST:event_resetStoryButtonActionPerformed

    private void startGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGameButtonActionPerformed
        gameStarted = true;
        startGameButton.setVisible(false);
        startGameButton.setEnabled(false);
        resetStoryButton.setEnabled(false);
    }//GEN-LAST:event_startGameButtonActionPerformed

    private void reStartGame(){
        gameStarted = false;
        startGameButton.setVisible(true);
        startGameButton.setEnabled(true);
        resetStoryButton.setEnabled(true);
    }
    
    @Override
    public void keyPressed(KeyEvent evt) {
        if (gameStarted) {
            int key = evt.getKeyCode();
            switch (key) {
                case KeyEvent.VK_LEFT:
                    raceCarPlayer.setLocation(raceCarPlayer.getX() - 10, raceCarPlayer.getY());
                    break;
                case KeyEvent.VK_RIGHT:
                    raceCarPlayer.setLocation(raceCarPlayer.getX() + 10, raceCarPlayer.getY());
                    break;
                case KeyEvent.VK_UP:
                    raceCarPlayer.setLocation(raceCarPlayer.getX(), raceCarPlayer.getY() - 10);
                    break;
                case KeyEvent.VK_DOWN:
                    raceCarPlayer.setLocation(raceCarPlayer.getX(), raceCarPlayer.getY() + 10);
                    break;
                default:
                    break;
            }
            
            if (raceCarPlayer.getX() > gamePanel.getWidth() - 120) {
                raceCarPlayer.setLocation(gamePanel.getWidth() - 120, raceCarPlayer.getY());
                gameOver("Jugador");
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent evt) {}

    @Override
    public void keyTyped(KeyEvent evt) {}
    
    public void actionPerformed(ActionEvent evt) {
        if (gameStarted) {            
            raceCarAutomatic.setLocation(raceCarAutomatic.getX() + 5, raceCarAutomatic.getY());
            if (raceCarAutomatic.getX() > gamePanel.getWidth() - 120) {
                raceCarAutomatic.setLocation(gamePanel.getWidth() - 120, raceCarAutomatic.getY());
                gameOver("Máquina");
            }
        }
    }
    
    private void gameOver(String raceWinner) {
        JOptionPane.showMessageDialog(this, "¡El ganador de la carrera es: " + raceWinner + "!");
        reStartGame();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel gamePanel;
    private javax.swing.JLabel gameTextLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel raceCarAutomatic;
    private javax.swing.JLabel raceCarPlayer;
    private javax.swing.JLabel raceTrack;
    private javax.swing.JButton resetGameButton;
    private javax.swing.JButton resetStoryButton;
    private javax.swing.JButton startGameButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}