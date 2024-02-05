import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ColorChangeScrollPaneApp extends JFrame {
    private JScrollPane scrollPane;
    private JButton colorChooserButton;
    public ColorChangeScrollPaneApp() {
        setTitle("Color Change ScrollPane App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JTextArea textArea = new JTextArea("This is a JTextArea inside JScrollPane.");
                scrollPane = new JScrollPane(textArea);
        colorChooserButton = new JButton("Change Color");
        colorChooserButton.addActionListener(new ActionListener() {
                                                 public void actionPerformed(ActionEvent e) {
                                                     changeBackgroundColor();
                                                 }
                                             }
        );
// Set up the layout
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(colorChooserButton, BorderLayout.SOUTH);
// Display the frame
        setVisible(true);
    }
    private void changeBackgroundColor() {
        Color selectedColor = JColorChooser.showDialog(this, "Choose Background Color", scrollPane.getBackground());
        if (selectedColor != null) {
            scrollPane.getViewport().setBackground(selectedColor);
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ColorChangeScrollPaneApp();
            }
        });
    }
}
