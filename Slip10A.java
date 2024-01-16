/* Write a JDBC program to count the number of records in table. (Without using standard method)  */
import java.sql.*;

public class Slip10A {
    public static void main(String[] args) throws Exception {
        // Replace with your database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/mayadb1";
        String username = "root";
        String password = "Maya@123";

        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();

        String countQuery = "SELECT COUNT(*) FROM employees";
        ResultSet rs = st.executeQuery(countQuery);

        // Move the cursor to the first row
        rs.next();

        int recordCount = rs.getInt(1);
        System.out.println("Number of records: " + recordCount);

        // Closing resources
        rs.close();
        st.close();
        con.close();
    }
}
