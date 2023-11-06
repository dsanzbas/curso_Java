package Capitulo_5.Ex5_9;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.out;

public class GetInput {
    int input;
    public static boolean validateInput(int input) {
        boolean input_ok = false;
        String respuesta;

        try {
             GetInput.rango(input);
             input_ok = true;
        } catch (ExcepcionIntervalo x) {
            respuesta = x.getMessage();
            input_ok = false;
        }

        return input_ok;
    }
    public static void rango(int num) throws ExcepcionIntervalo {
        if ((num > 100) || (num < 0)) {
           throw new ExcepcionIntervalo("Número fuera del intervalo");
        }
    }
}
