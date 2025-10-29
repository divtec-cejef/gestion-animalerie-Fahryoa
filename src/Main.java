public class Main {
    public static void main(String[] args) {

        Employe employe1 = new Veterinaire("Dion", "Céline", 1);
        Employe employe2 = new Soigneur("Dupont", "Martin", 9999);
        System.out.println(employe1);

        Chien chien = new Chien("Edouard", 14, EtatDeSante.SOIN_INTENSIF);
        chien.soinQuotidien(employe2);
        ConsoleIO.afficherUnString(chien.bruit());
        ConsoleIO.afficherUnString(chien.toString());

        employe1.effectuerUneTache(chien);
        employe2.effectuerUneTache(chien);

        ConsoleIO.afficherUnString(chien.toString());
        chien.soigner(employe2);
        chien.soigner(employe1);
        chien.soigner(employe1);
        ConsoleIO.afficherUnString(chien.toString());

    }
}

