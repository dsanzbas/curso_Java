package Capitulo_3.Ex3_5;

import java.util.Scanner;

class ParteDecimal_main
{
    public static void main(String[] args) {
        ParteDecimal bis = new ParteDecimal();
        double num;
        boolean decimal;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el número:");
        num = Double.parseDouble(scanner.next());

//        decimal = bis.calculo(num);

        if (bis.calculo(num))
        {
            System.out.println("El número " + num + " no tiene parte decimal");
        } else
        {
            System.out.println("El número " + num + " si tiene parte decimal" );
        }
    }
}