package Capitulo_5.Ex_3;
import java.util.*;
public class Loteria {

    private static int TAM = 6;
    public static void main(String[] args) {
        int[] loteria = new int[6];
        int i, h;
        boolean encontrado = false;

        for (i = 0; i <= 5; i++) loteria[i] = 0;

        for (i = 0; i <= 5; i++) {

            int j = (int) (Math.random() * 49) + 1;

            if (j != 0) {
                for (h = 0; h < 5; h++) {
                    if (loteria[h] == j) {
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    loteria[i] = j;
                }
              else {encontrado = false; i--;}
            }
        }
        System.out.println("Número de Loteria: " + Arrays.toString(loteria));
    }
}
