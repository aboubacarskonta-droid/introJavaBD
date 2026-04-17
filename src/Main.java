public class Main {
    public static void main(String[] args) {
        // Création d'un module avec le constructeur complet
        Module m1 = new Module(1, "Programmation Java", 30, "Hebdomadaire");

        // Affichage des infos du module
        System.out.println("ID : " + m1.getId());
        System.out.println("Libellé : " + m1.getLibele());
        System.out.println("Volume horaire : " + m1.getVH());
        System.out.println("Fréquence : " + m1.getFrequense());

        // Exemple de modification avec un setter
        m1.setLibele("Programmation avancée en Java");
        System.out.println("Nouveau libellé : " + m1.getLibele());
    }
}
