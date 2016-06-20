/* ************************************************************************** */
/*                                                                            */
/*   View.java                         $$$$$$$$\ $$\   $$\ $$$$$$\  $$$$$$\   */
/*                                     $$  _____|$$ |  $$ |\_$$  _|$$  __$$ | */
/*   Author: Erwan PLESSIS             $$ |      \$$\ $$  |  $$ |  $$ /  $$ | */
/*                                     $$$$$\     \$$$$  /   $$ |  $$$$$$$$ | */
/*   Group: Erwan PLESSIS              $$  __|    $$  $$<    $$ |  $$  __$$ | */
/*                                     $$ |      $$  /\$$\   $$ |  $$ |  $$ | */
/*                                     $$$$$$$$\ $$ /  $$ |$$$$$$\ $$ |  $$ | */
/*   Created: 2016/06/13 14:57:00      \________|\__|  \__|\______|\__|  \__| */
/*                                                                            */
/* ************************************************************************** */
import java.awt.*; 
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class View 
{
  public static void main(String[] args)
  {
    JFrame window = new JFrame();
    String level = new String("NNFFGGGGGGGGGGGGGGGFNFFNNNNNNNNNNNNNNANHFFNNNNNNNNNNNNNNNNNHFNDNFGGGGGGGFMFNFGGFHNNNHNNNNJNNNNHNNNNHHNNNHNFGGGGGGGFGGFNHHNNNHNNNNLNNNMHNNNNHHNNNFGGGGGGGFNFNFGGFHNNNHNNNNKNNNMHNNNNHFGFNHNFGGGGGGFFGGFNHHCNNHNNNNINNMHMNMNNHFGGGFGGGGGGGGFGGGGGF");
    window.setSize(769, 468);
    window.setTitle("Lorann Game");
    window.setLocationRelativeTo(null);
    window.setResizable(false);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel pan = new JPanel();
    pan.setBackground(Color.BLACK);

    for (int i = 0; i != 240; i++)
    {
        char caracter = level.charAt(i);
        switch (caracter)
        {
            case 'A': 
                Icon laurann = new ImageIcon("/Users/exia/Downloads/sprite/Laurann.gif");
                JLabel l = new JLabel();
                l.setIcon(laurann); 
                pan.add(l);
                break;
            case 'B': 
                Icon fireball = new ImageIcon("/Users/exia/Downloads/sprite/fireball.gif");
                JLabel f1 = new JLabel();
                f1.setIcon(fireball); 
                pan.add(f1);
                break;
            case 'C': 
                Icon crystall_ball = new ImageIcon("/Users/exia/Downloads/sprite/crystal_ball.png");
                JLabel c = new JLabel();
                c.setIcon(crystall_ball); 
                pan.add(c);
                break;
            case 'D': 
                Icon gate_closed = new ImageIcon("/Users/exia/Downloads/sprite/gate_closed.png");
                JLabel gc = new JLabel();
                gc.setIcon(gate_closed); 
                pan.add(gc);
                break;
            case 'E': 
                Icon gate_open = new ImageIcon("/Users/exia/Downloads/sprite/gate_open.png");
                JLabel go = new JLabel();
                go.setIcon(gate_open); 
                pan.add(go);
                break;
            case 'F':
                Icon bone = new ImageIcon("/Users/exia/Downloads/sprite/bone.png");
                JLabel bo = new JLabel();
                bo.setIcon(bone); 
                pan.add(bo);
                break;
            case 'G': 
                Icon bone_horizontal = new ImageIcon("/Users/exia/Downloads/sprite/horizontal_bone.png");
                JLabel bh = new JLabel();
                bh.setIcon(bone_horizontal); 
                pan.add(bh); 
                break;
            case 'H': 
                Icon vertical_bone = new ImageIcon("/Users/exia/Downloads/sprite/vertical_bone.png");
                JLabel vb = new JLabel();
                vb.setIcon(vertical_bone); 
                pan.add(vb); 
                break;
            case 'I':          
                Icon monster_1 = new ImageIcon("/Users/exia/Downloads/sprite/monster_1.png");
                JLabel m1 = new JLabel();
                m1.setIcon(monster_1); 
                pan.add(m1); 
                break;
            case 'J':          
                Icon monster_2 = new ImageIcon("/Users/exia/Downloads/sprite/monster_2.png");
                JLabel m2 = new JLabel();
                m2.setIcon(monster_2); 
                pan.add(m2); 
                break;
            case 'K':          
                Icon monster_3 = new ImageIcon("/Users/exia/Downloads/sprite/monster_3.png");
                JLabel m3 = new JLabel();
                m3.setIcon(monster_3); 
                pan.add(m3); 
                break;
            case 'L':          
                Icon monster_4 = new ImageIcon("/Users/exia/Downloads/sprite/monster_4.png");
                JLabel m4 = new JLabel();
                m4.setIcon(monster_4); 
                pan.add(m4); 
                break;
            case 'M': 
                Icon purse = new ImageIcon("/Users/exia/Downloads/sprite/purse.png");
                JLabel p = new JLabel();
                p.setIcon(purse); 
                pan.add(p);
                break;
            case 'N':
                Icon empty = new ImageIcon("/Users/exia/Downloads/sprite/empty.png");
                JLabel empt = new JLabel();
                empt.setIcon(empty); 
                pan.add(empt);
                break;
        } 
    }
    window.getContentPane().add(pan);
    window.setVisible(true);  
    }
}