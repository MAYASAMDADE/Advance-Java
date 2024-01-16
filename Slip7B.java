/*Write a Multithreading program in java for Racing Car. */
import java.awt.*;
import java.applet.*;
public class Slip7B extends Applet implements Runnable
{
    Image picture;
    int x=0,xx=0;
    Thread t;
    public void init()
    {
        t=new Thread(this);
        picture=getImage(getCodeBase(),"car.png");
        t.start();
    }    

    public void run()
    {
        try{
            while(true)
            {
                if(x<=700)
                {
                    x=x+10;
                    xx=xx+3;
                    {
                        Thread.sleep(200);
                    }
                }

                else
                    wait();
                    repaint();
            }
        }

        catch(Exception e){}
    }

    public void paint(Graphics g)
    {
        g.drawImage(picture, x, 30, this);
        g.drawImage(picture, xx, 120, this);
    }
}


/*
<applet code=Slip7B height=300 width=700>
</applet>
*/