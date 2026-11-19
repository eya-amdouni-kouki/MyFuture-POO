import java.util.Scanner;

public class tableau {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] tab = {10, 15, 13, 12};
        int[][] matrix = new int[2][2];
        int choix;
        
        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Afficher tableau 1");
            System.out.println("2. Ajouter 2eme tableau");
            System.out.println("3. Quitter");
            System.out.print("Votre choix : ");
            choix = input.nextInt();
            
            switch (choix) {
                case 1:
                    System.out.println(" Tableau 1");
                    System.out.println("Longueur du tableau : " + tab.length);
                    for (int i = 0; i < tab.length; i++) {
                        System.out.println("tab[" + i + "] = " + tab[i]);
                    }
                    break;
                    
                case 2:
                    System.out.println(" Saisie tableau 2");
                    for (int row = 0; row < matrix.length; row++) {
                        for (int column = 0; column < matrix[row].length; column++) {
                            System.out.print("matrix[" + row + "][" + column + "] = ");
                            matrix[row][column] = input.nextInt();
                        }
                    }
                    
                    break;
                    
                case 3:
                    System.out.println("Au revoir !");
                    break;
                    
                default:
                    System.out.println("Choix invalide ! Veuillez recommencer.");
                    break;
            }
        } while (choix != 3);
        
        input.close();
    }
}
