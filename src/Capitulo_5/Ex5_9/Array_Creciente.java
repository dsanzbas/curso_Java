package Capitulo_5.Ex5_9;

import java.sql.Timestamp;
import java.util.*;

import static java.lang.System.*;

public class Array_Creciente {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>(10);

        int i, h, aux, mayor;
        boolean encontrado, output_ok = true;
        String respuesta = "";
        int input = 0;
        ArrayList input_ok = new ArrayList<>(2);
        Scanner scanner = new Scanner(in);
        int contador = 0;

        //Rellenar ArrayList
        for (i = 0; i < 9; i++) {

            arrayList.add(i, ((int) (Math.random() * 100) + 1));
        }
        //Mostrar contenido arrayList sin ordernar
        out.println("Contenido ArrayList: " + arrayList.toString());

        Collections.sort(arrayList);

        out.println("Contenido ArrayList Ordenado: " + arrayList.toString());

        do {
            out.println("Introduzca nuevo valor: ");

            try {
                input = scanner.nextInt();
                //input = 120;
                input_ok = GetInput.validateInput(input);
                output_ok = (boolean) input_ok.get(0);
                respuesta = (String) input_ok.get(1);

                if (!output_ok) {
                    contador++;
                    out.println(respuesta);
                }
            } catch (InputMismatchException e) {
                out.println("Formato numérico incorrecto");
                scanner.next();
            }
        } while ((!output_ok) && (contador < 3));

        if (contador == 3) {
            out.println("Fin del programa " + respuesta);
            System.exit(1);
        }

        //Búsqueda arrayList

        encontrado = false;
        aux = arrayList.indexOf(input);

        if (aux != -1) {
            encontrado = true;
        }

        if (encontrado) {
            out.println("ArrayList - Valor encontrado en la posición " + aux);
        } else {
            out.println("Valor no encontrado");
            ArrayList<Integer> arrayAux  = new ArrayList<Integer>(arrayList);
            for(i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) > input) {
                    arrayList.add(i,input);
                    for(h=i; h < arrayList.size(); h++){
                        arrayList.add(h,arrayAux.get(h));
                    }
                    break;
                }
            }
            out.printf("Contenido ArrayList Final: " + arrayList.toString());
        }
    }
}

