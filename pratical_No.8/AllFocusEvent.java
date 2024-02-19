import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
public class AllFocusEvent
{
    public static void main(String[] args)
{
    SwingUtilities.invokeLater(() -> {
        JFrame frame = new JFrame("FocusEvent");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300,200));
        JLabel label = new JLabel();
        JTextField textField1= new JTextField(25);
        JTextField textField2= new JTextField(25);
        textField1.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent e)
        {
            label.setText("Focus Gained");
        }
            @Override
            public void focusLost(FocusEvent e)
        {
            label.setText("Focus Lost");
        }
        });
        panel.add(label);
        panel.add(textField1);
        panel.add(textField2);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    });
}
}