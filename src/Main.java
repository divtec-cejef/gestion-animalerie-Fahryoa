import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animaux = new ArrayList<>();
        ArrayList<Employe> employes = new ArrayList<>();
        Animal animal1 = new Chat("Pepsi", 9, EtatDeSante.SOIN_INTENSIF);
        Animal animal2 = new Chien("Cookie", 5, EtatDeSante.SOIN_INTENSIF);
        Animal animal3 = new Lapin("Panpan", 1, EtatDeSante.SOIN_INTENSIF);
        animaux.add(animal1);
        animaux.add(animal2);
        animaux.add(animal3);
        Employe employe1 = new Soigneur("Dupont", "Pierre", 3000);
        Employe employe2 = new Veterinaire("Bélet", "Marc", 3000);
        employes.add(employe1);
        employes.add(employe2);
        int choixMenuPrincipal = 0;
        do {

            ConsoleIO.afficherMenu();
            choixMenuPrincipal = ConsoleIO.demanderUnChiffre(8, 1);
            switch (choixMenuPrincipal) {
                case 1: animaux.add(creerAnimalUtilisateur());      break;
                case 2: employes.add(creerEmployeUtilisateur());    break;
                case 3: ConsoleIO.afficherListeEmployes(employes);  break;
                case 4: ConsoleIO.afficherListeAnimaux(animaux);    break;
                case 5: faireUneTache(animaux, employes);           break;
                case 6: faireUnBruit(animaux);                      break;
            }

        } while (choixMenuPrincipal != 7);
    }

    public static Employe creerEmployeUtilisateur() {
        String nom = "";
        String prenom = "";
        int salaire = 0;
        int role = 0;
        Employe employe;

            ConsoleIO.afficherUnString("Quelle est le nom de votre employé ? ");
            nom = ConsoleIO.demanderUnStringDe(50, 1);

            ConsoleIO.afficherUnString("Quelle est le prénom de votre employé ? ");
            prenom = ConsoleIO.demanderUnStringDe(50, 1);

            ConsoleIO.afficherUnString("Quelle est le salaire de votre employé ? ");
            salaire = ConsoleIO.demanderUnChiffre(1000000, 1);

            ConsoleIO.afficherMenuTypeEmploye();
            role = ConsoleIO.demanderUnChiffre(3, 1);

        switch(role) {
            case 1: employe = new Veterinaire(nom, prenom, salaire); break;
            default: employe = new Soigneur(nom, prenom, salaire);   break;
        }

        ConsoleIO.afficherUnString("L'employé a bien été ajouté");
        return employe;
    }

    public static Animal creerAnimalUtilisateur() {
        String nom = "";
        int age = 0;
        Animal animal;
        int role = 0;

            ConsoleIO.afficherUnString("Quelle est le nom de votre animal ? ");
            nom = ConsoleIO.demanderUnStringDe(50, 1);

            ConsoleIO.afficherUnString("Quelle est l'age de votre animal ? ");
            age = ConsoleIO.demanderUnChiffre(100, 1);

            ConsoleIO.afficherMenuTypeAnimaux();
            role = ConsoleIO.demanderUnChiffre(4, 1);

        switch(role) {
            case 1: animal = new Chat(nom, age, EtatDeSante.SOIN_INTENSIF);  break;
            case 2: animal = new Chien(nom, age, EtatDeSante.SOIN_INTENSIF); break;
            default: animal = new Lapin(nom, age, EtatDeSante.SOIN_INTENSIF);
        }

        ConsoleIO.afficherUnString("L'animal a bien été ajouté");
        return animal;
    }

    public static void faireUnBruit(ArrayList<Animal> animaux) {
        if (animaux.isEmpty()) {
            ConsoleIO.afficherUnString("Vous n'avez pas d'animaux");
            return;
        }
        ConsoleIO.afficherListeAnimaux(animaux);
        ConsoleIO.afficherUnString("Selectionner un animal : ");
        ConsoleIO.afficherUnString(animaux.get(ConsoleIO.demanderUnChiffre(animaux.size() + 1, 1) - 1).bruit());
    }

    public static void faireUneTache(ArrayList<Animal> animaux, ArrayList<Employe> employes) {
        int indexAnimal = 0;
        int indexEmploye = 0;

        if (animaux.isEmpty()) {
            ConsoleIO.afficherUnString("Vous n'avez pas d'animaux");
            return;
        }
        ConsoleIO.afficherListeAnimaux(animaux);
        ConsoleIO.afficherUnString("Selectionner un animal : ");
        indexAnimal = ConsoleIO.demanderUnChiffre(animaux.size() + 1, 1) - 1;
        if (employes.isEmpty()) {
            ConsoleIO.afficherUnString("Vous n'avez pas d'employés");
            return;
        }
        ConsoleIO.afficherListeEmployes(employes);
        ConsoleIO.afficherUnString("Selectionner un employé : ");
        indexEmploye = ConsoleIO.demanderUnChiffre(employes.size() + 1, 1) - 1;
        employes.get(indexEmploye).effectuerUneTache(animaux.get(indexAnimal));
    }
}

// TODO : mettre le test des valeurs (do while) directement dans les fonction demander un String, un nombre