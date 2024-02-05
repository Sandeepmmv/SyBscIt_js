import java.awt.*;
import java.awt.event.*;
public class ActionListenerExample implements ActionListener
{
    public static void main(String[] args)
    {
        Frame f=new Frame("ActionListener Example");
        final TextField tf=new TextField();
        tf.setBounds(50,50, 150,20);
        Button b=new Button("Click Here");
        b.setBounds(50,100,60,30);
        b.addActionListener(null);
        f.add(b);f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        final TextField tf=new TextField();
        tf.setText("Welcome to Javatpoint.");
    }
}