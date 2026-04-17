public class Module {
    private int id;          // Identifiant unique du module
    private String libele;   // Libellé (nom du module)
    private int VH;          // Volume horaire (nombre d’heures)
    private String frequense;// Fréquence (ex: hebdomadaire, mensuelle)

    // Constructeur vide (utile si tu veux créer un objet sans initialiser tout de suite)
    public Module() {
    }

    // Constructeur avec paramètres (permet de créer un module directement avec ses infos)
    public Module(int id, String libele, int VH, String frequense) {
        this.id = id;
        this.libele = libele;
        this.VH = VH;
        this.frequense = frequense;
    }

    // Getters et Setters : permettent d'accéder et de modifier les attributs
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getLibele() { return libele; }
    public void setLibele(String libele) { this.libele = libele; }

    public int getVH() { return VH; }
    public void setVH(int VH) { this.VH = VH; }

    public String getFrequense() { return frequense; }
    public void setFrequense(String frequense) { this.frequense = frequense; }
}
