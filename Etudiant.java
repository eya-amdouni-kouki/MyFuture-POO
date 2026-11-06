public class Etudiant {
    private String nomE;
    private String codeE;
    private String classe;

    public Etudiant(String nomE, String codeE, String classe) {
        this.nomE = nomE;
        this.codeE = codeE;
        this.classe = classe;
    }

    public String getNomE() {
        return nomE;
    }

    public String getCodeE() {
        return codeE;
    }

    public String getClasse() {
        return classe;
    }

    public void setNomE(String nomE) {
        this.nomE = nomE;
    }

    public void setCodeE(String codeE) {
        this.codeE = codeE;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void afficherInfo() {
        System.out.println("Nom: " + nomE);
        System.out.println("Code: " + codeE);
        System.out.println("Classe: " + classe);
    
    }

}