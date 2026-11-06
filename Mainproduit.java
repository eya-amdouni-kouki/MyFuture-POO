import java.util.Scanner;

public class Mainproduit {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        produit p = new produit(" Ref1", " ordinateur", 600.000, 10);
        p.afficher();
        produit p1 = new produit(" Ref2", " souris", 15.000, 5);
        p1.getreference();
        p1.setquantite(10);
        p1.afficher();
        p1.getquantite();
        
        int choix;
        do {
            System.out.println("Menu");
            System.out.println("1. Afficher details produit");
            System.out.println("2. Ajouter produit");
            System.out.println("3. Modifier produit");
            System.out.println("4. Calculer valeur du stock");
            System.out.println("5. Appliquer Remise");
            System.out.println("6. Quitter");
            System.out.print("Votre choix : ");
            
            choix = scanner.nextInt();  
            scanner.nextLine();  

            switch (choix) {
                case 1:
                    System.out.println(" Details des produits ");
                    p.afficher();
                    p1.afficher();
                    break;
                    
                case 2:
                    System.out.println(" Ajouter un nouveau produit ");
                    System.out.print("Reference : ");
                    String reference = scanner.nextLine();  
                    System.out.print("Designation : ");
                    String designation = scanner.nextLine();
                    System.out.print("PrixHT : ");
                    double prixHT = scanner.nextDouble();
                    System.out.print("Quantite : ");
                    int quantite = scanner.nextInt();
                    scanner.nextLine();  
                    
                    produit p2 = new produit(reference, designation, prixHT, quantite);
                    System.out.println("Nouveau produit cree :");
                    p2.afficher();
                    break;
                    
                case 3:
                    System.out.println(" Modification du produit ");
                    System.out.println("Avant modification :");
                    p.afficher();
                    p.setdesignation(" souris");
                    System.out.println("Apres modification :");
                    p.afficher();
                    break;
                case 4:
                    System.out.println("Valeur du stock : " + p1.calculerValeurStock());
                    break;
                case 5:
                    p1.appliquerRemise(20); 
                    System.out.println("Remise de 20% appliquée. Nouveau prix : " + p1.getprixHT());
                    break;                    
                case 6:
                    System.out.println("Vous avez quitte le programme. Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide. Veuillez recommencer.");
            }
        } while (choix != 6);
        
        scanner.close();
    }
}