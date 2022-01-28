public class Getraenkeverwaltung {
    public static void main(String[] args) throws Exception {
        
        // Instanz eines Getraenks erstellen
        Getraenk getraenk1 = new Getraenk();
        getraenk1.bestandErhoehen(5);
        System.out.println("Bestand: " + getraenk1.bestand);
    }
}
