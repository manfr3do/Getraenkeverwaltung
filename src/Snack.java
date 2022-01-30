public class Snack extends Artikel {
    double lagertemperatur;
    public Snack() {
        super();
    }
    public Snack(String name, double preis, int bestand, double lagertemperatur) {
        super(name, preis, bestand);
        this.lagertemperatur = lagertemperatur;
    }
    
}
