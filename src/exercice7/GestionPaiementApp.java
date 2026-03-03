package exercice7;

public class GestionPaiementApp {
    public static void main(String[] args) {
        Commande commande1 = new Commande(499.99, new CarteCredit("TXN-001", "1234567812345678"));
        Commande commande2 = new Commande(299.50, new PayPal("TXN-002", "client@example.com"));

        commande1.processPayment();
        System.out.println();
        commande2.processPayment();
    }
}
