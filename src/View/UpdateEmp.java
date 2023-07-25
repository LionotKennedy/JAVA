/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import static View.UpdateEmp.connex;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class UpdateEmp extends javax.swing.JFrame {

    public static Connection connex = null;
    public static ResultSet resul = null;
    public static PreparedStatement prepare = null;
    //ending
    //code tana again
    public String civilite;

    static boolean instant;
    
    public String R1;

    int xMouve;
    int yMouve;

    /**
     * Creates new form UpdateEmp
     */
    public UpdateEmp() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(390, 656);
        connex = Connexion.DBConnexion.connex;
        //recuperation de donnee sur une autre JFrame
        RecuperationDonne();

        instant = false;
        
        /////////// code transparent ///////////
        NumEmp.setOpaque(false);
        nomEmp.setOpaque(false);
        prenomEmp.setOpaque(false);
        posteEmp.setOpaque(false);
        lieuEmp.setOpaque(false);
    }

    public void RecuperationDonne() {
        PrincipalMenu information = new PrincipalMenu();
        information.Recuperation();
        try {
            String recuprer = information.GetTableResult();
            String request = "SELECT * FROM employes WHERE numEmp ='" + recuprer + "' ";
            prepare = connex.prepareStatement(request);
            resul = prepare.executeQuery();
            if (resul.next()) {
                String R1 = resul.getString("numEmp");
                NumEmp.setText(R1);
                System.out.println(R1);

                String R2 = resul.getString("civilite");
                //pour le radio
                String others = R2;
                // JOptionPane.showMessageDialog(null, others);

                if (others.equals("Mr")) {
                    mrEmp.setSelected(true);
                    System.out.println(others);

                } else if (others.equals("Mlle")) {
                    mlleEmp.setSelected(true);
                    System.out.println(others);

                } else {
                    if (others.equals("Mme")) {
                        mmeEmp.setSelected(true);
                        System.out.println(others);
                    }
                }

                String R3 = resul.getString("nomEmp");
                nomEmp.setText(R3);
                System.out.println(R3);

                String R4 = resul.getString("prenomEmp");
                prenomEmp.setText(R4);
                System.out.println(R4);

                String R5 = resul.getString("post");
                posteEmp.setText(R5);
                System.out.println(R5);

                String R6 = resul.getString("lieu");
                lieuEmp.setText(R6);
                System.out.println(R6);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        NumEmp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nomEmp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        prenomEmp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        posteEmp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lieuEmp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mmeEmp = new javax.swing.JRadioButton();
        mlleEmp = new javax.swing.JRadioButton();
        mrEmp = new javax.swing.JRadioButton();
        jEdit = new javax.swing.JButton();
        jAnnuler = new javax.swing.JButton();
        Mouve = new javax.swing.JLabel();
        Closed = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 83, 86));
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 204, 204));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Numero:");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, 40));

        NumEmp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NumEmp.setForeground(new java.awt.Color(255, 255, 255));
        NumEmp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NumEmp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        kGradientPanel1.add(NumEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 250, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nom:");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 100, 40));

        nomEmp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nomEmp.setForeground(new java.awt.Color(255, 255, 255));
        nomEmp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nomEmp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        kGradientPanel1.add(nomEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 250, 36));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pronom:");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 100, 40));

        prenomEmp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        prenomEmp.setForeground(new java.awt.Color(255, 255, 255));
        prenomEmp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        prenomEmp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        kGradientPanel1.add(prenomEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 250, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Poste:");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 100, 40));

        posteEmp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        posteEmp.setForeground(new java.awt.Color(255, 255, 255));
        posteEmp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        posteEmp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        posteEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posteEmpActionPerformed(evt);
            }
        });
        kGradientPanel1.add(posteEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 250, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Lieu:");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 100, 40));

        lieuEmp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lieuEmp.setForeground(new java.awt.Color(255, 255, 255));
        lieuEmp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lieuEmp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        kGradientPanel1.add(lieuEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 250, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Civilité:");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 120, 40));

        buttonGroup1.add(mmeEmp);
        mmeEmp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mmeEmp.setForeground(new java.awt.Color(255, 255, 255));
        mmeEmp.setText("Mme");
        mmeEmp.setContentAreaFilled(false);
        mmeEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmeEmpActionPerformed(evt);
            }
        });
        kGradientPanel1.add(mmeEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, -1));

        buttonGroup1.add(mlleEmp);
        mlleEmp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mlleEmp.setForeground(new java.awt.Color(255, 255, 255));
        mlleEmp.setText("Mlle");
        mlleEmp.setContentAreaFilled(false);
        mlleEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mlleEmpActionPerformed(evt);
            }
        });
        kGradientPanel1.add(mlleEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, -1, -1));

        buttonGroup1.add(mrEmp);
        mrEmp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mrEmp.setForeground(new java.awt.Color(255, 255, 255));
        mrEmp.setText("Mr");
        mrEmp.setContentAreaFilled(false);
        mrEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mrEmpActionPerformed(evt);
            }
        });
        kGradientPanel1.add(mrEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 50, -1));

        jEdit.setText("Modifier");
        jEdit.setFocusPainted(false);
        jEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 570, 110, 40));

        jAnnuler.setText("Annuler");
        jAnnuler.setFocusPainted(false);
        jAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnnulerActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jAnnuler, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, 110, 40));

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
        kGradientPanel1.add(Mouve, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 30));

        Closed.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Closed.setForeground(new java.awt.Color(253, 8, 8));
        Closed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Closed.setText("X");
        Closed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Closed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClosedMouseClicked(evt);
            }
        });
        kGradientPanel1.add(Closed, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean isInstant() {
        return instant;
    }
    private void posteEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posteEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_posteEmpActionPerformed

    private void mmeEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmeEmpActionPerformed
        civilite = "Mme";
        // TODO add your handling code here:
    }//GEN-LAST:event_mmeEmpActionPerformed

    private void mlleEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mlleEmpActionPerformed
        civilite = "Mlle";
        // TODO add your handling code here:
    }//GEN-LAST:event_mlleEmpActionPerformed

    private void mrEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mrEmpActionPerformed
        civilite = "Mr";
        // TODO add your handling code here:
    }//GEN-LAST:event_mrEmpActionPerformed

    private void jEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditActionPerformed
        
        String M1 = NumEmp.getText();
        String M2 = nomEmp.getText();
        String M3 = prenomEmp.getText();
        String M4 = posteEmp.getText();
        String M5 = lieuEmp.getText();

        String M6 = null;
        if (mrEmp.isSelected()) {
            M6 = mrEmp.getText();
        } else if (mlleEmp.isSelected()) {
            M6 = mlleEmp.getText();
        } else if (mmeEmp.isSelected()) {
            M6 = mmeEmp.getText();
        } else {
            M6 = civilite;
        }
        System.out.println("La valeur sélectionnée est : " + M6);

        System.out.println(M1);
        System.out.println(M2);
        System.out.println(M3);
        System.out.println(M4);
        System.out.println(M5);
       // JOptionPane.showMessageDialog(null, M6);

        
        
        PrincipalMenu information = new PrincipalMenu();
        information.Recuperation();
        try {
            String recuprer = information.GetTableResult();
            String request = "SELECT * FROM employes WHERE numEmp ='" + recuprer + "' ";
            prepare = connex.prepareStatement(request);
            resul = prepare.executeQuery();
            if (resul.next()) {
                      R1 = resul.getString("numEmp");
                //NumEmp.setText(R1);
                //System.out.println(R1);
                //JOptionPane.showMessageDialog(null, R1);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

      
        //String numEmpAvantModification = NumEmp.getText();
        String numEmpAvantModification = R1;
        // Vérification si le numéro d'employé a été modifié
        //JOptionPane.showMessageDialog(null, R1);
       // JOptionPane.showMessageDialog(null, M1);
        if (!M1.equals(numEmpAvantModification)) {
            JOptionPane.showMessageDialog(null, "Vous ne pouvez pas modifier le numéro qui est egal '"+R1+"' d'employé");
            return;
        }
        
        String request = "UPDATE employes SET numEmp='" + M1 + "', civilite='" + M6 + "',nomEmp='" + M2 + "',prenomEmp='" + M3 + "',post='" + M4 + "',lieu='" + M5 + "' WHERE numEmp='" + M1 + "' ";
        try {
            prepare = connex.prepareStatement(request);
            prepare.execute();
            JOptionPane.showMessageDialog(null, "Modification avec succes");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        //JOptionPane.showMessageDialog(null, M1);
        //JOptionPane.showMessageDialog(null, M5);
        String Query = "UPDATE affectations SET AncienLieu='" + M5 + "' WHERE numEmp_ref='" + M1 + "' ";
        try {
            prepare = connex.prepareStatement(Query);
            prepare.execute();
            //JOptionPane.showMessageDialog(null, "Modification avec succes");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        instant = true;
        this.dispose();
    }//GEN-LAST:event_jEditActionPerformed

    private void jAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnnulerActionPerformed
        instant = true;
        this.dispose();
    }//GEN-LAST:event_jAnnulerActionPerformed

    private void MouveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouveMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouve, y - yMouve);
    }//GEN-LAST:event_MouveMouseDragged

    private void MouveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouveMousePressed
        xMouve = evt.getX();
        yMouve = evt.getY();
    }//GEN-LAST:event_MouveMousePressed

    private void ClosedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClosedMouseClicked
        instant = true;
        this.dispose();
    }//GEN-LAST:event_ClosedMouseClicked

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
            java.util.logging.Logger.getLogger(UpdateEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Closed;
    private javax.swing.JLabel Mouve;
    private javax.swing.JTextField NumEmp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jAnnuler;
    private javax.swing.JButton jEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField lieuEmp;
    private javax.swing.JRadioButton mlleEmp;
    private javax.swing.JRadioButton mmeEmp;
    private javax.swing.JRadioButton mrEmp;
    private javax.swing.JTextField nomEmp;
    private javax.swing.JTextField posteEmp;
    private javax.swing.JTextField prenomEmp;
    // End of variables declaration//GEN-END:variables
}
