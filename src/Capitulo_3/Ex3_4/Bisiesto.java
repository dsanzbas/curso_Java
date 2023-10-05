package Capitulo_3.Ex3_4;

public class Bisiesto {

    int mult_4, mult_100, mult_400;

    public boolean calculoBis (int year)
    {
        boolean bis_yes_no = false;

        mult_4 = year % 4;
        mult_100 = year % 100;
        mult_400 = year % 400;

        if ((mult_4 == 0 && mult_100 != 0) || (mult_100 == 0 && mult_400 == 0))
            bis_yes_no = true;

        return bis_yes_no;
    }

}