package Capitulo_5.Ex5_9;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.out;

public class GetInput {
    static int count = 0;

    public GetInput() {
        count++;
    }
    public boolean validateInput (int input) {
        boolean input_ok = false;
        int contador = 0;
        String respuesta;
        Scanner scanner = new Scanner(System.in);

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
        } while ((!input_ok) || (contador < 3));

        if ((contador == 3) || (!input_ok)) {
            return input_ok;
        }
    }
    public static void rango(int num) throws ExcepcionIntervalo {
        if ((num > 100) || (num < 0)) {
           throw new ExcepcionIntervalo("Número fuera del intervalo");
        }
    }
}
