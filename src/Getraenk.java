public class Getraenk extends Artikel {
    // Attribute wurden vererbt

    // Konstruktoren
    // super() ruft den Konstruktor der Oberklasse auf
    public Getraenk() {
        super();
    }
    public Getraenk(String name, double preis, int bestand) {
        super(name, preis, bestand);
    }

}
