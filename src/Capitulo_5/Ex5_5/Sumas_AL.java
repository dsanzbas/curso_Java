package Capitulo_5.Ex5_5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Sumas_AL {
    public static void main(String[] args) {
        int x = 0;
        Scanner n = new Scanner(System.in);
        n.useLocale(Locale.US);

        ArrayList<Double> array = new ArrayList<Double>();
        //int[] array = new int[x];
        double suma = 0;
        double media = 0.00;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzca el valor " + (i + 1) + " del array  ");
            try {
                array.add(i,n.nextDouble());
            }
            catch (InputMismatchException e) {
                System.out.println("Introduzca SOLO números reales positivos o negativos");
                n.next();
            }
            catch (IndexOutOfBoundsException j) {
                System.out.println("Rango de array sobrepasado: " + i);
            }
        }

        for (int i = 0; i < 10; i++) {
            suma = suma + array.get(i);
        }

        media = suma / 10;

        System.out.println("La suma de los valores introducidos es " + suma + " y su media es " + media);
    }
}
