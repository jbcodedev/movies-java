public class decisions {
    public static void main(String[] args) {
        int launchDate = 1999;
        boolean includedInThePlan = true;
        double movieRating = 8.2;
        String planType = "plus";

        // Probando operadores relacionales
        if (launchDate >= 2022) {
            System.out.println("Peliculas mas populares");
        } else {
            System.out.println("Peliculas Retro que aun vale la pena ver");
        }

        if (includedInThePlan && planType.equals("plus")) {
            System.out.println("Disfrute de su pelicula");
        } else {
            System.out.println("Pelicula no disponible para su plan actual");
        }
    }
}