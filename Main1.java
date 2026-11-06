import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Etudiant e = new Etudiant("amdoun", "07123456", "GT-1");
        int choix;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1) Afficher details Etudiant");
            System.out.println("2) Afficher CodeE et Classe");
            System.out.println("3) Quitter");
            System.out.print("Votre choix : ");
            
            choix = scanner.nextInt();  
            scanner.nextLine();        

            switch (choix) {
                case 1:
                    System.out.println("Nom de l'étudiant est " + e.getNomE() + ", son code est " + e.getCodeE() + ", sa classe est " + e.getClasse());
                    break;
                case 2:
                    System.out.println("Code est " + e.getCodeE() + ", sa classe est " + e.getClasse());
                    break;
                case 3:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }

        } while (choix != 3);

        scanner.close();
    }
}