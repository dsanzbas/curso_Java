package Capitulo_3.Ex3_2;

import java.util.Scanner;

class RaizCuadrada_main
{
    public static void main(String[] args) {
        RaizCuadrada sqr = new RaizCuadrada();
        double num = 0.00;
        int valor;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca valor:");
        valor = Integer.parseInt(scanner.next());

        num = sqr.Square(valor);

        if (num > 0.00)
        {
            System.out.println("la raiz cuadrada de " + valor + " es " + num);
        } else
        {
            System.out.println("Error - El valor introducido es negativo o cero");
        }
    }
}