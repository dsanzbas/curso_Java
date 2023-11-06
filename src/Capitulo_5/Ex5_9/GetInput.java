package Capitulo_5.Ex5_9;

import java.util.ArrayList;

public class GetInput {
    public static ArrayList validateInput(int input) {
        ArrayList<Object> output = new ArrayList<Object>(2);
        boolean input_ok = false;
        String respuesta;
        respuesta = "";

        try {
             GetInput.rango(input);
             input_ok = true;
             output.add(0,input_ok);
             output.add(1,respuesta);
        } catch (ExcepcionIntervalo x) {
            respuesta = x.getMessage();
            output.add(0,input_ok);
            output.add(1,respuesta);
        }
        return output;
    }
    public static void rango(int num) throws ExcepcionIntervalo {
        if ((num > 100) || (num < 0)) {
           throw new ExcepcionIntervalo("Número fuera del intervalo");
        }
    }
}