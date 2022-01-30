import java.util.ArrayList;
import java.util.Scanner;

public class Getraenkeverwaltung {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);



        // Instanz eines Getraenks mit Standard Konstruktor erstellen
        Getraenk getraenk1 = new Getraenk();
        getraenk1.name = "Wasser";
        getraenk1.preis = 1.50;
        getraenk1.bestand = 500;

        // Instanz eines Getraenks mit parametrisierten Konstruktor erstellen
        Getraenk getraenk2 = new Getraenk("Sprite", 2.00, 100);

        // Instanz eines Getraenks mit parametrisierten Konstruktor erstellen
        Getraenk getraenk3 = new Getraenk("Pepsi", 1.99, 200);

        // Instanz eines Snacks mit parametrisierten Konstruktor erstellen
        Snack snack1 = new Snack("Snackers", 0.99, 50, 22);

        ArrayList<Getraenk> getraenkeListe = new ArrayList<Getraenk>();
        getraenkeListe.add(getraenk1);
        getraenkeListe.add(getraenk2);

        for(Getraenk g : getraenkeListe){
            System.out.println(g.getBestand());}


        // Bestand ausgeben
        System.out.println("Informationen getraenk1: ");
        System.out.println("Name: " + getraenk1.name + ", " + "Preis: " + getraenk1.preis + ", " + "Bestand: " + getraenk1.bestand);
        System.out.println("Informationen getraenk2: ");
        System.out.println("Name: " + getraenk2.name + ", " + "Preis: " + getraenk2.preis + ", " + "Bestand: " + getraenk2.bestand);
        System.out.println("Informationen getraenk3: ");
        System.out.println("Name: " + getraenk3.name + ", " + "Preis: " + getraenk3.preis + ", " + "Bestand: " + getraenk3.bestand);
        System.out.println("Informationen snack1: ");
        System.out.println("Name: " + snack1.name + ", " + "Preis: " + snack1.preis + ", " + "Bestand: " + snack1.bestand + ", " + "Lagertemperatur: " + snack1.lagertemperatur);

        System.out.println();

        System.out.println("\nWas wollen Sie machen (1 = Verkauf, 2 = Bestandserhöhung, 3 = beenden)?");
    
        int x = sc.nextInt();
 
        switch (x)
        {
            
        case 1:
            int vkmenge =   sc.nextInt();
            getraenk1.verkaufen(vkmenge);
            break;
        case 2:
            vkmenge =   sc.nextInt();
            getraenk1.bestandErhoehen(vkmenge);
            break;
        case 3:
            return;
        default:
            System.err.println( "Unbekannter Operator " + x);
        }

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
