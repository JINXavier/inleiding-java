//Voorbeeld 6.1

import java.awt.*;
        import java.applet.*;


public class opdr61 extends Applet {
    int uitkomst;
    int persoon;
    int Bedrag;

    public void init() {
        persoon = 4;
        Bedrag = 113;
        uitkomst = (Bedrag / persoon);
    }

    public void paint(Graphics g) {
        g.drawString("Jan: €" + uitkomst, 20, 20);
        g.drawString("Ali: €" + uitkomst, 20, 40);
        g.drawString("Jeannette: €" + uitkomst, 20, 60);
        g.drawString("Ik: €" + uitkomst, 20, 80);
    }
}