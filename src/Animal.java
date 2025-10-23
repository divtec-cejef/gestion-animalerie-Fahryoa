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
    public abstract String soinQuotidien(Employe employe);

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "je m'appelle " + nom + ", j'ai " + age + " et mon état de santé est : " + etatDeSante.getNom();
    }
}
