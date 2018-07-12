/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Mai Perez
 */
public class Primera extends JPanel {
    public int WIDTH = 200;
    public int HEIGHT = 100;
    static JButton White = new JButton("Black!");
    
    public Primera(){
        White.setBounds(10, 30, 190, 50);
        White.setBackground(Color.white);
        White.setForeground(Color.black);
        White.setFont(new Font("arial",Font.BOLD,50));
        
        add(White);
        setBackground(Color.black);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        validate();
    
    }

    public static JButton getWhite() {
        return White;
    }

    public static void setWhite(JButton White) {
        Primera.White = White;
    }
    
    
}
