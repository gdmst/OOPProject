import java.awt.*;
import java.util.Scanner;

import javax.swing.*;
class AddMenu extends JFrame{
    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddMenu f = new AddMenu();
                f.setVisible(true);
            }
        });
    }
    public AddMenu(){
        setBounds(200, 300, 500, 400);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Add Menu Food");
    }


}