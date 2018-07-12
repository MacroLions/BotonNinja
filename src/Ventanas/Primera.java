/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author Mai Perez
 */
public class Primera extends JPanel {
    public int WIDTH = 500;
    public int HEIGHT = 500;
    
    public Primera(){
        setBackground(Color.black);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        validate();
    
    }
}
