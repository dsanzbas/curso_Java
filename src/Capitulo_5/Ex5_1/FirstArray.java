package Capitulo_5.Ex5_1;

public class FirstArray {
    static int[] x;
    public static void main(String[] args) {
        int[] array = new int[100];
        int i = 0;
        x = new int[50];
        for(i = 0; i <= 99; i++) {

            array[i] = -1;
        }

        for(i=0; i <= 99; i++) {
            System.out.println("Array - pos " + (i + 1) + ": " + array[i]);
        }
    }
}
