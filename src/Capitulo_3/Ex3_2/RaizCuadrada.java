package Capitulo_3.Ex3_2;

import java.util.Scanner;

public class RaizCuadrada {
    double sqr;
    RaizCuadrada() {sqr = 0.00;}

    public double Square (int num)
    {
        if (num  >= 0)
        {
            sqr = Math.sqrt(num);
        }
        return sqr;
    }
}