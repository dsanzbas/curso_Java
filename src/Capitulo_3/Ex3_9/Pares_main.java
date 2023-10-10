package Capitulo_3.Ex3_9;

import java.util.Scanner;

class Pares_main
{
    public static void main(String[] args) {

        int a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el primer número:");
        a = Integer.parseInt(scanner.next());

        System.out.println("Introduzca el segundo número:");
        b = Integer.parseInt(scanner.next());

        if (a > b) {
            System.out.println("El primer número introducido es mayor que el segundo");
        }
        else {
            Pares pares = new Pares(a,b);
            pares.getPares();
        }
    }
}