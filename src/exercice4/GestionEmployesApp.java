package exercice4;

public class GestionEmployesApp {
    public static void main(String[] args) {
        Ingenieur ingenieur = new Ingenieur(
                "El Amrani", "Sara", "sara@example.com", "0622222222", 12000, "Big Data"
        );

        Manager manager = new Manager(
                "Benali", "Youssef", "youssef@example.com", "0633333333", 15000, "Developpement"
        );

        System.out.println("=== Ingenieur ===");
        System.out.println(ingenieur);
        System.out.println();
        System.out.println("=== Manager ===");
        System.out.println(manager);
    }
}
