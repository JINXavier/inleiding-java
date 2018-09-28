package Challenge;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class Opdrch1 extends Applet {
    TextField input1;
    TextField input2;
    TextField input3;
    int Valerie;
    int Jeroen;
    int Hans;
    int Valerie1;
    int Jeroen1;
    int Hans1;
    Button apply;


    public void init() {
        apply = new Button("apply");
        applyListener kl = new applyListener();
        apply.addActionListener(kl);
        add(apply);
        input1 = new TextField(10);
        Label label = new Label("Valerie");
        add(input1);
        add(label);
        input2 = new TextField(10);
        label = new Label("Jeroen");
        add(input2);
        add(label);
        input3 = new TextField(10);
        label = new Label("Hans");
        add(input3);
        add(label);
        add (apply);
    }

    public void paint(Graphics g) {
        //String
        g.drawLine(50,420,600,420);//onder streep
        g.drawLine(50,1,50,420); //linker streep
        //staven
        g.setColor(Color.red);
        g.fillRect(125,Valerie1,75,Valerie*3);
        g.setColor(Color.red);
        g.fillRect(250,Jeroen1,75,Jeroen*3);
        g.setColor(Color.red);
        g.fillRect(375,Hans1,75,Hans*3);
        g.setColor(Color.black);
        //personen
        g.drawString("Valerie", 140, 435);
        g.drawString("Jeroen",265,435);
        g.drawString("Hans",400,435);
        //maat labels
        g.drawString("120" ,5,60);
        g.drawLine(50,60,55,60);
        g.drawString("100" ,5,120);
        g.drawLine(50,120,55,120);
        g.drawString("80",5,180);
        g.drawLine(50,180,55,180);
        g.drawString("60",5,240);
        g.drawLine(50,240,55,240);
        g.drawString("40",5,300);
        g.drawLine(50,300,55,300);
        g.drawString("20",5,360);
        g.drawLine(50,360,55,360);


    }
    class applyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int DeFault = 420;
            Valerie = Integer.parseInt(input1.getText());
            Valerie1 = DeFault - Valerie * 3;
            repaint();
            Jeroen = Integer.parseInt(input2.getText());
            Jeroen1 = DeFault - Jeroen * 3;
            repaint();
            Hans = Integer.parseInt(input3.getText());
            Hans1 = DeFault - Hans * 3;
            repaint();
        }
    }
}
