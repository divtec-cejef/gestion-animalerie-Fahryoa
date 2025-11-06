public class Soigneur extends Employe {

    public Soigneur(String nom, String prenom, int salaire) {
        super(nom, prenom, salaire);
        super.role = "Soigneur";
    }

    @Override
    public void effectuerUneTache(Animal animal) {
        animal.soinQuotidien(this);
    }
}
