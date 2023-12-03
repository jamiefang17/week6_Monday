import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class TicTacToe extends TestJFrame {
    
    ArrayList<JButton> buttons = new ArrayList<JButton>();
    String currentPlayer;

    public TicTacToe() {
        super();

        setContentPane(panel);

        panel.setLayout(new GridLayout(3, 3));
        Font font = new Font("SansSerif", Font.BOLD, 70);

        for(int i = 0; i < 9; i++){
            JButton button = new JButton();
            button.addActionListener(e -> ButtonClicked(e));
            button.setFont(font);
            //button.setText("" + i);
            panel.add(button);
            buttons.add(button);
        }
        JMenuBar menuBar = new JMenuBar();
        // Create a JMenu
        JMenu menu = new JMenu("Game Options");
        // Add JMenu to JMenuBar
        menuBar.add(menu);
        // Create a JMenuItem
        JMenuItem menuItem = new JMenuItem("Reset Game");
        menuItem.addActionListener(e -> ResetGame());
        // Add JMenuItem to JMenu
        menu.add(menuItem);
        setJMenuBar(menuBar);

        setContentPane(panel);
        setVisible(true);
    }

    private void ButtonClicked(ActionEvent e){
        SwitchPlayer();
        JButton button = (JButton)e.getSource();
        button.setText(currentPlayer);
        button.setEnabled(false);


        if(currentPlayer == "x"){
            button.setBackground(Color.MAGENTA);
        } else {
            button.setBackground(new Color(100, 32, 200));
        }

        if(WeHaveAWinner()){
            JOptionPane.showMessageDialog(null, currentPlayer +" has won!");

        for(int i = 0; i < 9; i++){
            buttons.get(i).setEnabled(false);
        }
    }
    }
    
    private void SwitchPlayer() 
    {
        if(currentPlayer == "x"){
            currentPlayer = "o";
        } else {
            currentPlayer = "x";
        }
    }

    public void ResetGame() {
        currentPlayer = "";
        for(int i = 0; i < 9;i++){
            JButton button = buttons.get(i);
            button.setEnabled(true);
            button.setText("");;
            button.setBackground(null);
        }
    }

    private boolean WeHaveAWinner() {
        if(buttons.get(0).getText().equals(currentPlayer) &&
        buttons.get(1).getText().equals(currentPlayer) &&
        buttons.get(2).getText().equals(currentPlayer)){
            return true;
        }

        if(buttons.get(3).getText().equals(currentPlayer) &&
        buttons.get(4).getText().equals(currentPlayer) &&
        buttons.get(5).getText().equals(currentPlayer)){
            return true;
        }

        if(buttons.get(6).getText().equals(currentPlayer) &&
        buttons.get(7).getText().equals(currentPlayer) &&
        buttons.get(8).getText().equals(currentPlayer)){
            return true;
        }

    if(buttons.get(0).getText().equals(currentPlayer) &&
        buttons.get(3).getText().equals(currentPlayer) &&
        buttons.get(6).getText().equals(currentPlayer)){
            return true;
        }

            if(buttons.get(1).getText().equals(currentPlayer) &&
        buttons.get(4).getText().equals(currentPlayer) &&
        buttons.get(7).getText().equals(currentPlayer)){
            return true;
        }

        if(buttons.get(2).getText().equals(currentPlayer) &&
        buttons.get(5).getText().equals(currentPlayer) &&
        buttons.get(8).getText().equals(currentPlayer)){
            return true;
        }

        if(buttons.get(0).getText().equals(currentPlayer) &&
        buttons.get(4).getText().equals(currentPlayer) &&
        buttons.get(8).getText().equals(currentPlayer)){
            return true;
        }

        if(buttons.get(2).getText().equals(currentPlayer) &&
        buttons.get(4).getText().equals(currentPlayer) &&
        buttons.get(6).getText().equals(currentPlayer)){
            return true;
        }

        return false;
    }
}