import java.io.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Style{
    public void addForm(JPanel panel, String label){
        TextField tid;
        panel.add(new Label(label));
        panel.add(tid = new TextField(" ",20));
    }
}

class MenuTop extends JMenuBar{
    public MenuTop(){
        JMenu menu1 = new JMenu("All Menu");// ceate new menu
        JMenuItem menu1_1 = new JMenuItem("Ordered by Type");
        JMenuItem menu1_2 = new JMenuItem("ordered by Price");
        JMenuItem menu1_3 = new JMenuItem("Seach by food name");
        menu1.add(menu1_1);
        menu1.add(menu1_2);
        menu1.add(menu1_3);
        add(menu1); // add menu1 to menuBar

        JMenu menu2 = new JMenu("Order");
        JMenuItem menu2_1 = new JMenuItem("Add Order");
        menu2.add(menu2_1);
        JMenuItem menu2_2 = new JMenuItem("View All Order");
        menu2.add(menu2_2);
        JMenuItem menu2_3 = new JMenuItem("Conclude Bill");
        menu2.add(menu2_2);
        add(menu2);

        JMenu menu3 = new JMenu("Manage Menu");
        add(menu3);

        menu1_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                Home f = new Home();
                f.setVisible(true);
            }
        });
    }

}


