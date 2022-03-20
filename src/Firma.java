public class Firma {
    static String impressum() {
        String name = "Good Guy Getraenkemarkt GmbH";
        String inhaber = "Good Guy";
        String strasse = "Am Inselpark 35";
        String plz = "22445";
        String stadt = "Hamburg";
        String adresse = strasse + "\n" + plz + " " + stadt;
        return name + " - " + inhaber + " - " + adresse;
    }
}