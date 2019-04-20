import java.io.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuTop extends JMenuBar{
    //public static void main(String []args){
        JFrame f = new JFrame();  
    //}
    public MenuTop(){
        JMenu menu1 = new JMenu("Menu");
        JMenuItem menu1_1 = new JMenuItem("Ordered by Type"); 
        menu1.add(menu1_1); 
        add(menu1); 

        JMenu menu2 = new JMenu("student");
        JMenuItem menu2_1 = new JMenuItem("ordered by name");
        menu2.add(menu2_1);
        JMenuItem menu2_2 = new JMenuItem("ordered by class");
        menu2.add(menu2_2);
        add(menu2);
    }
}


