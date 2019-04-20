import java.awt.*;
import javax.swing.*;

public class Home extends JFrame{ 
    JButton menuBtn, orderBtn, vorderBtn, payBtn, conBtn, addMenuBtn;
    public static void main(String args[]){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home f = new Home();
                f.setVisible(true);
            }
        });
    }

    public Home() {
        setBounds(200, 300, 500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Home");

        MenuTop allMenu = new MenuTop();
        setJMenuBar(allMenu);

        JPanel MenuHome = new Jpanel(new GridLayout(3, 2));
        add(MenuHome);
        //add all btn of the menu to the other windows
        menuBtn = new JButton("All Menu");
        MenuHome.add(menuBtn);
        orderBtn = new JButton("All Menu");
        MenuHome.add(orderBtn);
        menuBtn = new JButton("All Menu");
        MenuHome.add(menuBtn);
    }

}

