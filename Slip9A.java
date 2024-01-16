/*Write a JDBC program to delete the records of employees whose names are starting with ‘A’ character.  */

import java.sql.*;

public class Slip9A {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mayadb1";
        String username = "root";
        String password = "Maya@123";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement()) {

            String deleteQuery = "DELETE FROM employees WHERE ename LIKE 'A%'";
            int rowsAffected = statement.executeUpdate(deleteQuery);

            System.out.println(rowsAffected + " records deleted successfully.");
        } catch (
            Exception e) {
            
        }
    }
}



