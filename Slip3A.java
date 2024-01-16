/*Write a JDBC program to displays the details of employees (eno, ename, department,
sal) whose department is “Computer Science”. */
import java.sql.*;
public class Slip3A {
    public static void main(String arg[]) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/mayadb1";
        String uname = "root";
        String pass = "Maya@123";
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM employees WHERE department = 'Computer Science'");

        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
        }
        con.close();
    }
}
