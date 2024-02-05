import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class RandomColorSwingApp extends JFrame
{
    private JButton changeColorButton;
    public RandomColorSwingApp()
    {
// Set up the main frame
        setTitle("Random Color Swing App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
// Create components
        changeColorButton = new JButton("Change Color");
// Add ActionListener to the button
        changeColorButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                changeBackgroundColor();
            }
        }
);
// Set up the layout
        setLayout(new BorderLayout());
        add(changeColorButton, BorderLayout.CENTER);
// Display the frame
        setVisible(true);
    }
    private void changeBackgroundColor()
    {
// Generate random RGB values
        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
// Set the background color
        Color randomColor = new Color(red, green, blue);
        getContentPane().setBackground(randomColor);
    }
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new RandomColorSwingApp();
            }
        });
    }
}