public class Etudiant {
    private String nom;
    public Etudiant(String nom){
        this.nom = nom;
    }
    public void afficherNom() {
        System.out.println("Nom de l'étudiant : " + nom);
    }
}
