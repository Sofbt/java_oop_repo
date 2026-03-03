package exercice6;

public class DVD implements Empruntable {
    private String titre;
    private String realisateur;
    private boolean emprunte;

    public DVD(String titre, String realisateur) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.emprunte = false;
    }

    @Override
    public void emprunter() {
        if (!emprunte) {
            emprunte = true;
            System.out.println("Le DVD '" + titre + "' realise par " + realisateur + " a ete emprunte.");
        } else {
            System.out.println("Le DVD '" + titre + "' est deja emprunte.");
        }
    }

    @Override
    public void retourner() {
        if (emprunte) {
            emprunte = false;
            System.out.println("Le DVD '" + titre + "' a ete retourne.");
        } else {
            System.out.println("Le DVD '" + titre + "' n'est pas emprunte.");
        }
    }
}
