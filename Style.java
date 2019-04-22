import java.io.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Style{
  public static void main(String []args){

  }
}
public class Mypanel extends JPanel{
    public Mypanel(){
        setLayout(new GridLayout(3, 2));
        report();
    }
    
    public void report() throws IOException {
        String name;
        int id, price;
        DataInputStream fileIn = new DataInputStream(new FileInputStream("allmenu.in"));
        try {
            while (true) {
                id = fileIn.readInt();
                price = fileIn.readInt();
                name = fileIn.readUTF();
                add(new JLabel("id"));
                add(new JLabel("price"));
                add(new JLabel("name"));
            }
        } catch (EOFException e) {

        }
    }
}



