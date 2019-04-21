import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Home extends JFrame implements ActionListener{ 
    JButton menuBtn, orderBtn, vorderBtn, payBtn, conBtn, addMenuBtn;


    public Home() {
        setBounds(200, 300, 500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Home");

        /*MenuTop allMenu = new MenuTop();
        setJMenuBar(allMenu);*/

        JPanel MenuHome = new JPanel(new GridLayout(3, 2));
        add(MenuHome);
        //add all btn of the menu to the other windows
        menuBtn = new JButton("All Menu");
        orderBtn = new JButton("Take Order");
        vorderBtn = new JButton("View All Order");
        payBtn = new JButton("Payment");
        conBtn = new JButton("Conclude");
        addMenuBtn = new JButton("Add Menu");
        MenuHome.add(menuBtn);
        MenuHome.add(orderBtn);
        MenuHome.add(vorderBtn);
        MenuHome.add(payBtn);
        MenuHome.add(conBtn);
        MenuHome.add(addMenuBtn);
        menuBtn.addActionListener(this);
        orderBtn.addActionListener(this);
        vorderBtn.addActionListener(this);
        payBtn.addActionListener(this);
        conBtn.addActionListener(this);
        addMenuBtn.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ev) {

        if(ev.getSource() == orderBtn){
            
        }
        if (ev.getSource() == addMenuBtn) {
            AddMenu a = new AddMenu();
            a.setVisible(true);
        }
    }
    public static void main(String args[]){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home f = new Home();
                f.setVisible(true);
           }
        });
    }
}

