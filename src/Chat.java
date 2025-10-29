public class Chat extends Animal {

    public Chat(String nom, int age, EtatDeSante etatDeSante) {
        super(nom, age, etatDeSante);
    }

    @Override
    public String bruit() {
        return "Miaou, je suis un chat";
    }

    @Override
    public void soinQuotidien(Employe employe) {
        if (employe.getRole().equals("Soigneur")) {
            ConsoleIO.afficherUnString(employe.getPrenom() + " " + employe.getNom() + " Caresse " + super.getNom() + ". ");
        } else {
            ConsoleIO.afficherUnString("L'employe n'a pas les compétences requise");
        }
    }

    @Override
    public String toString() {
        return "Je suis un chat, " + super.toString();
    }
}
