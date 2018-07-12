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
        A.setContentPane(new Primera());
        A.pack();
        A.setLocation(40, 40);
        A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        A.setVisible(true);
        
        B.setResizable(false);
        B.setContentPane(new Segunda());
        B.pack();
        B.setLocation(600, 40);
        B.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        B.setVisible(true);
    }
    
}
