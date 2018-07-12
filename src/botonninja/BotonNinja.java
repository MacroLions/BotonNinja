/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botonninja;

import Ventanas.Primera;
import Ventanas.Segunda;
import javax.swing.JFrame;

/**
 *
 * @author Mai Perez
 */
public class BotonNinja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame A = new JFrame("A"), B = new JFrame("B");
        A.setResizable(false);
        A.setLocation(40, 40);
        A.setContentPane(new Primera());
        A.pack();
        A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        A.setVisible(true);
        Auxiliar.ConfiguracionNinja(Segunda.getBlack(),Primera.getWhite());
        
        B.setResizable(false);
        B.setLocation(260, 40);
        B.setContentPane(new Segunda());
        B.pack();
        B.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        B.setVisible(true);
        Auxiliar.ConfiguracionNinja(Primera.getWhite(),Segunda.getBlack());
    }
    
}
