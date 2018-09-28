import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdr81 extends Applet {
    TextField tekstvak;
    Button knop;
    Button knop2;
    String s;

    public void init() {
        setSize(1000, 1000);
        KnopListener kl = new KnopListener();
        tekstvak = new TextField("", 30);
        knop = new Button("Ok");
        knop.addActionListener(kl);
        knop2 = new Button("Reset");
        knop2.addActionListener(new weg());
        tekstvak.addActionListener(kl);
        add(tekstvak);
        add(knop);
        add(knop2);
        s = "";
    }

    public void paint(Graphics g) {
        g.drawString("Type een hele lange tekst " +
                s , 50, 60);

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = new String();
            s = tekstvak.getText();
            repaint();
        }
    }

    class weg implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            repaint();
        }
    }
}