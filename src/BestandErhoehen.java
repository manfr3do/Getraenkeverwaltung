import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;

public class BestandErhoehen extends JFrame implements ActionListener {
    // define colors
    Color headerColor = new Color(38, 70, 83);

    // instantiate
    JRadioButton getraenk1;
    JRadioButton getraenk2;
    JRadioButton getraenk3;
    JRadioButton getraenk4;
    JRadioButton getraenk5;
    JRadioButton getraenk6;
    JRadioButton getraenk7;
    JRadioButton getraenk8;
    JRadioButton getraenk9;
    JRadioButton getraenk10;

    BestandErhoehen() {
        // create window
        Frame fr = new Frame();
        fr.setLayout(new BorderLayout());
        fr.setSize(400, 300);
        fr.setDefaultCloseOperation(HIDE_ON_CLOSE);
        
        // create panels
        JPanel navigation = new JPanel();
        navigation.setBackground(headerColor);
        navigation.setPreferredSize(new Dimension(400,150));

        JPanel tfPanel = new JPanel();
        tfPanel.setLayout(null);
        tfPanel.setPreferredSize(new Dimension(400, 75));

        JPanel msgPanel = new JPanel();
        msgPanel.setPreferredSize(new Dimension (400, 20));

        // create radio buttons
        getraenk1 = new JRadioButton(Getraenkeverwaltung.getraenk1.getName());
        getraenk2 = new JRadioButton(Getraenkeverwaltung.getraenk2.getName());
        getraenk3 = new JRadioButton(Getraenkeverwaltung.getraenk3.getName());
        getraenk4 = new JRadioButton(Getraenkeverwaltung.getraenk4.getName());
        getraenk5 = new JRadioButton(Getraenkeverwaltung.getraenk5.getName());
        getraenk6 = new JRadioButton(Getraenkeverwaltung.getraenk6.getName());
        getraenk7 = new JRadioButton(Getraenkeverwaltung.getraenk7.getName());
        getraenk8 = new JRadioButton(Getraenkeverwaltung.getraenk8.getName());
        getraenk9 = new JRadioButton(Getraenkeverwaltung.getraenk9.getName());
        getraenk10 = new JRadioButton(Getraenkeverwaltung.getraenk10.getName());

        // group them together 
        ButtonGroup group = new ButtonGroup();
        group.add(getraenk1);
        group.add(getraenk2);
        group.add(getraenk3);
        group.add(getraenk4);
        group.add(getraenk5);
        group.add(getraenk6);
        group.add(getraenk7);
        group.add(getraenk8);
        group.add(getraenk9);
        group.add(getraenk10);

        getraenk1.addActionListener(this);
        getraenk2.addActionListener(this);
        getraenk3.addActionListener(this);
        getraenk4.addActionListener(this);
        getraenk5.addActionListener(this);
        getraenk6.addActionListener(this);
        getraenk7.addActionListener(this);
        getraenk8.addActionListener(this);
        getraenk9.addActionListener(this);
        getraenk10.addActionListener(this);

        // JTextField tf = new JTextField(5);
        NumberFormat f = NumberFormat.getNumberInstance(); 
        JFormattedTextField ntf = new JFormattedTextField(f);
        f.setMaximumIntegerDigits(3);
        ntf.setColumns(5);

        Button btnBestandErhoehen = new Button("Bestand erhoehen");
        btnBestandErhoehen.setBounds(240, 21, 100, 30);
        JLabel bestandMessage = new JLabel();

        btnBestandErhoehen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int tfInt = Integer.parseInt(ntf.getText());
                System.out.println(tfInt);
                if (getraenk1.isSelected()) {
                    Getraenkeverwaltung.getraenk1.bestandErhoehen(tfInt);
                    msgPanel.add(bestandMessage);
                    bestandMessage.setText("Bestand von " + Getraenkeverwaltung.getraenk1.getName() + " wurde um: " + tfInt + " erhoeht.");
                    System.out.println(bestandMessage);
                    revalidate();
                }
                if (getraenk2.isSelected()) {
                    Getraenkeverwaltung.getraenk2.bestandErhoehen(tfInt);
                    msgPanel.add(bestandMessage);
                    bestandMessage.setText("Bestand von " + Getraenkeverwaltung.getraenk2.getName() + " wurde um: " + tfInt + " erhoeht.");
                    System.out.println(bestandMessage);
                    revalidate();
                }
                if (getraenk3.isSelected()) {
                    Getraenkeverwaltung.getraenk3.bestandErhoehen(tfInt);
                    msgPanel.add(bestandMessage);
                    bestandMessage.setText("Bestand von " + Getraenkeverwaltung.getraenk3.getName() + " wurde um: " + tfInt + " erhoeht.");
                    System.out.println(bestandMessage);
                    revalidate();
                }
                if (getraenk4.isSelected()) {
                    Getraenkeverwaltung.getraenk4.bestandErhoehen(tfInt);
                    msgPanel.add(bestandMessage);
                    bestandMessage.setText("Bestand von " + Getraenkeverwaltung.getraenk4.getName() + " wurde um: " + tfInt + " erhoeht.");
                    System.out.println(bestandMessage);
                    revalidate();
                }
                if (getraenk5.isSelected()) {
                    Getraenkeverwaltung.getraenk5.bestandErhoehen(tfInt);
                    msgPanel.add(bestandMessage);
                    bestandMessage.setText("Bestand von " + Getraenkeverwaltung.getraenk5.getName() + " wurde um: " + tfInt + " erhoeht.");
                    System.out.println(bestandMessage);
                    revalidate();
                }
                if (getraenk6.isSelected()) {
                    Getraenkeverwaltung.getraenk6.bestandErhoehen(tfInt);
                    msgPanel.add(bestandMessage);
                    bestandMessage.setText("Bestand von " + Getraenkeverwaltung.getraenk6.getName() + " wurde um: " + tfInt + " erhoeht.");
                    System.out.println(bestandMessage);
                    revalidate();
                }
                if (getraenk7.isSelected()) {
                    Getraenkeverwaltung.getraenk7.bestandErhoehen(tfInt);
                    msgPanel.add(bestandMessage);
                    bestandMessage.setText("Bestand von " + Getraenkeverwaltung.getraenk7.getName() + " wurde um: " + tfInt + " erhoeht.");
                    System.out.println(bestandMessage);
                    revalidate();
                }
                if (getraenk8.isSelected()) {
                    Getraenkeverwaltung.getraenk8.bestandErhoehen(tfInt);
                    msgPanel.add(bestandMessage);
                    bestandMessage.setText("Bestand von " + Getraenkeverwaltung.getraenk8.getName() + " wurde um: " + tfInt + " erhoeht.");
                    System.out.println(bestandMessage);
                    revalidate();
                }
                if (getraenk9.isSelected()) {
                    Getraenkeverwaltung.getraenk9.bestandErhoehen(tfInt);
                    msgPanel.add(bestandMessage);
                    bestandMessage.setText("Bestand von " + Getraenkeverwaltung.getraenk9.getName() + " wurde um: " + tfInt + " erhoeht.");
                    System.out.println(bestandMessage);
                    revalidate();
                }
                if (getraenk10.isSelected()) {
                    Getraenkeverwaltung.getraenk10.bestandErhoehen(tfInt);
                    msgPanel.add(bestandMessage);
                    bestandMessage.setText("Bestand von " + Getraenkeverwaltung.getraenk10.getName() + " wurde um: " + tfInt + " erhoeht.");
                    System.out.println(bestandMessage);
                    revalidate();
                }

            }
        });



        fr.add(navigation, BorderLayout.NORTH);
        fr.add(tfPanel, BorderLayout.SOUTH);
        fr.add(msgPanel, BorderLayout.CENTER);
        // tf.setSize(100, 20);
        ntf.setBounds(133, 25, 100, 20);
        navigation.add(getraenk1);
        navigation.add(getraenk2);
        navigation.add(getraenk3);
        navigation.add(getraenk4);
        navigation.add(getraenk5);
        navigation.add(getraenk6);
        navigation.add(getraenk7);
        navigation.add(getraenk8);
        navigation.add(getraenk9);
        navigation.add(getraenk10);
        tfPanel.add(ntf);
        tfPanel.add(btnBestandErhoehen);
        // fr.pack();
        // fr.setVisible(true);

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == getraenk1) {

        }
    };
}
