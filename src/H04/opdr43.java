
import java.awt.*;
import java.applet.*;

public class opdr43 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.gray);
        g.fillRect(10,10,10,250);

            /*vlag*/
            setBackground(Color.black);
            g.setColor(Color.red);
            g.fillRect(20,10,200,50);
            g.setColor(Color.white);
            g.fillRect(20,60,200,50);
            g.setColor(Color.blue);
            g.fillRect(20,110,200,50);
    }
}