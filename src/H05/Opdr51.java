import java.awt.*;
import java.applet.*;

public class Opdr51 extends Applet {
    //declaratie.
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        //initialisatie.
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        g.drawString("Lijn", 100, 20);
        g.drawLine(5, 5, 205, 5);
        g.drawRect(5, 30, breedte, hoogte);
        g.drawString("Rechthoek", 80, 148);
        g.drawRoundRect(5,160,breedte,hoogte,15,15);
        g.drawString("Afgeronde Rechthoek",40,275);
        g.setColor(opvulkleur);
        g.fillRect(220,30,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawString("Gevulde rechthoek met ovaal", 240, 148);
        g.drawOval(220,30,breedte,hoogte);
        g.drawOval(430,30,breedte,hoogte);
        g.setColor(opvulkleur);
        g.fillArc(430,30,breedte,hoogte,0,45);
        g.fillOval(220,160,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawString("Tartpunt met ovaal eromheen", 450, 148);
        g.drawString("Gevulde Ovaal",280,275);
        g.drawOval(480,160,100,100);
        g.drawString("Cirkel",510,275);
    }
}