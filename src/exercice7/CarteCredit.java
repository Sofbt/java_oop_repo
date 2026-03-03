package exercice7;

public class CarteCredit extends Paiement {
    private String numeroCarte;

    public CarteCredit(String numeroTransaction, String numeroCarte) {
        super(numeroTransaction);
        this.numeroCarte = numeroCarte;
    }

    @Override
    public void effectuerPaiement(double montant) {
        String finCarte = numeroCarte.length() >= 4 ? numeroCarte.substring(numeroCarte.length() - 4) : numeroCarte;
        System.out.println("Paiement par carte de credit de " + montant + " MAD effectue. " +
                "Transaction : " + numeroTransaction + ", carte se terminant par " + finCarte + ".");
    }
}
