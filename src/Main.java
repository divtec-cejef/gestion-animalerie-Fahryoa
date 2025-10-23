public class Main {
    public static void main(String[] args) {

        Employe employe1 = new Veterinaire("Dion", "Céline", 1);
        Employe employe2 = new Soigneur("Dupont", "Martin", 9999);
        System.out.println(employe1);

        Chien chien = new Chien("Edouard", 14, EtatDeSante.SOIN_INTENSIF);
        System.out.println(chien.soinQuotidien(employe1));
        System.out.println(chien.bruit());
        System.out.println(chien);

        System.out.println(employe1.effectuerUneTache(chien));
        System.out.println(employe2.effectuerUneTache(chien));

    }
}
