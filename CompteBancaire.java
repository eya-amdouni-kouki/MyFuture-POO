public class CompteBancaire{
    private String numeroCompte;
    private double solde;
    private Client titulaire;
    private static int nombreCompte = 0;
    public CompteBancaire(String numeroCompte, double solde , Client titulaire){
        this.numeroCompte=numeroCompte;
        this.solde=solde;
        this.titulaire=titulaire;
        nombreCompte++;
    }
    public String getNumeroCompte() {
        return numeroCompte;
    }
    public double getSolde() {
        return solde;
    }
    public Client getTitulaire() {
        return titulaire;
    }
    public void setTitulaire(Client titulaire) {
        this.titulaire = titulaire;
    }
    public static int getNombreComptes() {
        return nombreCompte;
    }
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Dépôt de " + montant + "effectué avec succès.");
        } else {
            System.out.println("Erreur: Le montant du dépôt doit être supérieur à 0.");
        }
    }
    public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
            System.out.println("Retrait de " + montant + "effectué avec succès.");
        } else {
            System.out.println("Solde insuffisant !");
        }
    }
    public void virement(CompteBancaire destination, double montant) {
        if (montant > 0 && montant <= this.solde) {
            this.retirer(montant);
            destination.deposer(montant);
            System.out.println("Virement de " + montant + " vers le compte " + 
                             destination.getNumeroCompte() + " effectué.");
        } else {
            System.out.println("Virement impossible: montant invalide ou solde insuffisant.");
        }
    }
    public void afficherDetails() {
        System.out.println("=== Détails du Compte ===");
        System.out.println("Numéro de compte: " + numeroCompte);
        if (titulaire != null) {
            System.out.println("Titulaire: " + titulaire.getnom() + " " + titulaire.getprenom());
        } else {
            System.out.println("Titulaire: Non défini");
        }
        System.out.println("Solde: " + solde );
       
    }
}