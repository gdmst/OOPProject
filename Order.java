import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

class Order extends JFrame {
    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Order f = new Order();
                f.setVisible(true);
            }
        });
    }

    public Order() {
        //openfile();
        setBounds(200, 300, 500, 400);
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Take Order");
    }
}