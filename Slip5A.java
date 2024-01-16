/*Write a java program to create Teacher table(TNo.TName, Sal, Desg) and insert a
record in it. */

/*CREATE TABLE Teacher(
    TNo INT(5),
    TName VARCHAR(20),
    Sal INT(5),
    Desg VARCHAR(20));
);*/




/*insert into Teacher values(1,"P.SALVE",20000,"NODE JS"); */
/*insert into Teacher values(2,"P.JAIN",30000,"PROJECT"); */
/*insert into Teacher values(3,"SHRUTI",90000,"ADV. JAVA"); */


import java.sql.*;

public class Slip5A {
    public static void main(String[] args) {
        try {
            // JDBC connection details
            String url = "jdbc:mysql://localhost:3306/mayadb1";
            String uname = "root";
            String pass = "Maya@123";

            // Establish a connection and create a statement
            Connection con = DriverManager.getConnection(url, uname, pass);
            Statement st = con.createStatement();

            // Create the Teacher table
            st.executeUpdate("CREATE TABLE Teacher (TNo INT PRIMARY KEY, TName VARCHAR(50), Sal INT(5), Desg VARCHAR(50))");
            System.out.println("Teacher table created successfully.");

            // Insert a record into the Teacher table
            st.executeUpdate("INSERT INTO Teacher (TNo, TName, Sal, Desg) VALUES (1, 'Shruti J', 50000, 'ADV. Java')");
            System.out.println("Record inserted successfully.");

            // Close the statement and connection
            st.close();
            con.close();
        } catch (Exception e) {
            
        }
    }
}

