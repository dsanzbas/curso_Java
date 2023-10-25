package Capitulo_4.Ex_11;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el 1er número:");
        a = Integer.parseInt(scanner.next());

        System.out.println("Introduzca el 2ndo número:");
        b = Integer.parseInt(scanner.next());

        try {
            System.out.println("Suma            : " + (a + b));
            System.out.println("Resta           : " + (a - b));
            System.out.println("Multiplicación  : " + (a * b));
            System.out.println("Division        : " + (a / b));
        }
        catch (ArithmeticException e) {
            System.out.println("Imposible división por 0");
        }
    }
}
