import java.io.*;
public class Temperatura_main {
    public static void main (String[] args) {
        Temperatura temp = new Temperatura();
        String tipo_temp;

        System.out.println("¿Celsius o Farenheit?");
        tipo_temp = System.console().readLine();
        System.out.println("Temperatura de entrada en " + tipo_temp);
        System.out.println("Introduzca la temperatura: ");
        double grados = Double.parseDouble(System.console().readLine());
        System.out.println("Temperatura en grados Farenheit: " + temp.celsiusToFarenheit(grados));
        System.out.println("Temperatura en grados Celsius:   " + temp.farenheitToCelsius(grados));
    }
}
