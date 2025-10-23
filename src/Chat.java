public class Chat extends Animal {

    public Chat(String nom, int age, EtatDeSante etatDeSante) {
        super(nom, age, etatDeSante);
    }

    @Override
    public String bruit() {
        return "Miaou, je suis un chat";
    }

    @Override
    public String soinQuotidien(Employe employe) {
        return employe.getPrenom() + " " + employe.getNom() + " Caresse " + super.getNom() + ". ";
    }

    @Override
    public String toString() {
        return "Je suis un chat, " + super.toString();
    }
}
