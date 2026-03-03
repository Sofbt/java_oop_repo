package exercice1;

public class GestionBibliothequeEx1 {
    public static void main(String[] args) {
        Adherent adherent = new Adherent("Boutkhil", "Soufiane", "soufiane@example.com", "0600000000", 21, 1001);
        Auteur auteur = new Auteur("Hugo", "Victor", "victor.hugo@example.com", "0611111111", 46, 501);
        Livre livre = new Livre(123456789, "Les Miserables", auteur);

        System.out.println("=== Informations de l'adherent ===");
        System.out.println(adherent);
        System.out.println();
        System.out.println("=== Informations du livre ===");
        System.out.println(livre);
    }
}
