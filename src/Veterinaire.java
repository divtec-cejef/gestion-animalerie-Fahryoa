public class Veterinaire extends Employe {

    public Veterinaire(String nom, String prenom, int salaire) {
        super(nom, prenom, salaire, "Vétérinaire");
    }

    @Override
    public void effectuerUneTache(Animal animal) {
        animal.soigner(this);
    }
}
