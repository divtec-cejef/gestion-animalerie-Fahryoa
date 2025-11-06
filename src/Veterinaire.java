public class Veterinaire extends Employe {

    public Veterinaire(String nom, String prenom, int salaire) {
        super(nom, prenom, salaire);
        super.role = "Vétérinaire";
    }

    @Override
    public void effectuerUneTache(Animal animal) {
        animal.soigner(this);
    }
}
