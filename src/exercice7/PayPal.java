package exercice7;

public class PayPal extends Paiement {
    private String email;

    public PayPal(String numeroTransaction, String email) {
        super(numeroTransaction);
        this.email = email;
    }

    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Paiement PayPal de " + montant + " MAD effectue. " +
                "Transaction : " + numeroTransaction + ", compte : " + email + ".");
    }
}
