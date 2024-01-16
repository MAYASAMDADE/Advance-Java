//Write a Java Program to Read, Update and Delete any record from Elements table. 
//The table has following fields (Atomic_weight , Name (primary key), Chemical_Symbol). 
//The input should be provided through Command Line Arguments along with the appropriate data. 
//The operations are: R : Read, U: Update, D: Delete. 


/*CREATE TABLE elements 
(Atomic_weight DOUBLE, 
Name VARCHAR(50) PRIMARY KEY,
Chemical_Symbol VARCHAR(10)); */

/* INSERT INTO elements VALUES 
  (12.34, 'Element1', 'E1'),
  (45.67, 'Element2', 'E2'),
  (89.01, 'Element3', 'E3'); */

/*import java.sql.*;

public class Slip23B {
    public static void main(String[] args) {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mayadb1";
            String username = "root";
            String password = "Maya@123";
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement pst;
            ResultSet rs;
            String q;
            String s = args[0];
            char ch = s.charAt(0);
            switch (ch) 
            {
                case 'R':
                case 'r': // Read operation
                    q = "SELECT * FROM elements";
                    pst = con.prepareStatement(q);
                    rs = pst.executeQuery();
                    while (rs.next()) {
                        System.out.println("\t" + rs.getDouble(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
                    }
                    break;

                case 'U':
                case 'u': // Update operation
                    q = "UPDATE elements SET Atomic_weight = ? WHERE Name = ?";
                    pst = con.prepareStatement(q);
                    String c1 = args[1];
                    double c2 = Double.parseDouble(args[2]); // Parse the argument as double
                    pst.setDouble(1, c2); // Use setDouble for Atomic_weight
                    pst.setString(2, c1);
                    pst.executeUpdate();
                    break;

                case 'D':
                case 'd': // Delete operation
                    q = "DELETE FROM elements WHERE Name = ?";
                    pst = con.prepareStatement(q);
                    String c3 = args[1];
                    pst.setString(1, c3);
                    pst.executeUpdate();
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}*/


import java.sql.*;

public class Slip23B {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mayadb1";
            String username = "root";
            String password = "Maya@123";
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement pst;
            ResultSet rs;
            String q;

            if (args.length > 0) {
                String s = args[0];
                char ch = s.charAt(0);
                switch (ch) {
                    case 'R':
                    case 'r': // Read operation
                        q = "SELECT * FROM elements";
                        pst = con.prepareStatement(q);
                        rs = pst.executeQuery();
                        while (rs.next()) {
                            System.out.println("\t" + rs.getDouble(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
                        }
                        break;

                    case 'U':
                    case 'u': // Update operation
                        if (args.length >= 3) {
                            q = "UPDATE elements SET Atomic_weight = ? WHERE Name = ?";
                            pst = con.prepareStatement(q);
                            String c1 = args[1];
                            String c2 = args[2];
                            pst.setString(1, c2);
                            pst.setString(2, c1);
                            pst.executeUpdate();
                        } else {
                            System.out.println("Invalid number of arguments for update operation.");
                        }
                        break;

                    case 'D':
                    case 'd': // Delete operation
                        if (args.length >= 2) {
                            q = "DELETE FROM elements WHERE Name = ?";
                            pst = con.prepareStatement(q);
                            String c3 = args[1];
                            pst.setString(1, c3);
                            pst.executeUpdate();
                        } else {
                            System.out.println("Invalid number of arguments for delete operation.");
                        }
                        break;

                    default:
                        System.out.println("Invalid operation. Use R, U, or D.");
                }
            } else {
                System.out.println("No operation specified. Use R, U, or D.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

