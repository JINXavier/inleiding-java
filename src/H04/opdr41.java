
import java.awt.*;
import java.applet.*;

public class opdr41 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        /*dak*/
        g.drawLine(50, 150, 250, 150); /*onder*/
        g.drawLine(50, 150, 150, 1);  /*links*/
        g.drawLine(150, 1, 250, 150); /*Rechts*/
    }
}