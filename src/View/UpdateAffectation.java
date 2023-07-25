/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author LionotRAZAFIMANDIMBY
 */
public class UpdateAffectation extends javax.swing.JFrame {

    public static Connection connex = null;
    public static ResultSet resul = null;
    public static PreparedStatement prepare = null;

    public String L1;
    static boolean instant;
    int xMouve;
    int yMouve;
    String T1;

    /**
     * Creates new form UpdateAffectation
     */
    public UpdateAffectation() {
        initComponents();
        this.setLocationRelativeTo(null);
        connex = Connexion.DBConnexion.connex;
        //recuperation de donnee sur une autre JFrame
        RecuperationDonneAffectation();

        instant = false;
        
        /////////// code transparent ///////////
        NumAffect.setOpaque(false);
        NouveauLieu.setOpaque(false);
        AncienLieu.setOpaque(false);
        DateAffect.setOpaque(false);
        DateService.setOpaque(false);
    }

    public void RecuperationDonneAffectation() {
        PrincipalMenu information = new PrincipalMenu();
        information.RecuperationAffectation();
        try {
            String recuprer = information.GetTableAffectationResult();
            String request = "SELECT * FROM affectations WHERE numAffect ='" + recuprer + "' ";
            prepare = connex.prepareStatement(request);
            resul = prepare.executeQuery();
            if (resul.next()) {
                String A1 = resul.getString("numAffect");
                NumAffect.setText(A1);

                String A2 = resul.getString("numEmp_ref");
                AncienLieu.setSelectedItem(A2);
                System.out.println(A2);
                //JOptionPane.showMessageDialog(null, A2);

                String A3 = resul.getString("NouveauLieu");
                NouveauLieu.setText(A3);
                System.out.println(A3);

                Date A4 = resul.getDate("dateAffect");
                DateAffect.setDate(A4);

                Date A5 = resul.getDate("dateServices");
                DateService.setDate(A5);

                //debut
                try {

                    String A6 = resul.getString("numEmp_ref");

                    /////// code recuperation de donnee (all list) ////////
                    String requeste = "SELECT numEmp FROM employes";
                    prepare = connex.prepareStatement(requeste);
                    resul = prepare.executeQuery();
                    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
                    String selectedValue = A2;

                    model.addElement(selectedValue);

                    while (resul.next()) {
                        String lieu = resul.getString("numEmp");
                        if (!lieu.equals(selectedValue)) {
                            model.addElement(lieu);
                        }
                    }

                    AncienLieu.setModel(model); // Définir le modèle dans le JComboBox
                    /////// ending code /////////

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "echec de recuperation");
                }
                //ending
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        NumAffect = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        AncienLieu = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        NouveauLieu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jAnnulerAffect = new javax.swing.JButton();
        jEditAffect = new javax.swing.JButton();
        closed = new javax.swing.JLabel();
        Mouve = new javax.swing.JLabel();
        DateAffect = new com.toedter.calendar.JDateChooser();
        DateService = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 83, 86));
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 204, 204));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" N° Affectation:");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 140, 50));

        NumAffect.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NumAffect.setForeground(new java.awt.Color(255, 255, 255));
        NumAffect.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NumAffect.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        kGradientPanel1.add(NumAffect, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 240, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" N° Employe:");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 130, 40));

        AncienLieu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AncienLieu.setForeground(new java.awt.Color(0, 0, 0));
        AncienLieu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        AncienLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AncienLieuActionPerformed(evt);
            }
        });
        kGradientPanel1.add(AncienLieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 240, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nouveau Lieu:");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 130, 40));

        NouveauLieu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NouveauLieu.setForeground(new java.awt.Color(255, 255, 255));
        NouveauLieu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NouveauLieu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        kGradientPanel1.add(NouveauLieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 240, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date Affectation");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 150, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date Prise service:");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 160, 50));

        jAnnulerAffect.setText("Annuler");
        jAnnulerAffect.setFocusPainted(false);
        jAnnulerAffect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnnulerAffectActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jAnnulerAffect, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 520, 120, 40));

        jEditAffect.setText("Modifier");
        jEditAffect.setFocusPainted(false);
        jEditAffect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditAffectActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jEditAffect, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 111, 40));

        closed.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        closed.setForeground(new java.awt.Color(242, 10, 10));
        closed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closed.setText("X");
        closed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closedMouseClicked(evt);
            }
        });
        kGradientPanel1.add(closed, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 30, 30));

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
        kGradientPanel1.add(Mouve, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 30));

        DateAffect.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        DateAffect.setForeground(new java.awt.Color(0, 0, 0));
        DateAffect.setDateFormatString("yyyy-MM-dd");
        DateAffect.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kGradientPanel1.add(DateAffect, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 240, 40));

        DateService.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        DateService.setForeground(new java.awt.Color(0, 0, 0));
        DateService.setDateFormatString("yyyy-MM-dd");
        DateService.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kGradientPanel1.add(DateService, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 240, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean isInstant() {
        return instant;
    }
    private void jAnnulerAffectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnnulerAffectActionPerformed
        instant = true;
        this.dispose();
    }//GEN-LAST:event_jAnnulerAffectActionPerformed

    private void jEditAffectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditAffectActionPerformed
        try {                                            
            String A1 = NumAffect.getText();
            String A2 = (String) AncienLieu.getSelectedItem();
            String A3 = NouveauLieu.getText();
            Date A4 = DateAffect.getDate();
            Date A5 = DateService.getDate();
            System.out.println(A1);
            System.out.println(A2);
            System.out.println(A3);
            System.out.println(A4);
            System.out.println(A5);
            //JOptionPane.showMessageDialog(null, "echec de recuperation" +A2);
            
            String query = "SELECT Lieu FROM employes WHERE numEmp = '" + A2 + "'";           
                prepare = connex.prepareStatement(query);
            
            resul = prepare.executeQuery();
            
            if (resul.next()) {
                T1 = resul.getString("Lieu");
                System.out.println(T1);
               // JOptionPane.showMessageDialog(null, "lieu est" +T1);
            }
            
            //JOptionPane.showMessageDialog(null, "echec de recuperation" +T1);
            
            
            
            PrincipalMenu information = new PrincipalMenu();
            information.RecuperationAffectation();
            try {
                String recuprer = information.GetTableAffectationResult();
                String request = "SELECT * FROM affectations WHERE numAffect ='" + recuprer + "' ";
                prepare = connex.prepareStatement(request);
                resul = prepare.executeQuery();
                if (resul.next()) {
                    L1 = resul.getString("numAffect");
                    NumAffect.setText(A1);
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
            
            
            String NumAffectAvantModification = L1;
            if (!A1.equals(NumAffectAvantModification)) {
                JOptionPane.showMessageDialog(null, "Vous ne pouvez pas modifier le numéro qui est egal '"+L1+"' d'affectations");
                return;
            }
            String request = "UPDATE affectations SET numAffect='" + A1 + "', numEmp_ref='" + A2 + "', AncienLieu='" + T1 + "',NouveauLieu='" + A3 + "',dateAffect ='" + A4 + "',dateServices='" + A5 + "' WHERE numAffect='" + A1 + "' ";
            try {
                prepare = connex.prepareStatement(request);
                prepare.execute();
                JOptionPane.showMessageDialog(null, "Modification avec succes");
            } catch (SQLException ex) {
                System.out.println(ex);
            }
            instant = true;
            this.dispose();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UpdateAffectation.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jEditAffectActionPerformed

    private void closedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closedMouseClicked
        instant = true;
        this.dispose();
    }//GEN-LAST:event_closedMouseClicked

    private void MouveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouveMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouve, y - yMouve);
    }//GEN-LAST:event_MouveMouseDragged

    private void MouveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouveMousePressed
        xMouve = evt.getX();
        yMouve = evt.getY();
    }//GEN-LAST:event_MouveMousePressed

    private void AncienLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AncienLieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AncienLieuActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateAffectation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateAffectation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateAffectation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateAffectation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateAffectation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AncienLieu;
    private com.toedter.calendar.JDateChooser DateAffect;
    private com.toedter.calendar.JDateChooser DateService;
    private javax.swing.JLabel Mouve;
    private javax.swing.JTextField NouveauLieu;
    private javax.swing.JTextField NumAffect;
    private javax.swing.JLabel closed;
    private javax.swing.JButton jAnnulerAffect;
    private javax.swing.JButton jEditAffect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
