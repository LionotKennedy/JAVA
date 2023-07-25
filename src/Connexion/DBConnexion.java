/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connexion;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LionotRAZAFIMANDIMBY
 */
public class DBConnexion {
    public static Connection connex = null;
    
    public static void LoadConnexion() throws ClassNotFoundException{
        try{
            Class.forName("org.postgresql.Driver");
            connex = DriverManager.getConnection("jdbc:postgresql://localhost:5432/gestion_affectation","postgres","lionot");
            
            if(connex!=null)
            {
                JOptionPane.showMessageDialog(null, "database has been successfully connected");
                 System.out.println("Connexion is stable");
            }
           
            else
            {
                System.out.println("Connexion is failed");
            }
        }
        catch(HeadlessException | SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "error in database loading " +e); 
        }
    }
    
}
