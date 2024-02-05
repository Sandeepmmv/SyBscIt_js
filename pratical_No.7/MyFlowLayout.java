import java.awt.*;
import javax.swing.*;
public class MyFlowLayout
{
    JFrame f=new JFrame();
    MyFlowLayout()
    {
        JButton b1=new JButton("1");
        JButton b2=new JButton("2");
        JButton b3=new JButton("3");
        JButton b4=new JButton("4");
        JButton b5=new JButton("5");
// adding buttons to the frame
        f.add(b1); f.add(b2); f.add(b3); f.add(b4); f.add(b5);
// setting flow layout of right alignment
        f.setLayout(new FlowLayout(FlowLayout.RIGHT));
        f.setSize(300,300);
        f.setVisible(true);
    }
    public static void main(String[] args)
    {
        new MyFlowLayout();
    }
}