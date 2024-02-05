import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class ForwardBackward extends JFrame{
    private JButton previousButton;
    private JButton nextButton;
    private JTextField dataField;
    private ResultSet resultSet;
    public ForwardBackward() {
        setTitle("Students");
        setSize(400, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        previousButton = new JButton("Previous");
        nextButton = new JButton("next");
        dataField = new JTextField(20);
        add(previousButton);
        add(dataField);
        add(nextButton);
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/syit", "root", "root");
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String query = "SELECT * FROM students";
            resultSet = statement.executeQuery(query);
            displayData();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        previousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (resultSet.previous()){
                        displayData();
                    }
                }
                catch (SQLException ex){
                    ex.printStackTrace();
                }
            }
        });
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (resultSet.next()){
                        displayData();
                    }
                }
                catch (SQLException ex){
                    ex.printStackTrace();
                }
            }
        });

    }
    private void displayData(){
        try {
            dataField.setText(resultSet.getString("name"));
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(()->{
            ForwardBackward app = new ForwardBackward();
            app.setVisible(true);
        });
    }
}
