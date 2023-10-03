package Capitulo_3.Ex3_1;

import java.util.Scanner;

class PositivoNegativo_main
{
    public static void main(String[] args)
    {
        PositivoNegativo pos_neg = new PositivoNegativo();
        boolean pos_yes_no;
        int num = 0;

        num = pos_neg.leerNum();
        pos_yes_no = pos_neg.PosNeg(num);
    }
}
