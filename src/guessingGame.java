import java.util.Random;
import java.util.Scanner;

public class guessingGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numberGenerated = new Random().nextInt(100);
        int attempts = 0;

        while (attempts < 5) {
            System.out.println("Ingrese un numero entero entre 0 y 100: ");
            int numberUser = keyboard.nextInt();
            attempts++;

            if (numberUser == numberGenerated) {
                System.out.println("Felicidades, adivinaste el numero");
                break;
            } else if (numberUser < numberGenerated) {
                System.out.println("El numero escrito es menor");
            } else {
                System.out.println("El numero escrito es mayor");
            }
        }
        if (attempts == 5) {
            System.out.println("Lo siento, no conseguiste adivinar el numero");
        }
    }
}
