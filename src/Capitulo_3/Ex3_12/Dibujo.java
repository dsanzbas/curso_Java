package Capitulo_3.Ex3_12;

public class Dibujo {

    private int a, b, i;

    public void dibujar() {
        for (i = 1; i < 6; i++) {
            int x;
            for (x = 1; x < 6; x++) {
                if (i % 2 != 0) {
                    if (x % 2 != 0) {
                        System.out.print("*");
                        if (x < 5) {
                            System.out.print("_");
                        }
                    }
                }
                else
                {
                    if (x < 5 && x % 2 != 0) {System.out.print("_");}

                    if (x % 2 == 0) {
                        System.out.print("*");
                    }
//                    else
//                    {
//                        System.out.print(" ");
//                    }
                }
                if (x == 5) System.out.println();
            }
        }
    }
}