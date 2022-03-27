import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Getraenkeverwaltung extends Firma {
    
    public static Artikel getraenk1 = new Getraenk(1, "Pepsi Maxx Original", 0.99, 500);
    public static Getraenk getraenk2 = new Getraenk(2, "Pepsi Maxx Lemon", 2.00, 100);
    public static Getraenk getraenk3 = new Getraenk(3, "Pepsi Maxx Cherry", 1.99, 200);
    public static Getraenk getraenk4 = new Getraenk(3, "Pepsi Maxx Waldmeister", 1.99, 200);
    public static Getraenk getraenk5 = new Getraenk(3, "Pepsi Maxx Banane", 1.99, 200);
    public static Getraenk getraenk6 = new Getraenk(3, "Pepsi Maxx Orange", 1.99, 200);
    public static Getraenk getraenk7 = new Getraenk(3, "Pepsi Maxx Ultra", 1.99, 200);
    public static Getraenk getraenk8 = new Getraenk(3, "Pepsi Maxx Mango", 1.99, 200);
    public static Getraenk getraenk9 = new Getraenk(3, "Pepsi Maxx Mezzo", 1.99, 200);
    public static Getraenk getraenk10 = new Getraenk(3, "Pepsi Maxx Wasser", 1.99, 200);
    public static void main(String[] args) throws Exception {
        new Getraenkeverwaltung().buildUi();

        Mitarbeiter m1 = new Mitarbeiter();
        m1.setName("Chris P. Bacon");


        /*
        // Legacy code (before GUI)
        ArrayList<Getraenk> getraenkeListe = new ArrayList<Getraenk>();
        getraenkeListe.add(getraenk1);
        getraenkeListe.add(getraenk2);
        getraenkeListe.add(getraenk3);

        ArrayList<Snack> snackListe = new ArrayList<Snack>();
        snackListe.add(snack1);
        snackListe.add(snack2);
        snackListe.add(snack3);

        Scanner sc = new Scanner(System.in);
        
        // Instanz eines Objekts mit parametrisierten Konstruktor erstellen
        // Getraenk getraenk1 = new Getraenk(1, "Pepsi Maxx Original", 0.99, 500);
        // Getraenk getraenk2 = new Getraenk(2, "Pepsi Maxx Lemon", 2.00, 100);
        // Getraenk getraenk3 = new Getraenk(3, "Pepsi Maxx Cherry", 1.99, 200);
        // Snack snack1 = new Snack(4, "Knoppers", 0.99, 50, 22);
        // Snack snack2 = new Snack(5, "Pickup", 0.99, 50, 22);
        // Snack snack3 = new Snack(6, "Dextro Energy", 0.99, 50, 22);
        
        // ArrayList<Getraenk> getraenkeListe = new ArrayList<Getraenk>();
        // getraenkeListe.add(getraenk1);
        // getraenkeListe.add(getraenk2);
        // getraenkeListe.add(getraenk3);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" + Firma.impressum() + "\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        // Getraenkeliste ausgeben
        for (Getraenk g : getraenkeListe)
        {
            System.out.print("Artikel: " + g.getName() + "\n");
        }
        
        System.out.println();
        
        // Snack Liste ausgeben
        // for (Snack s : snackListe)
        // {
        //     System.out.print("Artikel: " + s.getName() + "\n");
        // }

        System.out.println();
        
        boolean menu = true;
        
        do 
        {
            System.out.println("\nWas wollen Sie machen (0 = Bestand anzeigen, 1 = Verkauf, 2 = Bestandserhöhung, 3 = beenden)?");
            System.out.print("> ");
            int choice = sc.nextInt();
            if (choice == 0)
            {
                System.out.println("Getraenk: " + getraenk1.getName() + "\n" + "Bestand: " + getraenk1.getBestand());
                System.out.println("---------------");
                System.out.println("Getraenk: " + getraenk2.getName() + "\n" + "Bestand: " + getraenk2.getBestand());
                System.out.println("---------------");
                System.out.println("Getraenk: " + getraenk3.getName() + "\n" + "Bestand: " + getraenk3.getBestand());
            }
            if (choice == 1)
            {
                System.out.println("---------------");
                System.out.println("# Verkauf #");
                System.out.println("---------------");
                System.out.println("Welches Getränk soll verkauft werden?\n");
                
                // Liste der Getränke drucken
                for (Getraenk g : getraenkeListe) {
                    System.out.println("[" + (int)g.getId() + "] " + g.getName());
                }

                System.out.println("---------------");
                System.out.print("> ");
                int getraenkeChoice = sc.nextInt();
                // Auswahl durchführen
                if (getraenkeChoice == 1)
                {
                    System.out.println("Aktueller Bestand: " + getraenk1.getBestand() + "\n");
                    System.out.print("Verkaufsmenge: ");
                    int verkaufsChoice = sc.nextInt();
                    getraenk1.verkaufen(verkaufsChoice);
                    System.out.println(getraenk1.kassenzettelDrucken(verkaufsChoice));
                    System.out.println("Neuer Bestand: " + getraenk1.getBestand());
                }
                if (getraenkeChoice == 2)
                {
                    System.out.println("Aktueller Bestand: " + getraenk2.getBestand() + "\n");
                    System.out.print("Verkaufsmenge: ");
                    int verkaufsChoice = sc.nextInt();
                    getraenk2.verkaufen(verkaufsChoice);
                    System.out.println("Neuer Bestand: " + getraenk2.getBestand());
                }
                if (getraenkeChoice == 3)
                {
                    System.out.println("Aktueller Bestand: " + getraenk3.getBestand() + "\n");
                    System.out.print("Verkaufsmenge: ");
                    int verkaufsChoice = sc.nextInt();
                    getraenk3.verkaufen(verkaufsChoice);
                    System.out.println("Neuer Bestand: " + getraenk3.getBestand());
                }
            }
            if (choice == 2)
            {
                System.out.println("---------------");
                System.out.println("# Bestand erhoehen #");
                System.out.println("---------------");
                System.out.println("Von welchem Getraenk soll der Bestand erhoeht werden?\n");

                // Liste der Getränke drucken
                for (Getraenk g : getraenkeListe) {
                    System.out.println("[" + (int)g.getId() + "] " + g.getName());
                }

                System.out.println("---------------");
                System.out.print("> ");
                int getraenkeChoice = sc.nextInt();

                // Auswahl durchführen
                if (getraenkeChoice == 1)
                {
                    System.out.println("Aktueller Bestand: " + getraenk1.getBestand() + "\n");
                    System.out.print("Bestand erhoehen: ");
                    int bestandChoice = sc.nextInt();
                    getraenk1.bestandErhoehen(bestandChoice);
                    System.out.println("Neuer Bestand: " + getraenk1.getBestand());
                }
                if (getraenkeChoice == 2)
                {
                    System.out.println("Aktueller Bestand: " + getraenk2.getBestand() + "\n");
                    System.out.print("Bestand erhoehen: ");
                    int bestandChoice = sc.nextInt();
                    getraenk2.bestandErhoehen(bestandChoice);
                    System.out.println("Neuer Bestand: " + getraenk2.getBestand());
                }
                if (getraenkeChoice == 3)
                {
                    System.out.println("Aktueller Bestand: " + getraenk3.getBestand() + "\n");
                    System.out.print("Bestand erhoehen: ");
                    int bestandChoice = sc.nextInt();
                    getraenk3.bestandErhoehen(bestandChoice);
                    System.out.println("Neuer Bestand: " + getraenk3.getBestand());
                }
            }
            if (choice == 3)
            {
                menu = false;
            } 
        }
        while (menu);
 
        // Scanner schließen
        sc.close();
        // end legacy code
        */ 
    }

    public void buildUi() {
        // create the main window
        Frame fr = new Frame();
        fr.setLayout(new BorderLayout());

        // define colors
        Color headerColor = new Color(38, 70, 83);
        Color contentColor = new Color(42, 157, 143);
       
        // create navigation pane at the top
        JPanel navigation = new JPanel();
        navigation.setBackground(headerColor);
        navigation.setLayout(new GridLayout(2,4));
        navigation.setPreferredSize(new Dimension(800,50));

        // create content pane in the middle
        JPanel content = new JPanel();
        content.setBackground(contentColor);
        content.setPreferredSize(new Dimension(800, 500));
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));


        
        // create footer pane at the bottom
        JPanel footer = new JPanel();
        footer.setBackground(headerColor);
        footer.setLayout(new GridLayout(1,1));
        footer.setPreferredSize(new Dimension(800, 50));
        footer.setLayout(new BorderLayout());

        // show impressum in the footer pane
        JLabel impressum = new JLabel(Firma.impressum());
        impressum.setHorizontalAlignment(SwingConstants.CENTER); // Platziert den Text mittig
        impressum.setForeground(Color.white);
        
        // create the buttons
        Button btnBestand = new Button("Bestand anzeigen");
        Button btnVerkauf = new Button("Verkaufen");
        Button btnErhoehen = new Button("Bestand erhoehen");
        Button btnExit = new Button("Exit");
        Button btnClear = new Button("clear");
        Button btnMitarbeiter = new Button("Mitarbeiter");

        // display beverages on button click
        btnBestand.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String column [] = {"Artikelnummer", "Artikel", "Bestand"};
                Object data [][] = {
                    {getraenk1.getId(), getraenk1.getName(), getraenk1.getBestand()},
                    {getraenk2.getId(), getraenk2.getName(), getraenk2.getBestand()},
                    {getraenk3.getId(), getraenk3.getName(), getraenk3.getBestand()},
                    {getraenk4.getId(), getraenk4.getName(), getraenk4.getBestand()},
                    {getraenk5.getId(), getraenk5.getName(), getraenk5.getBestand()},
                    {getraenk6.getId(), getraenk6.getName(), getraenk6.getBestand()},
                    {getraenk7.getId(), getraenk7.getName(), getraenk7.getBestand()},
                    {getraenk8.getId(), getraenk8.getName(), getraenk8.getBestand()},
                    {getraenk9.getId(), getraenk9.getName(), getraenk9.getBestand()},
                    {getraenk10.getId(), getraenk10.getName(), getraenk10.getBestand()}
                };
                JTable table = new JTable(data, column);
                JScrollPane sp = new JScrollPane(table);
                content.removeAll();
                content.revalidate();
                content.repaint();
                content.add(sp);    
            }
        });

        // open new sale window
        btnVerkauf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Verkaufen();
            }
        });

        btnErhoehen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new BestandErhoehen();
            }
        });

        // close the program
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                content.removeAll();
                content.revalidate();
                content.repaint();
            }
        });

        // add the buttons to the navigation pane
        navigation.add(btnBestand);
        navigation.add(btnVerkauf);
        navigation.add(btnErhoehen);
        navigation.add(btnMitarbeiter);
        navigation.add(btnClear);
        navigation.add(btnExit);


        // add the impressum to the footer pane
        footer.add(impressum, BorderLayout.CENTER);

        // add the three main panels to the window
        fr.add(navigation, BorderLayout.NORTH);
        fr.add(content, BorderLayout.CENTER);
        fr.add(footer, BorderLayout.SOUTH);
        fr.pack();
    }


}
