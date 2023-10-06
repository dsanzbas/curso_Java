package Capitulo_3.Ex3_6;

import java.util.Scanner;

class Ordenados_main
{
    public static void main(String[] args) {
        Ordenados bis = new Ordenados();
        int a,b,c;
        boolean ordenados, consecutivos;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el 1er número:");
        a = Integer.parseInt(scanner.next());

        System.out.println("Introduzca el 2ndo número:");
        b = Integer.parseInt(scanner.next());

        System.out.println("Introduzca el 3er número:");
        c = Integer.parseInt(scanner.next());

        bis.setOrdenados(a, b, c);
        ordenados = bis.ordenados();

        if (ordenados == true)
        {
            consecutivos = bis.consecutivos();
            if (consecutivos == true)
            {
                System.out.println("Números ordenados y consecutivos");
            }
            else
            {
                System.out.println(("Números ordenados y no consecutivos"));
            }
        }
        else
        {
            System.out.println("Números no ordenados");
        }
    }
}