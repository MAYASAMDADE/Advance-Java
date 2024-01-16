/*Write a JDBC program in java to update an address of given customer(cid,cname,address) and display updated details. */

import java.sql.*;

public class Slip15A 
{
    public static void main(String[] args) 
    {
        String url = "jdbc:mysql://localhost:3306/mayadb1";
        String username = "root";
        String password = "Maya@123";

        try (Connection con = DriverManager.getConnection(url, username, password);
             Statement statement = con.createStatement()) 
        {   
            String u = "UPDATE customer SET Address = 'Garware' WHERE CID = 1";
            int rowsAffected = statement.executeUpdate(u);

            System.out.println(rowsAffected + " records UPDATED successfully.");

            String s = "SELECT * FROM customer WHERE CID = 1";
            ResultSet rs = statement.executeQuery(s);

            if (rs.next()) {
                System.out.println("Updated Details:");
                System.out.println("Customer ID: " + rs.getInt("CID"));
                System.out.println("Customer Name: " + rs.getString("CName"));
                System.out.println("Updated Address: " + rs.getString("Address"));
            } else {
                System.out.println("Customer with ID 1 not found.");
            }
        } 
        catch (Exception e) {}
    }
}




