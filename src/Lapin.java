public class Lapin extends Animal {

    public Lapin(String nom, int age, EtatDeSante etatDeSante) {
        super(nom, age, etatDeSante);
    }

    @Override
    public String bruit() {
        return "Clap Clap, je suis un lapin";
    }

    @Override
    public void soinQuotidien(Employe employe) {
        if (employe.getRole().equals("Soigneur")) {
            ConsoleIO.afficherUnString(employe.getPrenom() + " " + employe.getNom() + " Nourri " + super.getNom() + ". ");
        } else {
            ConsoleIO.afficherUnString("L'employe n'a pas les compétences requise");
        }
    }

    @Override
    public String toString() {
        return "Je suis un lapin, " + super.toString();
    }
}
