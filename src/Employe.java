public abstract class Employe {
    private String nom;
    private String prenom;
    private int salaire;
    protected String role;

    public Employe(String nom, String prenom, int salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    public abstract void effectuerUneTache(Animal animal);

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Je suis " + prenom + " " + nom + ", mon salaire est de : " + salaire + "CHF et je suis " + role + ". ";
    }
}