import java.util.Scanner;

public class Evaluations {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double rating = 0;
        double averageRating = 0;
        double totalRating = 0;

        while (rating != -1) {
            System.out.println("Escribe la nota que le darias a la pelicula Matrix");
            rating = keyboard.nextDouble();

            if (rating != -1) {
                averageRating += rating;
                totalRating++;
            }
        }
        System.out.println("La media de evaluaciones para la pelicula es: " + averageRating / totalRating);
    }
}