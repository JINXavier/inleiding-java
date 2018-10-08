package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdr82 extends Applet {
    Button Vader;
    Button Moeder;
    Button man;
    Button vrouw;
    int teller;
    int teller1;
    int teller2;
    int teller3;
    int totaal;


    public void init() {
        setSize(500,500);
        KnopListener kl = new KnopListener();
        Vader.addActionListener(kl);
        Vader = new Button("Vader");
        Moeder = new Button("Moeder");
        Moeder.addActionListener(new Moeder());
        man = new Button("Mannelijke studenten");
        man.addActionListener(new Man());
        vrouw = new Button("Vrouwelijke studenten");
        vrouw.addActionListener(new Vrouw());
        teller = 0;
        teller1 = 0;
        teller2 = 0;
        teller3 = 0;
        add(Vader);
        add(Moeder);
        add(man);
        add(vrouw);


    }


    public void paint(Graphics g) {
        g.drawString("aantal Vaders" + teller, 20, 50);
        g.drawString("aantal Moeders" + teller1, 20, 65);
        g.drawString("aantal mannelijke potentiële studenten" + teller2, 20, 80);
        g.drawString("aantal vrouwelijke potentiële stundenten" + teller3, 20, 95);
        g.drawString("Totaal" + totaal , 20, 110);
        totaal= teller + teller1 + teller2 + teller3;

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller++;
            totaal++;
            repaint();

        }
    }

    class Moeder implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller1++;
            totaal++;
            repaint();
        }
    }

    class Man implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            teller2++;
            totaal++;
            repaint();
        }
    }

    class Vrouw implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            teller3++;
            totaal++;
            repaint();

        }
    }
}