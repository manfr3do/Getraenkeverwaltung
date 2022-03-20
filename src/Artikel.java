public class Artikel {
    // Attribute
    protected int id;
    protected String name;
    protected double preis;
    protected int bestand;

    // Konstruktor
    public Artikel() {

    }
    public Artikel(int id, String name, double preis, int bestand) {
        this.id = id;
        this.name = name;
        this.preis = preis;
        this.bestand = bestand;
    }

    // Getter & Setter
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPreis(double preis) {
        this.preis = preis;
    }
    public void setBestand(int bestand) {
        this.bestand = bestand;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPreis() {
        return preis;
    }
    public int getBestand() {
        return bestand;
    }

    // Methoden
    public void bestandErhoehen(int wert) {
        bestand = bestand + wert;
    }
    public void bestandVerringern(int wert) {
        bestand = bestand - wert;
    }
    public String verkaufen(int menge) {
        String ausgabetext = kassenzettelDrucken(menge);
        if (bestand < menge) 
        {
            System.out.println("Leider uebersteigt diese Menge unseren Bestand.");
        } 
        else if (bestand == menge)
        {
            bestand = bestand - menge;
            ausgabetext = kassenzettelDrucken(menge) + "Nun ist " + this.getName() + " alle...";
        } 
        else 
        {
            bestand = bestand - menge;
            ausgabetext = kassenzettelDrucken(menge);
        }
        return ausgabetext;
    }
    public String kassenzettelDrucken(int menge) {
        String kassenzettel;
        double gesamtpreis;
        gesamtpreis = preis * menge;
        kassenzettel = "Name: " + name + "\nVerkaufsmenge: " + menge + "\nPreis in EUR: " + preis + "\nGesamtpreis: " + gesamtpreis + "\n";
        return kassenzettel;
    }

}
