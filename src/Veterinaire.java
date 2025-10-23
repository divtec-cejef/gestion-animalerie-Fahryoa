public class Veterinaire extends Employe {

    public Veterinaire(String nom, String prenom, int salaire) {
        super(nom, prenom, salaire, "Vétérinaire");
    }

    @Override
    public String effectuerUneTache(Animal animal) {
        return "Je soigne " + animal.getNom() + ". ";
    }
}
