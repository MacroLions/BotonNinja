package botonninja;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mai Perez
 */
public class Auxiliar {
    public static void ConfiguracionNinja(JButton BotonModificable, JButton BotonAccion){
        BotonAccion.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                BotonModificable.setVisible(true);
                BotonAccion.setVisible(false);
            }
        });
    }
}
