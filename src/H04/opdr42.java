
import java.awt.*;
import java.applet.*;

public class opdr42 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        /*dak*/
        g.drawLine(50, 150, 250, 150); /*onder*/
        g.drawLine(50, 150, 150, 1);  /*links*/
        g.drawLine(150, 1, 250, 150); /*Rechts*/
        /*blok*/
        g.drawLine(50,150,50,300); /*links*/
        g.drawLine(250,150,250,300);/*rechts*/
        g.drawLine(50 ,300,250,300);/*onder*/
        /*deur*/
        g.drawLine(100,225, 100,300);
        g.drawLine(150,225,150,300);
        g.drawLine(100,225,150,225);
        /*raam*/
        g.drawLine(175,225,225,225);
        g.drawLine(175,225,175,275);
        g.drawLine(225,225, 225,275);
        g.drawLine(225,275,175,275);
    }
}