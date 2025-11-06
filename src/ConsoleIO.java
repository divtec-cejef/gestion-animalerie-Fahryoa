import java.util.Scanner;
import java.util.ArrayList;

public class ConsoleIO {
    public static void afficherUnString(String StringAAfficher) {
        System.out.println(StringAAfficher);
    }

    public static void afficherMenu() {
        System.out.println("Menu\n" +
                "1) Ajouter un animal\n" +
                "2) Ajouter un employé\n" +
                "3) Afficher tous les employés\n" +
                "4) Afficher tous les animaux\n" +
                "5) Effectuer une tâche (employé)\n" +
                "6) Faire un bruit (Animal)\n" +
                "7) Quitter\n\n" +
                "Que voulez-vous faire ? (1 - 7)\n");
    }

    public static void afficherListeEmployes(ArrayList<Employe> employes) {
        System.out.println("Liste des employés : ");

        if (employes.isEmpty()) {
            System.out.println("Vous n'avez pas employés");
        }
        for (int i = 0; i < employes.size(); i++) {
            afficherUnString(i + 1 + ") " + employes.get(i).toString());
        }
    }

    public static void afficherListeAnimaux(ArrayList<Animal> animaux) {
        System.out.println("Liste des animaux : ");

        if (animaux.isEmpty()) {
            System.out.println("Vous n'avez pas d'animaux");
        }
        for (int i = 0; i < animaux.size(); i++) {
            afficherUnString(i + 1 + ") " + animaux.get(i).toString());
        }
    }

    public static int demanderUnChiffre(int borneSup, int borneInf) {
        Scanner scanner = new Scanner(System.in);
        boolean saisieValide = false;
        int choix = 0;

        do {
            if (scanner.hasNextInt()) {
                int saisie = scanner.nextInt();
                if (saisie < borneSup && borneInf <= saisie) {
                    choix = saisie;
                    saisieValide = true;
                } else {
                    System.out.println("Erreur de saisie! Votre saisie est possiblement érroné. \n Nouvelle saisie : ");
                }
            }
        } while (!saisieValide);
        return choix;
    }

    public static String demanderUnStringDe(int CaractereMax, int CaractereMin) {
        String saisie = "erreur";
        boolean saisieValide = false;
        Scanner scanner = new Scanner(System.in);
        String ligne = scanner.nextLine();
        do {
            if (ligne.length() < CaractereMax && ligne.length() > CaractereMin) {
                saisie = ligne;
                saisieValide = true;
            } else {
                System.out.println("Erreur de saisie! Votre saisie est possiblement érroné. \n Nouvelle saisie : ");
            }
        } while(!saisieValide);
        return saisie;
    }

    public static void afficherMenuTypeEmploye() {
        System.out.println("Quelle est le role de votre employé ? \n" +
                "1) Vétérinaire \n" +
                "2) Soigneur \n\n" +
                "Sélectioner (1 ou 2) : ");
    }

    public static void afficherMenuTypeAnimaux() {
        System.out.println("Quelle espèce d'animaux souhaitez-vous choisir ?\n" +
                "1) Chat \n" +
                "2) Chien \n" +
                "3) Lapin \n\n" +
                "Sélectioner (1 - 3) : ");
    }

}
