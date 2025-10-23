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
    public abstract String soinQuotidien();
}
