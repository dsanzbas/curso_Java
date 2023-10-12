package Capitulo_3.Ex3_13;

public class Multiplicar {

    private int a, i, x;

    public Multiplicar(int a) {
        this.a = a;
    }

    public void Multiplicar() {
        if (a == 0 || a < 0) {
            System.out.println("El número introducido es igual o menor que 0");
        } else {
            for (i = 1; i < 11; i++) {
                x = a * i;
                System.out.println(a + " * " + i + " = " + x);
            }
        }
    }
}
