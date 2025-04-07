import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double rating = 0;
        double averageRating = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe la nota que le darias a la pelicula Matrix");
            rating = keyboard.nextDouble();
            averageRating = averageRating + rating;
        }
        System.out.println("La media de evaluaciones para la pelicula es: " + averageRating / 3);
    }
}
