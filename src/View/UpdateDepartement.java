/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author LionotRAZAFIMANDIMBY
 */
public class UpdateDepartement extends javax.swing.JFrame {

    public static Connection connex = null;
    public static ResultSet resul = null;
    public static PreparedStatement prepare = null;

    static boolean instant;

    int xMouve;
    int yMouve;

    /**
     * Creates new form UpdateDepartement
     */
    public UpdateDepartement() {
        initComponents();
        this.setLocationRelativeTo(null);
        connex = Connexion.DBConnexion.connex;
        RecuperationDonneDepartement();
        instant = false;
        
/////////// code transparent ///////////
        jNomdepartement.setOpaque(false);
        jDecrip.setOpaque(false);
        jPosteDepart.setOpaque(false);
        jLieuDepart.setOpaque(false);
    }

    public void RecuperationDonneDepartement() {
        PrincipalMenu information = new PrincipalMenu();
        information.RecuperationDepartement();
        try {
            String recuprer = information.GetTableDepartemnet();
            String request = "SELECT * FROM departements WHERE idDepart ='" + recuprer + "' ";
            prepare = connex.prepareStatement(request);
            resul = prepare.executeQuery();
            if (resul.next()) {
                String A1 = resul.getString("NomDepart");
                jNomdepartement.setText(A1);
                System.out.println(A1);

                String A2 = resul.getString("DescrDepart");
                jDecrip.setText(A2);
                System.out.println(A2);

                String A3 = resul.getString("LieuDepart");
                jLieuDepart.setText(A3);
                System.out.println(A3);

                String A4 = resul.getString("PosteExist");
                jPosteDepart.setText(A4);
                System.out.println(A4);

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLieuDepart = new javax.swing.JTextField();
        jEditDepart = new javax.swing.JButton();
        jAnnulerDepart = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jNomdepartement = new javax.swing.JTextField();
        jDecrip = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPosteDepart = new javax.swing.JTextField();
        Closed = new javax.swing.JLabel();
        Mouve = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 83, 86));
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 204, 204));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Lieu:");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 346, 80, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Poste:");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 80, 40));

        jLieuDepart.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLieuDepart.setForeground(new java.awt.Color(255, 255, 255));
        jLieuDepart.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jLieuDepart.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jLieuDepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLieuDepartActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jLieuDepart, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 250, 40));

        jEditDepart.setText("Modifier");
        jEditDepart.setFocusPainted(false);
        jEditDepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditDepartActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jEditDepart, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 110, 40));

        jAnnulerDepart.setText("Annuler");
        jAnnulerDepart.setFocusPainted(false);
        jAnnulerDepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnnulerDepartActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jAnnulerDepart, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 100, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nom:");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, 40));

        jNomdepartement.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jNomdepartement.setForeground(new java.awt.Color(255, 255, 255));
        jNomdepartement.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jNomdepartement.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        kGradientPanel1.add(jNomdepartement, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 120, 250, 40));

        jDecrip.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jDecrip.setForeground(new java.awt.Color(255, 255, 255));
        jDecrip.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jDecrip.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        kGradientPanel1.add(jDecrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 200, 250, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Description:");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 110, 40));

        jPosteDepart.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPosteDepart.setForeground(new java.awt.Color(255, 255, 255));
        jPosteDepart.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPosteDepart.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPosteDepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPosteDepartActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jPosteDepart, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 250, 40));

        Closed.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Closed.setForeground(new java.awt.Color(255, 1, 1));
        Closed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Closed.setText("X");
        Closed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Closed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClosedMouseClicked(evt);
            }
        });
        kGradientPanel1.add(Closed, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 30, 40));

        Mouve.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MouveMouseDragged(evt);
            }
        });
        Mouve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MouveMousePressed(evt);
            }
        });
        kGradientPanel1.add(Mouve, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean isInstant() {
        return instant;
    }
    private void jPosteDepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPosteDepartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPosteDepartActionPerformed

    private void jAnnulerDepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnnulerDepartActionPerformed
        instant = true;
        this.dispose();
    }//GEN-LAST:event_jAnnulerDepartActionPerformed

    private void jEditDepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditDepartActionPerformed

        String A1 = jNomdepartement.getText();
        String A2 = jDecrip.getText();
        String A3 = jPosteDepart.getText();
        String A4 = jLieuDepart.getText();

        System.out.println(A1);
        System.out.println(A2);
        System.out.println(A3);
        System.out.println(A4);

        PrincipalMenu information = new PrincipalMenu();
        information.RecuperationDepartement();

        String recuprer = information.GetTableDepartemnet();

        String request = "UPDATE departements SET NomDepart='" + A1 + "', DescrDepart='" + A2 + "',PosteExist='" + A3 + "',LieuDepart ='" + A4 + "' WHERE idDepart='" + recuprer + "' ";
        try {
            prepare = connex.prepareStatement(request);
            prepare.execute();
            JOptionPane.showMessageDialog(null, "Modification avec succes");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        instant = true;
        this.dispose();
    }//GEN-LAST:event_jEditDepartActionPerformed

    private void jLieuDepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLieuDepartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLieuDepartActionPerformed

    private void ClosedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClosedMouseClicked
        instant = true;
        this.dispose();
    }//GEN-LAST:event_ClosedMouseClicked

    private void MouveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouveMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouve, y - yMouve);
    }//GEN-LAST:event_MouveMouseDragged

    private void MouveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouveMousePressed
        xMouve = evt.getX();
        yMouve = evt.getY();
    }//GEN-LAST:event_MouveMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateDepartement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDepartement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDepartement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDepartement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDepartement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Closed;
    private javax.swing.JLabel Mouve;
    private javax.swing.JButton jAnnulerDepart;
    private javax.swing.JTextField jDecrip;
    private javax.swing.JButton jEditDepart;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jLieuDepart;
    private javax.swing.JTextField jNomdepartement;
    private javax.swing.JTextField jPosteDepart;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
