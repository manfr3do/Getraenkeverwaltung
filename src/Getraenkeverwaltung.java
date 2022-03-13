import java.util.ArrayList;
import java.util.Scanner;

public class Getraenkeverwaltung {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);



        // Instanz eines Objekts mit parametrisierten Konstruktor erstellen
        Getraenk getraenk1 = new Getraenk(1, "Pepsi Maxx Original", 0.99, 500);
        Getraenk getraenk2 = new Getraenk(2, "Pepsi Maxx Lemon", 2.00, 100);
        Getraenk getraenk3 = new Getraenk(3, "Pepsi Maxx Cherry", 1.99, 200);
        Snack snack1 = new Snack(4, "Knoppers", 0.99, 50, 22);
        Snack snack2 = new Snack(5, "Pickup", 0.99, 50, 22);
        Snack snack3 = new Snack(6, "Dextro Energy", 0.99, 50, 22);


        ArrayList<Getraenk> getraenkeListe = new ArrayList<Getraenk>();
        getraenkeListe.add(getraenk1);
        getraenkeListe.add(getraenk2);
        getraenkeListe.add(getraenk3);

        for (Getraenk g : getraenkeListe)
        {
            System.out.print("Artikel: " + g.getName() + "\n");
        }
        System.out.println();
        ArrayList<Snack> snackListe = new ArrayList<Snack>();
        snackListe.add(snack1);
        snackListe.add(snack2);
        snackListe.add(snack3);

        for (Snack s : snackListe)
        {
            System.out.print("Artikel: " + s.getName() + "\n");
        }


        // Bestand ausgeben
        // System.out.println("Informationen getraenk1: ");
        // System.out.println("Name: " + getraenk1.name + ", " + "Preis: " + getraenk1.preis + ", " + "Bestand: " + getraenk1.bestand);
        // System.out.println("Informationen getraenk2: ");
        // System.out.println("Name: " + getraenk2.name + ", " + "Preis: " + getraenk2.preis + ", " + "Bestand: " + getraenk2.bestand);
        // System.out.println("Informationen getraenk3: ");
        // System.out.println("Name: " + getraenk3.name + ", " + "Preis: " + getraenk3.preis + ", " + "Bestand: " + getraenk3.bestand);
        // System.out.println("Informationen snack1: ");
        // System.out.println("Name: " + snack1.name + ", " + "Preis: " + snack1.preis + ", " + "Bestand: " + snack1.bestand + ", " + "Lagertemperatur: " + snack1.lagertemperatur);

        System.out.println();

        
        boolean menu = true;
        
        do 
        {
            System.out.println("\nWas wollen Sie machen (1 = Verkauf, 2 = Bestandserhöhung, 3 = beenden)?");
            int choice = sc.nextInt();
            if (choice == 1)
            {
                System.out.println("Verkauf");
                System.out.println("Welches Getränk soll verkauft werden?\n");
                
                // Liste der Getränke drucken
                for (Getraenk g : getraenkeListe) {
                    System.out.println("[" + (int)g.getId() + "] " + g.getName());
                }
                System.out.println("---------------");
                int getraenkeChoice = sc.nextInt();
                // Auswahl durchführen
                if (getraenkeChoice == 1)
                {
                    System.out.println("Aktueller Bestand: " + getraenk1.getBestand() + "\n");
                    System.out.println("Verkaufsmenge: ");
                    int verkaufsChoice = sc.nextInt();
                    getraenk1.verkaufen(verkaufsChoice);
                    System.out.println("Neuer Bestand: " + getraenk1.getBestand());
                }
                // Verkaufen
            }
            if (choice == 3)
            {
                menu = false;
            } 
        }
        while (menu);
 




        // Bestand erhoehen
        // getraenk1.bestandErhoehen(menge);
        // System.out.println("Bestand erhoeht.");
        // System.out.println("Neuer Bestand: " + getraenk1.bestand);
        // System.out.println(getraenk1.verkaufen(6));
        // System.out.println("Neuer Bestand: " + getraenk1.bestand);

        // Scanner schließen
        sc.close();
    }
}
