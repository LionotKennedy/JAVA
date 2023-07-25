/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionemployee;

import Connexion.DBConnexion;
import View.PrincipalMenu;
//import View.MenuPrincipal;

/**
 *
 * @author LionotRAZAFIMANDIMBY
 */
public class GestionEmployee {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        DBConnexion.LoadConnexion();
        PrincipalMenu principal = new PrincipalMenu();
//        menu.show();
        principal.setVisible(true);
    }
    
}
