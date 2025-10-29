public abstract class Animal {
    private String nom;
    private int age;
    private EtatDeSante etatDeSante;

    public Animal(String nom, int age, EtatDeSante etatDeSante) {
        this.nom = nom;
        this.age = age;
        this.etatDeSante = etatDeSante;
    }

    public abstract String bruit();
    public abstract void soinQuotidien(Employe employe);

    public void soigner(Employe employe) {
        if (etatDeSante != EtatDeSante.SAIN && employe.getRole().equals("Vétérinaire")) {
            etatDeSante = EtatDeSante.values()[etatDeSante.ordinal() - 1] ;
            ConsoleIO.afficherUnString(employe.getPrenom() + " " + employe.getNom() + " Soigne " + nom + ". ");
        } else if(etatDeSante != EtatDeSante.SAIN) {
            ConsoleIO.afficherUnString("L'employe n'a pas les compétences requise");
        } else {
            ConsoleIO.afficherUnString("L'animal a déjà l'état de santé maximal");
        }
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "je m'appelle " + nom + ", j'ai " + age + " ans et mon état de santé est : " + etatDeSante.getNom();
    }
}
