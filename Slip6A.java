/*A)Write a JDBC program to accept the details of customer (CID, CName, Address,
Ph_No) and store it into the database (Use PreparedStatement interface) */


/*CREATE TABLE Customer(
    CID INT(5),
    CName VARCHAR(20),
    Address VARCHAR(20),
    Ph_No INT(12));
);*/
import java.sql.*;

public class Slip6A {
    public static void main(String[] args) {
        try {
            // JDBC connection details
            String url = "jdbc:mysql://localhost:3306/mayadb1";
            String uname = "root";
            String pass = "Maya@123";

            // Establish a connection
            Connection con = DriverManager.getConnection(url, uname, pass);

            // Prepare the SQL query with placeholders using PreparedStatement
            String i = "INSERT INTO Customer (CID, CName, Address, Ph_No) VALUES (?, ?, ?, ?)";

            // Get user input (you can use a Scanner for more user-friendly input)
            int cid = 1;  
            String cname = "Suraj";  
            String address = "kothrud,pune"; 
            String phNo = "1234567890";  

            // Create a PreparedStatement
            PreparedStatement pst = con.prepareStatement(i);

            // Set values for the placeholders
            pst.setInt(1, cid);
            pst.setString(2, cname);
            pst.setString(3, address);
            pst.setString(4, phNo);

            // Execute the update
            pst.executeUpdate();
            System.out.println("Customer details inserted successfully.");

            // Close the PreparedStatement and connection
            pst.close();
            con.close();
        } catch (Exception e) {
            
        }
    }
}
