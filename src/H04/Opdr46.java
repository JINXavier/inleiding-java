import java.awt.*;
import java.applet.*;

public class Opdr46 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(2, 2, 100, 200);
        g.setColor(Color.GREEN);
        g.fillArc(2, 2, 100, 100, 0, 360);
        g.setColor(Color.RED);
        g.fillArc(2, 102, 100, 100, 0, 360);
    }
}