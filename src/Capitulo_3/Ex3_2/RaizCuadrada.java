package Capitulo_3.Ex3_2;

import java.util.Scanner;

public class RaizCuadrada {

    public int Square ()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca valor:");
        int num = Integer.parseInt(scanner.next());

        if (num  >= 0)
        {
            double sqr = Math.sqrt(num);
            System.out.println("la raiz cuadrada de " + num + " es " + sqr);
        }
        else
        {
            System.out.println("El número introducido debe ser mayor o igual a 0");
        }
        return num;
    }
}