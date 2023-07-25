/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author LionotRAZAFIMANDIMBY
 */
public class AjoutAffect extends javax.swing.JFrame {

    //code tana
    public static Connection connex = null;
    public static ResultSet resul = null;
    public static PreparedStatement prepare = null;

    static boolean instant;

    int xMouve;
    int yMouve;
    int numEmp;
    String numeroEmp = null;
    String variableLieu;
    String A1;

    //ending
    /**
     * Creates new form AjoutAffect
     */
    public AjoutAffect() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(438, 616);
        connex = Connexion.DBConnexion.connex;
        CheckValueComboBox();
        instant = false;

        /////////// code transparent ///////////
        NumAffect.setOpaque(false);
        NouveauLieu.setOpaque(false);
        AncienLieu.setOpaque(false);
        DateAffect.setOpaque(false);
        DateService.setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        NumAffect = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        AncienLieu = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        DateAffect = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        NouveauLieu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        DateService = new com.toedter.calendar.JDateChooser();
        jAjoutAffect = new javax.swing.JButton();
        jAnnulerAffect = new javax.swing.JButton();
        Fermer = new javax.swing.JLabel();
        Move = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 83, 86));
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 204, 204));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" N° Affectation:");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 140, 37));

        NumAffect.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NumAffect.setForeground(new java.awt.Color(255, 255, 255));
        NumAffect.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NumAffect.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        NumAffect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumAffectActionPerformed(evt);
            }
        });
        kGradientPanel1.add(NumAffect, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 240, 36));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" N° Employe:");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 133, 44));

        AncienLieu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AncienLieu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        AncienLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AncienLieuActionPerformed(evt);
            }
        });
        kGradientPanel1.add(AncienLieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 240, 38));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date Affectation:");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 154, 38));

        DateAffect.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        DateAffect.setDateFormatString("yyyy-MM-dd");
        DateAffect.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kGradientPanel1.add(DateAffect, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 240, 38));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nouveau Lieu:");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 30));

        NouveauLieu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NouveauLieu.setForeground(new java.awt.Color(255, 255, 255));
        NouveauLieu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NouveauLieu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        kGradientPanel1.add(NouveauLieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 240, 39));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date Prise service:");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, 39));

        DateService.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        DateService.setDateFormatString("yyyy-MM-dd");
        DateService.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kGradientPanel1.add(DateService, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 240, 39));

        jAjoutAffect.setText("Ajouter");
        jAjoutAffect.setFocusPainted(false);
        jAjoutAffect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAjoutAffectActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jAjoutAffect, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, 112, 42));

        jAnnulerAffect.setText("Annuler");
        jAnnulerAffect.setFocusPainted(false);
        jAnnulerAffect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnnulerAffectActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jAnnulerAffect, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, 102, 42));

        Fermer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Fermer.setForeground(new java.awt.Color(245, 12, 12));
        Fermer.setText("X");
        Fermer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Fermer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Fermer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FermerMouseClicked(evt);
            }
        });
        kGradientPanel1.add(Fermer, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, 34));

        Move.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MoveMouseDragged(evt);
            }
        });
        Move.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MoveMousePressed(evt);
            }
        });
        kGradientPanel1.add(Move, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 31));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jAjoutAffectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAjoutAffectActionPerformed
        /*Date dateActuelle = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = dateFormat.format(dateActuelle);
        String dateAgain = date;*/

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateService = sdf.format(DateService.getDate());

        SimpleDateFormat affectDate = new SimpleDateFormat("yyyy-MM-dd");
        String dateAffect = affectDate.format(DateAffect.getDate());

        String ancienLieu = AncienLieu.getSelectedItem().toString();

        if (NumAffect.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Veuiller remplir le champs numero");
        } else if (DateService.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Veuiller remplir le champs de la date de service");
        } else if (DateAffect.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Veuiller remplir le champs de la date de affectation");
        } else if (NouveauLieu.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Veuiller remplir le champs nouveau lieu");
        } else if (NumAffect.getText().startsWith(".") || NumAffect.getText().startsWith("+") || NumAffect.getText().startsWith("-") || NumAffect.getText().startsWith(",") || NumAffect.getText().startsWith("/") || NumAffect.getText().startsWith(";")) {
            JOptionPane.showMessageDialog(null, "Le numero du affectation ne peut pas commencer par les symboles '+', '-', ou ','");
        } else if (NouveauLieu.getText().startsWith(".") || NouveauLieu.getText().startsWith("+") || NouveauLieu.getText().startsWith("-") || NouveauLieu.getText().startsWith(",") || NouveauLieu.getText().startsWith("/") || NouveauLieu.getText().startsWith(";")) {
            JOptionPane.showMessageDialog(null, "Le nouveau lieu du affectation ne peut pas commencer par les symboles '+', '-', ou ','");
        } else {
            try {
                String verify = "SELECT COUNT(*) FROM affectations WHERE numAffect = ?";
                prepare = connex.prepareStatement(verify);
                prepare.setString(1, NumAffect.getText());
                resul = prepare.executeQuery();
                int count = 0;
                if (resul.next()) {
                    count = resul.getInt(1);
                }
                resul.close();
                prepare.close();
                if (count > 0) {
                    JOptionPane.showMessageDialog(null, "Le numero Affectations '" + NumAffect.getText() + "' est deja existe ");
                    return;
                } else {

                   
                    boolean employeTrouve = false;  // On ajoute une variable pour vérifier si on trouve un employé correspondant

                    try {
                        String lieuEmp = AncienLieu.getSelectedItem().toString();
                        String query = "SELECT numEmp, Lieu FROM employes WHERE numEmp = ?";
                        prepare = connex.prepareStatement(query);
                        prepare.setString(1, lieuEmp);
                        resul = prepare.executeQuery();
                         numEmp = -1;
                        String numeroEmp = "";

                        if (resul.next()) {
                            numEmp = resul.getInt("numEmp");
                            numeroEmp = resul.getString("Lieu");
                            //JOptionPane.showMessageDialog(null, "Le numéro d'employé est : " + numEmp);
                            employeTrouve = true;  // On met employeTrouve à true si on trouve un employé correspondant
                        }

                        resul.close();
                        prepare.close();

                    } catch (Exception e) {
                        System.out.println(" -->SQLException : " + e);
                    }

                    if (employeTrouve) {  // On affiche le message si employeTrouve est true
                        //JOptionPane.showMessageDialog(null, "Le numéro d'employé correspondant est : " + numeroEmp);
                    } else {
                        //JOptionPane.showMessageDialog(null, "Aucun employé correspondant trouvé.");
                    }

                    
                       
                        String query = "SELECT Lieu FROM employes WHERE numEmp = '"+numEmp+"'";
                        prepare = connex.prepareStatement(query);
                        resul = prepare.executeQuery();

                        if (resul.next()) {
                          A1 = resul.getString("Lieu");
                        System.out.println(A1);
                        //JOptionPane.showMessageDialog(null, "lieu est" +A1);
                        }
                   
                    
                    String request = "INSERT INTO affectations (numAffect,NouveauLieu, numEmp_ref,AncienLieu,dateServices,dateAffect) VALUES (?,?,'" + numEmp + "','" + A1 + "','" + dateService + "','" + dateAffect + "')";

                    prepare = connex.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
                    prepare.setString(1, NumAffect.getText());
                    prepare.setString(2, NouveauLieu.getText());

                    /**/ int idDepartement = -1;

                    if (prepare.executeUpdate() > 0) {
                        resul = prepare.getGeneratedKeys();
                        if (resul.next()) {
                            idDepartement = resul.getInt(1);
                            System.out.println("ID=" + resul.getInt(1));
                        }
                    }

//                    try {
//                        String query = "INSERT INTO missions (numAffect_ref) VALUES ('" + idDepartement + "')";
//                        prepare = connex.prepareStatement(query);
//                        prepare.execute();
//                        System.out.println("cle etranger est:" + query);
//                    } catch (Exception e) {
//                        System.out.println(e);
//                    }
                    // JOptionPane.showMessageDialog(null, "saved successfull !!");
                }

            } catch (Exception e) {
                System.out.println(" -->SQLException : " + e);
            } finally {
                try {
                    prepare.close();
                    resul.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            //JOptionPane.showMessageDialog(null, "Le numéro d'employé correspondant est : " + variableLieu);
            JOptionPane.showMessageDialog(null, "Ajout avac succes !!");
            instant = true;
            this.dispose();

        }
        CheckValueComboBox();

    }//GEN-LAST:event_jAjoutAffectActionPerformed

    private void FermerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FermerMouseClicked
        instant = true;
        this.dispose();
    }//GEN-LAST:event_FermerMouseClicked

    private void MoveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouve, y - yMouve);
    }//GEN-LAST:event_MoveMouseDragged

    private void MoveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveMousePressed
        xMouve = evt.getX();
        yMouve = evt.getY();
    }//GEN-LAST:event_MoveMousePressed

    private void AncienLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AncienLieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AncienLieuActionPerformed

    private void NumAffectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumAffectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumAffectActionPerformed

    public void CheckValueComboBox() {
        try {
            String request = "SELECT numEmp FROM employes";
            prepare = connex.prepareStatement(request);
            resul = prepare.executeQuery();
            while (resul.next()) {
                AncienLieu.addItem(resul.getString("numEmp"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "echec de recuperation");
        }
    }

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
            java.util.logging.Logger.getLogger(AjoutAffect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutAffect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutAffect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutAffect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjoutAffect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AncienLieu;
    private com.toedter.calendar.JDateChooser DateAffect;
    private com.toedter.calendar.JDateChooser DateService;
    private javax.swing.JLabel Fermer;
    private javax.swing.JLabel Move;
    private javax.swing.JTextField NouveauLieu;
    private javax.swing.JTextField NumAffect;
    private javax.swing.JButton jAjoutAffect;
    private javax.swing.JButton jAnnulerAffect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
