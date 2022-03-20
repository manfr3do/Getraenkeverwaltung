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

    BestandErhoehen() {
        // create window
        Frame fr = new Frame();
        fr.setLayout(new BorderLayout());
        fr.setSize(400, 300);

        // create panels
        JPanel navigation = new JPanel();
        navigation.setBackground(headerColor);
        navigation.setPreferredSize(new Dimension(400,75));

        JPanel tfPanel = new JPanel();
        tfPanel.setLayout(null);
        tfPanel.setPreferredSize(new Dimension(400, 75));

        JPanel msgPanel = new JPanel();
        msgPanel.setPreferredSize(new Dimension (400, 20));

        // create radio buttons
        getraenk1 = new JRadioButton(Getraenkeverwaltung.getraenk1.getName());
        getraenk2 = new JRadioButton(Getraenkeverwaltung.getraenk2.getName());
        getraenk3 = new JRadioButton(Getraenkeverwaltung.getraenk3.getName());

        // group them together 
        ButtonGroup group = new ButtonGroup();
        group.add(getraenk1);
        group.add(getraenk2);
        group.add(getraenk3);

        getraenk1.addActionListener(this);
        getraenk2.addActionListener(this);
        getraenk3.addActionListener(this);

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