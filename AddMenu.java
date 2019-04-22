import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class AddMenu extends JFrame implements ActionListener {

    String id,menu; double price;

    TextField text1,text2,text3;
    Button clear,save,bt;
    RandomAccessFile file;


    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == save)
        {
            id = text1.getText().trim();
            menu = text2.getText().trim();
            price = Double.parseDouble(text3.getText().trim());
            prtFile();
            clearText();

        }
        else if(e.getSource() == clear)
        {clearText();}
        else if(e.getSource() == bt)
        {closeFile(); System.exit(0);}

    }
    public void clearText()
    {
        text1.setText(" ");
        text2.setText(" ");
        text3.setText(" ");
    }



    public void openFile()
    {
        boolean success=false;
        do {try{ String filename = JOptionPane.showInputDialog("enter Filename");
            file = new RandomAccessFile("allmenu.txt","rwd");
            success = true;}
        catch (IOException e) {System.out.println("File cannot Open");
            success = false;}

        }while (!success);
    }



    public void readFile(int s)
    {
        try { switch (s)
        {	case 0: {file.seek(0);break;}
            case 1: {long p = file.getFilePointer();
                System.out.println(p);
                if(p>= file.length()) file.seek(0);
                else file.seek(p);
                break;
            }
            case -1: {long p = file.getFilePointer();
                System.out.println(p);
                p = p-(2*50); System.out.println(p);
                if(p < 0) file.seek(0);
                else file.seek(p);
                break;
            }


        }

            text1.setText(file.readUTF());
            text2.setText(file.readUTF());
            text3.setText(String.valueOf(file.readDouble()));
        }
        catch (IOException e) {System.out.println("Error Writing to file");}
    }


    public void prtFile()
    {
        try { file.seek(file.length());
            file.writeUTF(formText(id,6));
            file.writeUTF(formText(menu,20));
            file.writeDouble(price);
        }
        catch (IOException e) {
            System.out.println("Error Writing to file");System.exit(1);
        }
    }


    public void closeFile()
    {
        try { file.close();}
        catch(IOException e) { System.out.println("error closing file");}
    }



    public static String formText(String x, int k)
    {
        int p = x.length();
        for(int i=p+1;i<=k;i++)
            x =x+" ";
        return x;

    }

    public static void main(String args[]) {
        AddMenu f = new AddMenu();
        f.setVisible(true);
    }
    public AddMenu() {
        setBounds(200, 300, 500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Add Menu Food");

        openFile();
        setLayout(new GridLayout(10,10,20,10));
        add(new Label("id   "));
        add(text1 = new TextField(" ",10));
        add(new Label("menu   "));
        add(text2 = new TextField(" ",10));
        add(new Label("price   "));
        add(text3 = new TextField(" ",10));


        add(clear = new Button("Clear"));
        add(save = new Button("Save"));
        add(bt = new Button("savebinary"));


        clear.addActionListener(this);
        save.addActionListener(this);
        bt.addActionListener(this);
    }
}