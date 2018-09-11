import java.awt.*;
import java.applet.*;

public class Praktijkopdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawString("Lijn", 100, 20);
        g.drawLine(5, 5, 205, 5);
        g.drawRect(5, 30, 200, 100);
        g.drawString("Rechthoek", 80, 148);
        g.drawRoundRect(5,160,200,100,15,15);
        g.drawString("Afgeronde Rechthoek",40,275);
        g.setColor(Color.magenta);
        g.fillRect(220,30,200,100);
        g.setColor(Color.black);
        g.drawString("Gevulde rechthoek met ovaal", 240, 148);
        g.drawOval(220,30,200,100);
        g.drawOval(430,30,200,100);
        g.setColor(Color.magenta);
        g.fillArc(430,30,200,100,0,45);
        g.fillOval(220,160,200,100);
        g.setColor(Color.black);
        g.drawString("Tartpunt met ovaal eromheen", 450, 148);
        g.drawString("Gevulde Ovaal",280,275);
        g.drawOval(480,160,100,100);
        g.drawString("Cirkel",510,275);
    }
}