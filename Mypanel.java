import java.io.*;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Mypanel extends JPanel{
    ArrayList<FoodList> list;
    public Mypanel(ArrayList<FoodList> list) throws IOException {
        setLayout(new GridLayout(0, 5));
        report(list);
    }
    
    public void report(ArrayList<FoodList> list) throws IOException {
        TextField text[] = new TextField[100];
        JButtom btn[] = new JButton[100];
        String name, p, i;
        int id, price,j=0;
        JLabel labeli , labeln, labelp;

        DataInputStream fileIn = new DataInputStream(new FileInputStream("allmenu.in"));
        try {
            while (true) {
                id = fileIn.readInt();
                price = fileIn.readInt();
                name = fileIn.readUTF();
                p = Integer.toString(price);
                i = Integer.toString(id);
                
                add(new JCheckBox(i));
                add(new JLabel(name));
                add(new JLabel(p));

                text[j] = new TextField();
                add(text[j]);

                add(btn[j] = new JButton("Add"));

            }
        } catch (EOFException e) {

        }
    }
}



