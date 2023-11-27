import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MyJPanel extends JPanel {
    JButton okButton =new JButton("OK");
    JButton cancelButton = new JButton("Cancel");
    public MyJPanel()
    {
        super();
        setLayout(new BorderLayout());
        okButton.addActionListener(new MyOkButtonHandler());
        cancelButton.addActionListener(e -> System.exit(0));
        add(okButton, BorderLayout.CENTER);
        add(cancelButton,BorderLayout.SOUTH);

        private void PrintButtonClicked(ActionEvent e)
        {

        }

    }




    @Override
    protected void paintComponent(Graphics g)
    {
         // TODO Auto-generated method stub
        super.paintComponent(g);
        g.drawString("Hello you!",20,30);
    }


}
