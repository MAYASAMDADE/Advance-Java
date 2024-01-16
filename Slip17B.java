/*Write a JDBC application using swing for the following:		 [15 M] */

/*CREATE TABLE Slip17B (
    SNo INT(5) PRIMARY KEY,
    SName VARCHAR(20)
);*/

/*ALTER TABLE Slip17B
ADD NewColumn VARCHAR(30); */

/*DROP TABLE Slip17B; */


import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Slip17B extends JFrame implements ActionListener
{
    JLabel l1;
    JTextField t1;
    JButton b1,b2,b3;
    Connection con;
    String q;
    Statement st;
    JPanel p1,p2;
    public Slip17B()
    {
        try
        {
            l1=new JLabel("Type DDL Query");
            t1=new JTextField(40);
            b1=new JButton("Create Table");
            b2=new JButton("Alter Table");
            b3=new JButton("Drop Tabel");
            Container c=getContentPane();
            p1=new JPanel();
            p2=new JPanel();
            p1.add(l1);p1.add(t1);
            p2.add(b1);p2.add(b2);p2.add(b3);
            c.add(p1);
            c.add(p2);
            setLayout(new GridLayout(2,1));
            setVisible(true);
            setSize(500,500);
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            Font f=new Font("Arial",Font.BOLD,20);
            p1.setFont(f);
            p2.setFont(f);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mayadb1";
            String uname = "root";
            String pass = "Maya@123";
            con = DriverManager.getConnection(url, uname, pass);
            //con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mayadb1");
            st=con.createStatement();
        }

        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void actionPerformed(ActionEvent a)
    {
        try
        {
            if(a.getSource()==b3)
            {
                q=t1.getText();
                st.executeUpdate(q);
                t1.setText("Table Dropped");
            }
            if(a.getSource()==b1)
            {
                q=t1.getText();
                st.executeUpdate(q);
                t1.setText("Table Created");
            }
            if(a.getSource()==b2)
            {
                q=t1.getText();
                st.executeUpdate(q);
                t1.setText("Table Altered");
            }
        }
        catch(Exception e1)
        {
            System.out.println(e1.getMessage());
        }
    }

    public static void main(String arg[])throws Exception
    {
        Slip17B ob=new Slip17B();
    }
}