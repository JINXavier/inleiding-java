import java.applet.Applet;
        import java.awt.*;
        import java.awt.event.*;

public class Opdr83 extends Applet {
    TextField tekstvak;
    Label label;
    Button ok;
    double btw;

    public void init() {
        tekstvak = new TextField("", 14);
        label = new Label("bereken uw btw");
        ok = new Button("OK");
        ok.addActionListener(new KnopListener());
        tekstvak.addActionListener(new KnopListener());
        add(tekstvak);
        add(label);
        add(ok);
    }

    public void paint(Graphics g){
        g.drawString("Bedrag inc. btw is:" + (btw*1.21),40 , 70);
    }
    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s= tekstvak.getText();
            btw= Double.parseDouble(s);
            repaint();
        }
    }
}