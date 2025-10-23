public class Lapin extends Animal {

    public Lapin(String nom, int age, EtatDeSante etatDeSante) {
        super(nom, age, etatDeSante);
    }

    @Override
    public String bruit() {
        return "Clap Clap, je suis un lapin";
    }

    @Override
    public String soinQuotidien() {
        return "Nettoyer";
    }
}
