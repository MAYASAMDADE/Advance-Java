import java.sql.*;

import javafx.scene.control.TextField;

import java.awt.*;
import java.awt.event.*;
public class Slip25B extends Frame implements ActionListener
{
    Label l1,l2,l3;
    TextField t2,t2,t3;
    Button b1,b2,b3,b4;
    Connection con;
    String q;
    Statement st;
    ResultSet rs;
    Panel p1,p2;
    public Slip25B()
    {
        try
        {
            l1=new Label("Employee id");
            l2=new Label("Employee name");
            l3=new Label("Employee department");
            t1=new TextField(15);
            t2=new TextField(15);
            t3=new TextField(15);
            b1=new Button("moveFirst");
            b2=new Button("moveNext");
            b3=new Button("movePrevious");
            b4=new Button("moveLat");
            p1=new Panel();
            p2=new Panel();
            p1.add(l1);p1.add(t1);
            p1.add(l2);p1.add(t2);
            p1.add(l3);p1.add(t3);
            p2.add(b1);p2.add(b2);p2.add(b3);p2.add(b4);
            add(p1);
            add(p2);
            p1.setLayout(new GridLayout(3,2));
            p2.setLayout(new GridLayout(1,4));
        }
    }
}
