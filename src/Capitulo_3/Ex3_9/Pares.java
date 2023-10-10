package Capitulo_3.Ex3_9;

public class Pares {

    private int a, b, i;

    public Pares(int a, int b) {
        this.a = a;
        this.b = b;
        i = this.a;
    }
    public void getPares ()
    {
        if (a % 2 != 0) {a = a + 1;}

        for(; i < b; i = i + 2){
            System.out.printf(" Número par: " + i);
        }
    }

}