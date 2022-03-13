public class Getraenk extends Artikel {
    // Attribute wurden vererbt

    // Konstruktoren
    // super() ruft den Konstruktor der Oberklasse auf
    public Getraenk() {
        super();
    }
    public Getraenk(int id, String name, double preis, int bestand) {
        super(id, name, preis, bestand);
    }

}
