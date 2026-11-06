public class produit{
    String reference;
    String designation;
    double prixHT;
    int quantite;
    public produit(String reference,String designation,double prixHT,int quantite){
        this.reference=reference;
        this.designation=designation;
        this.prixHT=prixHT;
        this.quantite=quantite;
    }
    public String getreference(){
        return reference;
    }
    public void setreference(String reference){
        this.reference=reference;
    }
    public String getdesignation(){
        return designation;
    }
    public void setdesignation(String designation){
        this.designation=designation;
    }
    public double getprixHT(){
        return prixHT;
    }
    public void setprixHT(double prixHT){
        this.prixHT=prixHT;
    }
    public int getquantite(){
        return quantite;
    }
    public void setquantite(int quantite){
        this.quantite=quantite;
    }
    public void afficher(){
        System.out.println("reference" + reference);
        System.out.println("designation" + designation);
        System.out.println("prixHT" + prixHT);
        System.out.println("quantite" + quantite);
        System.out.println("quantite en stock:"+quantite);
        System.out.println("valeur du stock"+calculerValeurStock());
    }
    public double calculerValeurStock(){
        return prixHT * quantite;
    }
    public void appliquerRemise(double pourcentage){
        prixHT = prixHT - (prixHT * pourcentage /100);
    }
    
}