public class temperatureConversion {
    public static void main(String[] args) {
        System.out.println("Conversion de Temperatura");
        double temperaturaCelcius = 20.1;
        double conversionFarenheit = (temperaturaCelcius * 1.8) + 32;
        System.out.println("La conversion a Farenheit es: "+ conversionFarenheit);
        int temperaturaFarenheitEntero = (int) conversionFarenheit;
        System.out.println("La temperatura en Fahrenheit entero es: "+ temperaturaFarenheitEntero);
    }
}