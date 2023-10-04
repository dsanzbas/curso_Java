package Capitulo_3.Ex3_3;

import java.util.Scanner;

class Resta_main
{
    public static void main(String[] args) {
        Resta resta = new Resta();
        int num;
        int valor1, valor2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el 1er número:");
        valor1 = Integer.parseInt(scanner.next());
        System.out.println("Introduzca el 2ndo número:");
        valor2 = Integer.parseInt(scanner.next());

        num = resta.Resta_Int(valor1,valor2);

        System.out.println("El resultado de la resta es " +  num);
    }
}