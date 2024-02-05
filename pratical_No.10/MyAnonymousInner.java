import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyAnonymousInner{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            JFrame frame = new JFrame("Anonymous Inner Class");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel panel = new JPanel();
            panel.setPreferredSize(new Dimension(300,200));

            JButton button= new JButton("Clicke Here");
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(frame,"Button Clicked!");
                }
            });
            panel.add(button);
            frame.add(panel);
            frame.pack();
            frame.setVisible(true);
        });
    }

}
