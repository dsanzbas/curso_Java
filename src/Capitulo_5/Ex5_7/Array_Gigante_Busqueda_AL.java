package Capitulo_5.Ex5_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Array_Gigante_Busqueda_AL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<Integer>(2000000);
        int i, h, aux;
        int input = 0;
        int encontrado = -1;

        System.out.println("Introduzca valor a buscar: ");
        try {
            input = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Formato numérico incorrecto");
            scanner.next();
        }

        for (i = 0; i <= 1999999; i++) { array.add(i,0);}

        for (i = 0; i <= 1999999; i++) {

            array.add(i,(int) (Math.random() * 2000000) + 1);
        }

        //System.out.println(Arrays.toString(array));
        //System.out.println(array.length);
        // Ordenar array
        Collections.sort(array);
        /*System.out.println(Arrays.toString(array));*/
        //System.out.println("Input: " + input);
        // Busqueda
        encontrado = array.indexOf(input);

        if (encontrado != -1) {
            System.out.println("Valor encontrado en la posición " + encontrado);
        }
        else {
            System.out.println("Valor no encontrado");
        }
        //System.out.println(Arrays.toString(array));
    }
}
