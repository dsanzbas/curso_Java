package Capitulo_5.Ex5_9;

import java.sql.Timestamp;
import java.util.*;

import static java.lang.System.*;

public class Array_Creciente {
    Scanner scanner = new Scanner(in);
    int contador = 0;
    int input = 0;
    boolean input_ok = false;
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(10);
        int i, h, aux, mayor;
        boolean encontrado = false;
        String respuesta;

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

    public boolean getInput () {
        boolean input_ok = false;
        do {
            out.println("Introduzca nuevo valor: ");
            try {
                //input = scanner.nextInt();
                rango(98);
                input_ok = true;
            } catch (InputMismatchException e) {
                out.println("Formato numérico incorrecto");
                scanner.next();
                contador++;
            } catch (ExcepcionIntervalo x) {
                respuesta = x.getMessage();
                scanner.nextLine();
                contador++;
            }
        } while ((input_ok == false) || (contador < 3));
    }
}

