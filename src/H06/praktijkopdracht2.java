import java.awt.*;
import java.applet.*;


public class praktijkopdracht2 extends Applet {
    double a, b, c, d;


    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = (a+b+c)/3;
        d = (int) (d*10);
        d = (d / 10);
    }

    public void paint(Graphics g) {
        g.drawString("Gemiddelde is: " + d, 20, 20);
    }
}