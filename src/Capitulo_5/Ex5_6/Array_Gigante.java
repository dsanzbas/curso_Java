package Capitulo_5.Ex5_6;

import java.util.Arrays;

public class Array_Gigante {
    public static void main(String[] args) {
        int[] array = new int[1000000];
        int i, h, aux, aux1;

        for (i = 0; i <= 999999; i++) { array[i] = 0;}

        for (i = 0; i <= 999999; i++) {

            array[i] = (int) (Math.random() * 1000000) + 1;
        }

        System.out.println(Arrays.toString(array));
        System.out.println(array.length);

        for (i = 0; i < (array.length - 1); i++){
            for(h = 0; h < array.length - i - 1; h++) {
                if (array[h] > array[h + 1]) {
                    aux = array[h];
                    array[h] = array[h + 1];
                    array[h + 1] = aux;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
