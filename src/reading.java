import java.util.Scanner;

public class reading {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu pelicula favorita");
        String movie = keyboard.nextLine();
        System.out.println("Escribe el nombre de la fecha de lanzamiento");
        int launchDate = keyboard.nextInt();
        System.out.println("Por ultimo dinos que nota le das a esta pelicula del 1 al 10");
        double rating = keyboard.nextDouble();

        System.out.println("**Estos son los datos de la pelicula:**");
        System.out.println(movie);
        System.out.println(launchDate);
        System.out.println(rating);
    }
}