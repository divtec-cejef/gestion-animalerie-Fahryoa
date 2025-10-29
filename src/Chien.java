public class Chien extends Animal {

    public Chien(String nom, int age, EtatDeSante etatDeSante) {
        super(nom, age, etatDeSante);
    }

    @Override
    public String bruit() {
        return "Wouaf, je suis un chien";
    }

    @Override
    public void soinQuotidien(Employe employe) {
        if (employe.getRole().equals("Soigneur")) {
            ConsoleIO.afficherUnString(employe.getPrenom() + " " + employe.getNom() + " Caresse " + super.getNom() + ". ");
        } else {
            ConsoleIO.afficherUnString("L'employe n'a pas les compétences requise");
        }
    }

    @Override
    public String toString() {
        return "Je suis un chien, " + super.toString();
    }
}
