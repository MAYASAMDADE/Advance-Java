/*Write a Multithreading program in java to display the number’s between 1 to 100 continuously in a TextField by clicking on button.(use Runnable Interface). */
import java.awt.*;
import java .awt.event.*;

public class Slip12A extends Frame implements ActionListener,Runnable
{
    TextField t1;
    Button b1,b2;
    Thread t=null;
    int i=1;
    Slip12A()
    {
        t1=new TextField(30);
        b1=new Button("start");
        b2=new Button("close");
        t=new Thread(this);
        add(t1);add(b1);add(b2);
        setLayout(new FlowLayout());
        setSize(500,500);
        setVisible(true);
        Font f=new Font("Arial",Font.BOLD,20);
        setFont(f);
        b1.addActionListener(this);
        b2.addActionListener(this);
        }

        public void actionPerformed(ActionEvent e)
        {
            try
            {
                if(e.getSource()==b1)
                {
                    t.start();
                }
                else
                {
                    t.stop();
                    System.exit(0);
                }
            }
            catch(Exception e1){}
        }

        public void run()
        {
            try{
                for( ;i<=100;i++)
                {
                    t1.setText(" "+i);
                    t.sleep(100);
                }
            }
            catch(Exception e){}
        }

        public static void main(String arg[])throws Exception
        {
            Slip12A ob=new Slip12A();
        }
}

