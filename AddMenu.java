import java.awt.*;
import javax.swing.*;
class AddMenu extends JFrame{
    public static void main(String args[]) {
        AddMenu f = new AddMenu();
        f.setVisible(true);
    }
    public AddMenu(){
        setBounds(200, 300, 500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Add Menu Food");
    }
}