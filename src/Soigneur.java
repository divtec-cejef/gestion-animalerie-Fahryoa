public class Soigneur extends Employe {

    public Soigneur(String nom, String prenom, int salaire) {
        super(nom, prenom, salaire, "Soigneur");
    }

    @Override
    public String effectuerUneTache(Animal animal) {
        return animal.soinQuotidien(this);
    }
}
