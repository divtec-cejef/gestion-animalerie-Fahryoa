public class Main {
    public static void main(String[] args) {

        Chien chien = new Chien("Edouard", 14, EtatDeSante.SOIN_INTESIF);
        System.out.println(chien.soinQuotidien());
        System.out.println(chien.bruit());

    }
}
