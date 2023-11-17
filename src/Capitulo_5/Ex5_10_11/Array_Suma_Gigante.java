package Capitulo_5.Ex5_10_11;

import java.util.*;

import static java.lang.System.out;

public class Array_Suma_Gigante {

    public static void main(String[] args) {

        int[] a1 = new int[10];
        int[] a2 = new int[10];
        int[] resultado = new int[10];
        int[] resul_multi = new int[a1.length * 2];
        int i, h, aux, mayor;
        int contador = 0;

        //Rellenar Arrays con números entre 0 y 10 aleatoriamente

        for (i = 0; i <= 9; i++) {
            a1[i] = (int) (Math.random() * 10);
        }

        for (i = 0; i <= 9; i++) {
            a2[i] = (int) (Math.random() * 10);
        }

        // Imprimir contenido original de los arrays

        // Inizializar objetos
        Sumar_Arrays  suma  = new Sumar_Arrays(a1,a2);
        Restar_Arrays resta = new Restar_Arrays(a1, a2);
        Multiplicar_Arrays multiplicar = new Multiplicar_Arrays(a1, a2);

        // Sumar los arrays
        suma.sumar_arrays();
        resultado = suma.getSuma();

        // Imprimir arrays
        out.println("Array 1    : " + Arrays.toString(a1));
        out.println("Array 2    : " + Arrays.toString(a2));
        out.println("Array Suma : " + Arrays.toString(resultado));

        for(i=0; i < (resultado.length - 1); i++) {resultado[i] = 0;}

        resta.restar_arrays();
        resultado = resta.getResta();
        out.println("Array Resta: " + Arrays.toString(resultado));

        for(i=0; i < (resul_multi.length - 1); i++) {resul_multi[i] = 0;}

        multiplicar.multiplicar_arrays();
        resul_multi = multiplicar.getMulti();
        out.println("Array Multiplicar: " + Arrays.toString(resul_multi));
    }
}

