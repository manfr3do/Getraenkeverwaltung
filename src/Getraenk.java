public class Getraenk {
    // Attribute der Getraenke-Klasse
    String name;
    float preis;
    int bestand;
    
    // Erstellung des Konstruktors
    public Getraenk() {
    // Attribute des Konstruktors
    
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void bestandErhoehen(int wert) {
        bestand = bestand + wert;
    }

    public void bestandVerringern(int wert) {
        bestand = bestand - wert;
    }

    public void verkaufen(int anzahl) {
        String ausgabetext = "Es wurden getraenke verkauft";

    }
}
