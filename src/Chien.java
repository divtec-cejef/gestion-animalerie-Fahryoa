public class Chien extends Animal {

    public Chien(String nom, int age, EtatDeSante etatDeSante) {
        super(nom, age, etatDeSante);
    }

    @Override
    public String bruit() {
        return "Wouaf, je suis un chien";
    }

    @Override
    public String soinQuotidien() {
        return "Brosser";
    }
}
