public enum EtatDeSante {
    SAIN("Sain"),
    SOIN_LEGER("Soin leger"),
    SOIN_INTENSIF("Soin intensif");

    private String nom;

    EtatDeSante(String nom){
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}
