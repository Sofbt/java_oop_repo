package exercice7;

public class Commande {
    private double montant;
    private Paiement moyenPaiement;

    public Commande(double montant, Paiement moyenPaiement) {
        this.montant = montant;
        this.moyenPaiement = moyenPaiement;
    }

    public void processPayment() {
        System.out.println("Traitement d'une commande de " + montant + " MAD...");
        moyenPaiement.effectuerPaiement(montant);
    }
}
