import java.awt.*;
import java.applet.*;


public class Opdr63 extends Applet {
    int uitkomst;
    int a;
    int b;

    public void init() {
        a = 2147483647;
        b = 2147483647;
        uitkomst = (a + b);
    }

    public void paint(Graphics g) {
        g.drawString("A + B = " + uitkomst, 20, 20);

    }
}