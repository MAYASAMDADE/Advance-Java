/*Write a JDBC program to remove “percentage” column from student (rno, sname, percentage) */
/*CREATE TABLE student(
    SNo INT(5),
    SName VARCHAR(20),
    SRoll INT(5),
    percentage INT(20));
);*/

import java.sql.*;

public class Slip11A {
    public static void main(String[] args) throws Exception {
        // Replace with your database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/mayadb1";
        String username = "root";
        String password = "Maya@123";

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();

        String removeColumnQuery = "ALTER TABLE student DROP COLUMN percentage";
        statement.executeUpdate(removeColumnQuery);

        System.out.println("Column 'percentage' removed successfully.");

        // Closing resources
        statement.close();
        connection.close();
    }
}

