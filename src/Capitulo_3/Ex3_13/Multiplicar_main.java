package Capitulo_3.Ex3_13;

import java.util.Scanner;

class Multiplicar_main
{
    public static void main(String[] args) {

        int a;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca número:");
        a = Integer.parseInt(scanner.next());

        Multiplicar multiplicar = new Multiplicar(a);
        multiplicar.Multiplicar();
        }
    }
