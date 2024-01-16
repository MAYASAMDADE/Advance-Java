/*Write a Multithreading program using Runnable interface to blink Text on the frame. */
import javax.swing.*;
import java.awt.*;

public class Slip8A extends JFrame implements Runnable 
{
    JLabel label;

    public Slip8A() 
    {
        label = new JLabel("Blinking Text");
        add(label);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);

        Thread thread = new Thread(this);
        thread.start();
    }

    public void run() 
    {
        while (true) 
        {
            label.setVisible(!label.isVisible());
            try 
            {
                Thread.sleep(500); // Adjust the sleep duration for blinking speed
            } catch (Exception e){}
        }
    }

    public static void main(String[] args) 
    {
        new Slip8A(); // Create an instance directly in the main method
    }
}

