
import java.awt.*;
import java.applet.*;

public class opdr45 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(2, 2, 300, 300, 0, 360);
    }
}