package Capitulo_3.Ex3_4;

import java.util.Scanner;

class Bisiesto_main
{
    public static void main(String[] args) {
        Bisiesto bis = new Bisiesto();
        int year;
        boolean bis_yes_no;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el año:");
        year = Integer.parseInt(scanner.next());

        bis_yes_no = bis.calculoBis(year);

        if (bis_yes_no == true)
        {
            System.out.println("El año " + year + " es bisiesto");
        } else
        {
            System.out.println("El año " + year + " no es bisiesto" );
        }
    }
}