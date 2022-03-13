public class Snack extends Artikel {
    double lagertemperatur;
    public Snack() {
        super();
    }
    public Snack(int id, String name, double preis, int bestand, double lagertemperatur) {
        super(id, name, preis, bestand);
        this.lagertemperatur = lagertemperatur;
    }
    
}
