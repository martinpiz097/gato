/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.martin.gato.gui;

import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import org.martin.gato.base.Figure;
import org.martin.gato.base.Game;
import org.martin.gato.base.Player;
import org.martin.gato.base.Point;

/**
 *
 * @author martin
 */
public class FormMain extends javax.swing.JFrame {

    Game game;
    static final int YES_OPTION = JOptionPane.YES_OPTION; 
    
    public FormMain() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        formGato.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        formGato = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        btnF0C0 = new javax.swing.JButton();
        btnF0C1 = new javax.swing.JButton();
        btnF0C2 = new javax.swing.JButton();
        btnF1C0 = new javax.swing.JButton();
        btnF1C1 = new javax.swing.JButton();
        btnF1C2 = new javax.swing.JButton();
        btnF2C0 = new javax.swing.JButton();
        btnF2C1 = new javax.swing.JButton();
        btnF2C2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblCurrentPlayer = new javax.swing.JLabel();
        lblCantGames = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtGamer1 = new javax.swing.JTextField();
        txtGamer2 = new javax.swing.JTextField();
        btnPlay = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        opX = new javax.swing.JRadioButton();
        opO = new javax.swing.JRadioButton();

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.green, null));
        jPanel2.setLayout(new java.awt.GridLayout(3, 3));

        btnF0C0.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 255), null));
        btnF0C0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF0C0ActionPerformed(evt);
            }
        });
        jPanel2.add(btnF0C0);

        btnF0C1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 255), null));
        btnF0C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF0C1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnF0C1);

        btnF0C2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 255), null));
        btnF0C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF0C2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnF0C2);

        btnF1C0.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 255), null));
        btnF1C0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF1C0ActionPerformed(evt);
            }
        });
        jPanel2.add(btnF1C0);

        btnF1C1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 255), null));
        btnF1C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF1C1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnF1C1);

        btnF1C2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 255), null));
        btnF1C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF1C2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnF1C2);

        btnF2C0.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 255), null));
        btnF2C0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF2C0ActionPerformed(evt);
            }
        });
        jPanel2.add(btnF2C0);

        btnF2C1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 255), null));
        btnF2C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF2C1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnF2C1);

        btnF2C2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 255), null));
        btnF2C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF2C2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnF2C2);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Juego"));

        jLabel4.setText("Juega: ");

        jLabel5.setText("N° de jugadas: ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCurrentPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCantGames, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(lblCurrentPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblCantGames, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout formGatoLayout = new javax.swing.GroupLayout(formGato.getContentPane());
        formGato.getContentPane().setLayout(formGatoLayout);
        formGatoLayout.setHorizontalGroup(
            formGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formGatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formGatoLayout.setVerticalGroup(
            formGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formGatoLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Jugadores"));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setText("Nombre Jugador 1: ");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel2.setText("Nombre Jugador 2: ");

        txtGamer1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGamer1KeyReleased(evt);
            }
        });

        txtGamer2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGamer2KeyReleased(evt);
            }
        });

        btnPlay.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        btnPlay.setText("Jugar");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel3.setText("Figura: ");

        buttonGroup1.add(opX);
        opX.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        opX.setSelected(true);
        opX.setText("X");

        buttonGroup1.add(opO);
        opO.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        opO.setText("O");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtGamer1)
                    .addComponent(txtGamer2, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(btnPlay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opX)
                .addGap(18, 18, 18)
                .addComponent(opO))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtGamer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(opX)
                    .addComponent(opO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtGamer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPlay)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed

        String name1 = txtGamer1.getText().trim();
        String name2 = txtGamer2.getText().trim();
        
        if (name1.isEmpty() || name2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Uno de los campos esta vacío");
            txtGamer1.requestFocus();
            txtGamer1.selectAll();
        }
        else{
            Figure figurePlayer1;
            Figure figurePlayer2;
            
            if (opX.isSelected()) {
                figurePlayer1 = Figure.CROSS;
                figurePlayer2 = Figure.CIRCLE;
            }
            else{
                figurePlayer1 = Figure.CIRCLE;
                figurePlayer2 = Figure.CROSS;
            }
            
            Player player1 = new Player(name1, figurePlayer1, true, 0);
            Player player2 = new Player(name2, figurePlayer2);
            txtGamer1.setText(null);
            txtGamer2.setText(null);
            JButton[][] buttons = new JButton[3][3];
            buttons[0][0] = btnF0C0;
            buttons[0][1] = btnF0C1;
            buttons[0][2] = btnF0C2;
            buttons[1][0] = btnF1C0;
            buttons[1][1] = btnF1C1;
            buttons[1][2] = btnF1C2;
            buttons[2][0] = btnF2C0;
            buttons[2][1] = btnF2C1;
            buttons[2][2] = btnF2C2;
            game = new Game(player1, player2, buttons);
            formGato.setSize(formGato.getPreferredSize());
            formGato.setResizable(false);
            formGato.setLocationRelativeTo(null);
            formGato.show();
            hide();
        }
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnF0C0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF0C0ActionPerformed
        execPlay(new Point(0, 0));
    }//GEN-LAST:event_btnF0C0ActionPerformed

    private void btnF0C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF0C1ActionPerformed
        execPlay(new Point(0, 1));
    }//GEN-LAST:event_btnF0C1ActionPerformed

    private void btnF0C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF0C2ActionPerformed
        execPlay(new Point(0, 2));
    }//GEN-LAST:event_btnF0C2ActionPerformed

    private void btnF1C0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF1C0ActionPerformed
        execPlay(new Point(1, 0));
    }//GEN-LAST:event_btnF1C0ActionPerformed

    private void btnF1C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF1C1ActionPerformed
        execPlay(new Point(1, 1));
    }//GEN-LAST:event_btnF1C1ActionPerformed

    private void btnF1C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF1C2ActionPerformed
        execPlay(new Point(1, 2));
    }//GEN-LAST:event_btnF1C2ActionPerformed

    private void btnF2C0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF2C0ActionPerformed
        execPlay(new Point(2, 0));
    }//GEN-LAST:event_btnF2C0ActionPerformed

    private void btnF2C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF2C1ActionPerformed
        execPlay(new Point(2, 1));
    }//GEN-LAST:event_btnF2C1ActionPerformed

    private void btnF2C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF2C2ActionPerformed
        execPlay(new Point(2, 2));
    }//GEN-LAST:event_btnF2C2ActionPerformed

    private void txtGamer1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGamer1KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtGamer2.requestFocus();
            txtGamer2.selectAll();
        }
    }//GEN-LAST:event_txtGamer1KeyReleased

    private void txtGamer2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGamer2KeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) 
            btnPlay.doClick();
    }//GEN-LAST:event_txtGamer2KeyReleased

    private void execPlay(Point p){
        if (game.isValidPlay(p)) {
            game.placeFigure(game.getCurrentPlayer().getFigure(), p);
            
            if (game.hasWinner() || game.hasEmpate()) {
                if (game.hasWinner()) {
                    JOptionPane.showMessageDialog(
                            formGato,
                            "Juego terminado.\nGanador: " + game.getCurrentPlayer());
                }
                else{
                    JOptionPane.showMessageDialog(
                            formGato,
                            "Juego terminado.\nEmpate");
                }
                
                int option = JOptionPane.showConfirmDialog(formGato, "¿Desea jugar de nuevo?");
                
                if (option == YES_OPTION) {
                    
                    int playAgain = JOptionPane.showConfirmDialog(formGato, "¿Desea jugar con los mismos jugadores?");
                    game.resetAll();
                    if (playAgain == YES_OPTION) {
                        lblCurrentPlayer.setText(game.getCurrentPlayer().getName());
                    }
                    else{
                        game = null;
                        formGato.hide();
                        opX.setSelected(true);
                        show();
                        txtGamer1.requestFocus();
                    }
                }
                else
                    System.exit(0);
                
            }
            else {
                game.setTurn();
                lblCurrentPlayer.setText(game.getCurrentPlayer().toString());
            }
        }
        else
            JOptionPane.showMessageDialog(formGato, "Jugada inválida");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel(new javax.swing.plaf.nimbus.NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(FormMain.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FormMain().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnF0C0;
    private javax.swing.JButton btnF0C1;
    private javax.swing.JButton btnF0C2;
    private javax.swing.JButton btnF1C0;
    private javax.swing.JButton btnF1C1;
    private javax.swing.JButton btnF1C2;
    private javax.swing.JButton btnF2C0;
    private javax.swing.JButton btnF2C1;
    private javax.swing.JButton btnF2C2;
    private javax.swing.JButton btnPlay;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFrame formGato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCantGames;
    private javax.swing.JLabel lblCurrentPlayer;
    private javax.swing.JRadioButton opO;
    private javax.swing.JRadioButton opX;
    private javax.swing.JTextField txtGamer1;
    private javax.swing.JTextField txtGamer2;
    // End of variables declaration//GEN-END:variables
}
