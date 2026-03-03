package exercice6;

public class GestionBibliotheque {
    public static void main(String[] args) {
        Livre livre1 = new Livre("L'Alchimiste", "Paulo Coelho");
        Livre livre2 = new Livre("1984", "George Orwell");
        DVD dvd1 = new DVD("Inception", "Christopher Nolan");

        Utilisateur utilisateur = new Utilisateur("Soufiane");

        utilisateur.emprunterObjet(livre1);
        utilisateur.emprunterObjet(dvd1);
        utilisateur.emprunterObjet(livre1);

        livre1.retourner();
        dvd1.retourner();
        livre2.retourner();
    }
}
