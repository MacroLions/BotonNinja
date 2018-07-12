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
public class Segunda extends JPanel {
    public int WIDTH = 200;
    public int HEIGHT = 100;
    static JButton Black = new JButton("White");
    
    public Segunda(){
        Black.setBounds(10, 30, 190, 50);
        Black.setBackground(Color.black);
        Black.setForeground(Color.white);
        Black.setFont(new Font("arial",Font.BOLD,50));
        
        add(Black);
        Black.setVisible(false);
        setBackground(Color.white);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        validate();
    
    }

    public static JButton getBlack() {
        return Black;
    }

    public static void setBlack(JButton Black) {
        Segunda.Black = Black;
    }
    
    
}
