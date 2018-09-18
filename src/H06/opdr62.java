import java.awt.*;
import java.applet.*;


public class opdr62 extends Applet {
    int minuut;
    int uur;
    int dag;
    int jaar;

    int peruur;
    int perdag;
    int perjaar;


    public void init() {
        minuut = 60;
        uur = 60;
        dag = 24;
        jaar = 356;

        peruur = (minuut * uur);
        perdag = (peruur * dag);
        perjaar = (perdag * jaar);

    }

    public void paint(Graphics g) {
        g.drawString("Secondes in een uur: " + peruur, 20, 20);
        g.drawString("Secondes in een dag: " + perdag, 20, 40);
        g.drawString("Secondes in een jaar: " + perjaar, 20, 60);
    }
}