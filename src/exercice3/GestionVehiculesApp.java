package exercice3;

public class GestionVehiculesApp {
    public static void main(String[] args) {
        Vehicule[] vehicules = new Vehicule[] {
                new Voiture("Voiture sportive", 320000, "BMW M3", 2024),
                new Moto("Moto roadster", 145000, "Yamaha", 900),
                new Avion("Avion commercial", 120000000, "RAM", 870)
        };

        for (Vehicule vehicule : vehicules) {
            System.out.println("====================");
            vehicule.emettreSon();
            vehicule.afficherInformations();
        }
    }
}
