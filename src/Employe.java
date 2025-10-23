public abstract class Employe {
    private String nom;
    private String prenom;
    private int salaire;
    private String role;

    public Employe(String nom, String prenom, int salaire, String role) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
        this.role = role;
    }

    public abstract String effectuerUneTache(Animal animal);

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public String toString() {
        return "Je suis " + prenom + " " + nom + ", mon salaire est de : " + salaire + "CHF et je suis " + role + ". ";
    }
}