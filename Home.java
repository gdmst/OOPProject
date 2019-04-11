import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Home extends JFrame{ 
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

        /*MenuTop allMenu = new MenuTop();
        setJMenuBar(allMenu);*/

    }

}

