package Capitulo_5.Ex5_9;

import java.sql.Timestamp;
import java.util.*;

import static java.lang.System.*;

public class Array_Creciente {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(10);
        int i, h, aux, mayor;
        boolean encontrado = false;
        String respuesta;
        int input = 0;
        boolean input_ok = false;
        Scanner scanner = new Scanner(in);
        int contador = 0;

        //Rellenar ArrayList
        for (i = 0; i < 9; i++) {

            arrayList.add(i, ((int) (Math.random() * 100) + 1));
        }
        //Mostrar contenido arrayList sin ordernar
        for (i = 0; i < arrayList.size(); i++) {

            out.println("Contenido ArrayList: " + arrayList.get(i));
        }

        Collections.sort(arrayList);

        for (i = 0; i < arrayList.size(); i++) {

            out.println("Contenido ArrayList Ordenado: " + arrayList.get(i));
        }
        do {
            out.println("Introduzca nuevo valor: ");
            input = scanner.nextInt();

            try {
                input = scanner.nextInt();
                input_ok = GetInput.validateInput(input);
            } catch (InputMismatchException e) {
                out.println("Formato numérico incorrecto");
                scanner.next();
            }
        } while ((!input_ok) || (contador < 3));

        if (contador == 3) {
            out.println("Fin del programa");
            System.exit(1);
        }

        //Búsqueda arrayList

        encontrado = false;
        aux = arrayList.indexOf(input);

        if (aux != -1) {
            encontrado = true;
        }

        if (encontrado) {
            out.println("Array secuencial - Valor encontrado en la posición " + i);
            out.println("ArrayList        - Valor encontrado en la posición " + aux);
        } else {
            out.println("Valor no encontrado");
        }
    }
}

