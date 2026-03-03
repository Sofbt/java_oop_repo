package exercice5;

public class GestionFiguresApp {
    public static void main(String[] args) {
        Figure[] figures = new Figure[] {
                new Cercle("Cercle principal", 5),
                new Rectangle("Rectangle principal", 8, 4),
                new Triangle("Triangle principal", 3, 4, 5)
        };

        for (Figure figure : figures) {
            System.out.println("====================");
            figure.afficherDetails();
        }
    }
}
