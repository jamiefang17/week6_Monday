import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class TestJFrame extends JFrame{
    JPanel panel;//Build it out of ctor will be accessible to the class, not just a block

    public TestJFrame(){
        super("Tic Tac Toe Game");

        JmenuBar menuBar = new JmenuBar();
        //create a JMenu
        //Add Jmenu to Jmenu Bar
        menuBar.add(menu);

        //create a jmenu item
        JMenuItem menuItem = new JMenuItem()

        panel = new JPanel();
        setContentPane(panel);

     
        setLocation(0,0);
        setSize(500,600);
        setVisible(true);
    }
    
}
