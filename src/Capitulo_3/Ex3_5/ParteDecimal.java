package Capitulo_3.Ex3_5;

public class ParteDecimal {

    double round = 0;

    public boolean calculo (double num)
    {
        boolean decimal = false;

        round = Math.round(num);

        if (round == num)
        {
            decimal = true;
        }
        else
        {
            decimal = false;
        }

        return decimal;
    }

}