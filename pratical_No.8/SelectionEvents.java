import javax.swing.;
import java.awt.;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectionEvents {
    public static void main(String[] args){
        SwingUtilities.invokeLater(()-{
            JFrame frame = new JFrame(SelecionEvents Demo);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            String[] items = {Python,Java,C++};
            JComboBoxString comboBox=new JComboBox(items);
            comboBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String selectedItem = (String) comboBox.getSelectedItem();
                    System.out.println(Selected+selectedItem);
                }
            });
            frame.add(comboBox, BorderLayout.CENTER);
            frame.setSize(300,200);
            frame.setVisible(true);
        });
    }
}