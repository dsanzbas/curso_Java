package Capitulo_2.Ex2_3;
import  java.util.Scanner;

class MiNumero_Main
{
    public static void main(String[] args)
    {
        int input_num  = 0;
        int num_mult   = 0;
        int inp_numero = 55;
        int out_numero = 0;
        

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca valor:");
        int u = Integer.parseInt(scanner.next());
        MiNumero mi_num = new MiNumero(u);
        out_numero = mi_num.getCuadruple();
        System.out.println("4 veces el número " + u + " es " + out_numero);
        System.out.println();

    }
}
