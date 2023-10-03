package Capitulo_3.Ex3_1;

import java.util.Scanner;

public class PositivoNegativo {
    boolean pos_neg = false;

    public int leerNum ()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca valor:");
        int num = Integer.parseInt(scanner.next());
        return num;
    }

    public boolean PosNeg (int num)
    {

        if (num < 0)
        {
            System.out.println("El número " + num + " es negativo");
        }
        else
        {
            pos_neg = true;
            System.out.println(("El número " + num + " es positivo o cero"));
        }
        return pos_neg;
    }
}
