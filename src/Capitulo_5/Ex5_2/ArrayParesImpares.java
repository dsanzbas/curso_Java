package Capitulo_5.Ex5_2;

public class ArrayParesImpares {
    static int[] x;
    public static void main(String[] args) {
        int[] pares = new int[101];
        int[] impares = new int[101];
        int i,j = 0;
        x = new int[50];
        for(i = 0, j = 1; j <= 100; i++ ) {

            if (i % 2 == 0)
            {
                pares[j-1] = i;
                j++;
            }
        }
        for(i = 0, j = 1; j <= 100; i++ ) {

            if (i % 2 != 0)
            {
               impares[(j-1)] = i;
               j++;
            }
        }

        for(i=0, j = 0; i <= 99; i++, j++) {
            System.out.println("Array Pares   - pos " + (i + 1) + ": " + pares[i]);
            System.out.println("Array Impares - pos " + (j + 1) + ": " + impares[j]);
        }
    }
}
