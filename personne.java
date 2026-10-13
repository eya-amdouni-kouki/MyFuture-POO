import java.util.Scanner;

public class personne {
    private String cin;
    private String nom;
    private String prenom;
    private String ville;

    public void saisir() {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Saisir le CIN :");
        this.cin = s.nextLine();
        
        System.out.println("Saisir le nom :");
        this.nom = s.nextLine();
        
        System.out.println("Saisir le prénom :");
        this.prenom = s.nextLine();
        
        System.out.println("Saisir la ville :");
        this.ville = s.nextLine();
        
        System.out.println(">> Personne enregistrée !\n");
    }
    public void afficher() {
        System.out.println("\n=== DÉTAILS DE LA PERSONNE ===");
        System.out.println("CIN : " + this.cin);
        System.out.println("Nom : " + this.nom);
        System.out.println("Prénom : " + this.prenom);
        System.out.println("Ville : " + this.ville);
        System.out.println("==============================\n");
    }
     public static void main(String[] args) {
        personne p = new personne();
        p.saisir();
        p.afficher();
    }
}