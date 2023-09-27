import java.io.*;
public class Temperatura_main {
    public static void main (String[] args) {
        Temperatura temp = new Temperatura();

        System.out.println("¿Celsius o Farenheit?");
        String  tipo_temp = System.console().readLine();
        System.out.println("Temperatura de entrada en " + tipo_temp);
        System.out.println("Introduzca la temperatura: ");
        double grados = Double.parseDouble(System.console().readLine());

        if (tipo_temp == "Celsius")
            temp.celsiusToFarenheit(grados);
            System.out.println("Temperatura en grados Farenheit: " + temp.celsiusToFarenheit());
        if (tipo_temp == "Farenheit")
            temp.farenheitToCelsius(grados);
            System.out.println("Temperatura en grados Celsius:  " + temp.farenheitToCelsius());
    }
}
