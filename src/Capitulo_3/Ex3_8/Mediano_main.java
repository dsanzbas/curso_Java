package Capitulo_3.Ex3_8;

import java.util.Scanner;

class Mediano_main
{
    public static void main(String[] args) {
        Mediano bis = new Mediano();
        int a,b,c;
        int peq,med,may;
        boolean ordenados, consecutivos;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el 1er número:");
        a = Integer.parseInt(scanner.next());

        System.out.println("Introduzca el 2ndo número:");
        b = Integer.parseInt(scanner.next());

        System.out.println("Introduzca el 3er número:");
        c = Integer.parseInt(scanner.next());

        bis.setMediado(a, b, c);
        peq = bis.calculoPeq( a, b, c);
        med = bis.calculoMed(a, b, c);
        may = bis.calculoMayor(a, b, c);

        System.out.println("El número más pequeño es " + peq);
        System.out.println("El número más mediano es " + med);
        System.out.println("El número más mayor es " + may);

    }
}