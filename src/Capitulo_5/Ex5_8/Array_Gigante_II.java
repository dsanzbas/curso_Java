package Capitulo_5.Ex5_8;

import java.sql.Timestamp;
import java.util.*;

public class Array_Gigante_II {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[2000000];
        ArrayList<Integer> arrayList = new ArrayList<>(2000000);
        int i, h, aux, minimo, posicion_minimo;
        int input = 0;
        boolean encontrado = false;
        Date date = new Date();
        Date date1 = new Date();
        Date date2 = new Date();
        Date date3 = new Date();
        Date date4 = new Date();
        Date date5 = new Date();
        Date date6 = new Date();
        Date date7 = new Date();
        Date date8 = new Date();
        Date date9 = new Date();

        System.out.println("Introduzca valor a buscar: ");
        try {
            input = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Formato numérico incorrecto");
            scanner.next();
        }

        for (i = 0; i <= 1999999; i++) { array[i] = 0;}

        // Rellenar array secuencial
        for (i = 0; i <= 1999999; i++) {

            array[i] = (int) (Math.random() * 2000000) + 1;
        }

        //Rellenar ArrayList
        for (i = 0; i < arrayList.size(); i++) {

            arrayList.add(i,((int) (Math.random() * 2000000) + 1));
        }

        // Ordenar array secuencial

        System.out.println("Ordenar Array secuencial Método Burbuja - Hora inicio : " + new Timestamp(date.getTime()));
        for (i = 0; i < (array.length - 1); i++){
            for(h = 0; h < array.length - i - 1; h++) {
                if (array[h] > array[h + 1]) {
                    aux = array[h];
                    array[h] = array[h + 1];
                    array[h + 1] = aux;
                }
            }
        }

        System.out.println("Ordenar Array secuencial Método Burbuja - Hora fin    : " + new Timestamp(date1.getTime()));

        System.out.println("Ordenar Array secuencial Método Directo - Hora inicio : " + new Timestamp(date2.getTime()));

        for (i = 0; i < (array.length - 1); i++){
            minimo = array[i];
            posicion_minimo = i;

            for(h = i; h < array.length - 1; h++) {
                if (array[h] < minimo) {
                    minimo = array[h];
                    posicion_minimo = h;
                }
                array[posicion_minimo] = array[i];
                array[i] = minimo;
            }
        }

        System.out.println("Ordenar Array secuencial Método Directo - Hora fin    : " + new Timestamp(date3.getTime()));

        //Ordenar ArrayList
        System.out.println("Ordenar ArrayList        - Hora inicio : " + new Timestamp(date4.getTime()));

        Collections.sort(arrayList);

        System.out.println("Ordenar ArrayList        - Hora fin : " + new Timestamp(date5.getTime()));

        // Busqueda array secuencial

        System.out.println("Búsqueda array secuencial - Hora inicio : " + new Timestamp(date6.getTime()));
        for (i=0; i < array.length - 1; i++) {
            if (array[i] == input) {
                encontrado = true;
                break;
            }
        }

        System.out.println("Búsqueda array secuencial - Hora fin : " + new Timestamp(date7.getTime()));

        //Búsqueda arrayList

        System.out.println("Búsqueda arrayList        - Hora inicio : " + new Timestamp(date8.getTime()));

        encontrado = false;
        aux = arrayList.indexOf(input);

        if (aux != -1) {encontrado = true;}

        System.out.println("Búsqueda arrayList        - Hora fin    : " + new Timestamp(date9.getTime()));

        if (encontrado) {
            System.out.println("Array secuencial - Valor encontrado en la posición " + i);
            System.out.println("ArrayList        - Valor encontrado en la posición " + aux);
        }
        else {
            System.out.println("Valor no encontrado");
        }
    }
}
