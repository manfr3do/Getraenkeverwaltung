public class Mitarbeiter {
    private int id;
    private String name;
    private String adresse;
    private double gehalt;

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAdresse() {
        return adresse;
    }
    public double getGehalt() {
        return gehalt;
    }
}
