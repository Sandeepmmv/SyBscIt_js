import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class MyAdapterClass{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            JFrame frame = new JFrame("MouseAdapter Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel label = new JLabel();
            JPanel panel = new JPanel();
            panel.setPreferredSize(new Dimension(300,200));

            panel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    label.setText("Mouse Clicked at ("+e.getX()+","+e.getY()+")");
                }
            });
            panel.add(label);
            frame.add(panel);
            frame.pack();
            frame.setVisible(true);
        });
    }

}
