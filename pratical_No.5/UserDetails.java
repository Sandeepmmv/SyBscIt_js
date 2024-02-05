import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class UserDetails extends JFrame{
    private JComboBox<String> userComboBox;
    private JTextField idTextField;
    private JTextField nameTextField;
    public UserDetails(){
        setTitle("Students");
        setSize(400,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        userComboBox= new JComboBox<>();
        idTextField = new JTextField(20);
        nameTextField= new JTextField(10);
        add(new JLabel("Select ID"));
        add(userComboBox);
        add(new JLabel("Id:"));
        add(idTextField);
        add(new JLabel("Name"));
        add(nameTextField);

        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/syit","root","root");
            String query ="SELECT id FROM students";
            PreparedStatement preparedStatement= connection.prepareStatement(query);
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next())
            {
                int id=resultSet.getInt("id");
                userComboBox.addItem(Integer.toString(id));
            }
            resultSet.close();
            preparedStatement.close();
            connection.close();


        }
        catch (SQLException e){
            e.printStackTrace();
        }
        userComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedId = (String) userComboBox.getSelectedItem();
                if(selectedId!=null)
                {
                    try{
                        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/syit","root","root");
                        String query ="SELECT id,name FROM students WHERE id=?";
                        PreparedStatement preparedStatement=connection.prepareStatement(query);
                        preparedStatement.setString(1,selectedId);
                        ResultSet resultSet=preparedStatement.executeQuery();
                        if (resultSet.next()){
                            int id = resultSet.getInt("id");
                            String name = resultSet.getString("name");
                            idTextField.setText(Integer.toString(id));
                            nameTextField.setText(name);
                        }
                        resultSet.close();
                        preparedStatement.close();
                        connection.close();

                    }catch (SQLException ex){
                        ex.printStackTrace();
                    }
                }
            }
        });
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(()->{
            UserDetails user = new UserDetails();
            user.setVisible(true);
        });
    }
}
