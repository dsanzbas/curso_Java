package Capitulo_5.Ex5_10;

import java.util.*;
import static java.lang.System.in;
import static java.lang.System.out;

public class Array_Suma_Gigante {

    public static void main(String[] args) {

        int[] a1 = new int[10];
        int[] a2 = new int[10];
        int[] resultado = new int[10];
        int i, h, aux, mayor;
        int contador = 0;

        //Rellenar Arrays con números entre 0 y 10 aleatoriamente

        for (i = 0; i < 9; i++) {
            a1[i] = (int) (Math.random() * 10) + 1;
        }

        for (i = 0; i < 9; i++) {
            a2[i] = (int) (Math.random() * 10) + 1;
        }

        // Imprimir contenido original de los arrays

        out.println("Array 1: " + Arrays.toString(a1));
        out.println("Array 2: " + Arrays.toString(a2));

        // Inizializar objeto
        Sumar_Arrays suma = new Sumar_Arrays(a1,a2);

        // Sumar los arrays
        suma.sumar_arrays();
        resultado = suma.getSuma();

        // Imprimir array resultante
        out.println("Array 3: " + Arrays.toString(resultado));
    }
}

