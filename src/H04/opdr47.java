import java.awt.*;
import java.applet.*;

public class opdr47 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRect(2, 2, 100, 100);
        g.fillOval(8,8,40,40);
        g.fillOval(8,58,40,40);
        g.fillOval(58,8,40,40);
        g.fillOval(58,58,40,40);
    }
}
