import java.applet.Applet;
import java.awt.Graphics;
//date is inside the  util packeg 
import java.util.Calendar;
import java.util.GregorianCalendar;
/*<applet code="MyApplet3" width ="300" height ="250"></applet>*/
public class MyApplet3 extends Applet implements Runnable{
    Thread t,t1;
    public void start(){
        t=new Thread(this);
        t.start(); 
    }
    public void run(){
        t1=Thread.currentThread();
        while(t1 == t){
            repaint();
            try{
                t1.sleep(1000);
            }
            catch(final InterruptedException e) {
            }
        }
    }

    public void paint(final Graphics g) {
        final Calendar cal = new GregorianCalendar();
        final String hour = String.valueOf(cal.get(Calendar.HOUR));
        final String minute = String.valueOf(cal.get(Calendar.MINUTE));
        final String second = String.valueOf(cal.get(Calendar.SECOND));
        g.drawString(hour +";"+minute +";"+ second,140,100);
    }
}