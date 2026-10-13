import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        personne p = new personne();
        p.saisir();

        int choix;
        do {
            System.out.println("========== MENU ==========");
            System.out.println("1. Visualiser les détails");
            System.out.println("2. Quitter");
            System.out.print("Votre choix : ");
            
            choix = s.nextInt();
            s.nextLine();

            switch (choix) {
                case 1:
                    p.afficher();
                    break;
                case 2:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
         } while (choix != 2);

        s.close();
    }
}
