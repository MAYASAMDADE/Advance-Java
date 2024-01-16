/*Write a java program to simulate traffic signal using multithreading. */
import java.awt.*;
import java.applet.*;

public class Slip3B extends Applet implements Runnable {
    Thread t;
    int f = 0;

    public void init() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(800);
                repaint();
            }
        } catch (Exception e) {
           
        }
    }

    public void paint(Graphics g) {
        Color bclr = Color.black;
        g.setColor(bclr);
        g.drawRect(250, 100, 60, 180);
        g.drawOval(250, 100, 60, 60);
        g.drawOval(250, 160, 60, 60);
        g.drawOval(250, 220, 60, 60);

        if (f == 0) {
            Color c = Color.red;
            g.setColor(c);
            g.fillOval(250, 100, 60, 60);
            f = 1;
        } else if (f == 1) {
            Color c = Color.yellow;
            g.setColor(c);
            g.fillOval(250, 160, 60, 60);
            f = 2;
        } else if (f == 2) {
            Color c = Color.green;
            g.setColor(c);
            g.fillOval(250, 220, 60, 60);
            f = 0;
        }
    }
}
/*
<applet code=Slip3B height=500 width=500>
</applet>
*/