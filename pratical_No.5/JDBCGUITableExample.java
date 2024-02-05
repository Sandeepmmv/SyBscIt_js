import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class JDBCGUITableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Database Table Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String url = "jdbc:mysql://localhost:3306/syit";
        String username = "root";
        String password = "root";
        String tableName = "students";
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Name");
        tableModel.addColumn("Age");
        tableModel.addColumn("City");
        JTable jTable = new JTable(tableModel);
        JScrollPane jScrollPane = new JScrollPane(jTable);
        frame.getContentPane().add(jScrollPane);
        try {
            Connection connection = DriverManager.getConnection(url,
                    username, password);
// Creating a Statement object to execute SQL queries
            Statement statement = connection.createStatement();
// Executing a SQL query to fetch data from the table
            String query = "SELECT * FROM " + tableName;
            ResultSet resultSet = statement.executeQuery(query);
// Iterating through the result set and adding data to the JTable
            while (resultSet.next()) {
                Object[] row = new Object[4];
// Assuming there are two columns in the example
                row[0] = resultSet.getObject(1);
// Adjust index based on your table structure
                row[1] = resultSet.getObject(2);
                row[2] = resultSet.getObject(3);
                row[3] = resultSet.getObject(4);
// Add more rows as needed...
                tableModel.addRow(row);
            }
// Closing resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
// Setting up the frame
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
