package Capitulo_2.Ex2_2;
import java.io.Console;
import java.util.Scanner;

class ConversorDivisas_Main
{
    public static void main(String[] args)
    {
        double inp_libras;
        double inp_euros;
        double out_Euros;
        double tc = 1.79;
        inp_libras = 123.00;
        inp_euros = 56.00;

        ConversorDivisas convDiv;
        convDiv = new ConversorDivisas(tc);
        double out_Libras;
        out_Libras = convDiv.librasToEuros(inp_libras);
        tc = convDiv.getTipo_cambio();
        System.out.println("Importe en Euros con el cambio " + tc + " es de " + out_Libras);

    }
}
