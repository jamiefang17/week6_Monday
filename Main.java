import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        JFrame window = new JFrame("Gui Test");
        window.setContentPane(new MyJPanel());
        window.setLocation(400, 0);
        window.setSize(900, 900);
        window.setVisible(true);


        TicTacToe window2 = new TicTacToe();
    }
}