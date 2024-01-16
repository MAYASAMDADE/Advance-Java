/*Write a JDBC program to create a Mobile (Model_No, Company_Name, Price, Color) table and insert a  record in it.      */
import java.sql.*;

public class Slip13A {
    public static void main(String[] args) throws Exception {
        // JDBC connection details
        String url = "jdbc:mysql://localhost:3306/mayadb1";
        String uname = "root";
        String pass = "Maya@123";

        // Establish a connection and create a statement
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

        // Create the Teacher table
        st.executeUpdate("CREATE TABLE Mobile (Model_No INT PRIMARY KEY, Company_Name VARCHAR(50), Price INT(5), Color VARCHAR(50))");
        System.out.println("Mobile table created successfully.");

        // Insert a record into the Teacher table
        st.executeUpdate("INSERT INTO Mobile (Model_No, Company_Name, Price, Color) VALUES (1, 'Apple', 90000, 'Black')");
        System.out.println("Record inserted successfully.");

        // Close the statement and connection
        st.close();
        con.close();
    }
}
