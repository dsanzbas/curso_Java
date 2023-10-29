package Capitulo_5.Ex5_4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Estadística {
    public static void main(String[] args) {
        int x = 0;
        Scanner n = new Scanner(System.in);

        System.out.printf("¿Cuántos números va a introducir? ");
        try {
        x = n.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Introduzca SOLO números enteros");
            n.next();
        }
        //ArrayList<Integer> array = new ArrayList<Integer>();
        int[] array = new int[x];
        int suma = 0;
        double  media = 0.00;

        for (int i = 0; i < x; i++) {
            System.out.println("Introduzca el valor " + (i + 1) + " del array");
            array[i] = n.nextInt();
        }

        for (int i = 0; i < x; i++) {
            suma = suma + array[i];
        }

        media = suma / x;

        System.out.println("La suma de los valores introducidos es " + suma + " y su media es " + media);
    }
}
