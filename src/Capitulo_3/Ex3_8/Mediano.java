package Capitulo_3.Ex3_8;

public class Mediano {

    int a;
    int b;
    int c;

    public Mediano() {
        a = 0;
        b = 0;
        c = 0;
    }

    public void setMediado (int x, int y, int z)
    {
        a = x;
        b = y;
        c = z;
    }
    public int calculoPeq (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

        int peq = 0;

        if (a < b && a < c)      {peq = a;}
        else if (b < a && b < c) {peq = b;}
        else if (c < a && c < b) {peq = c;}

        return peq;
    }

    public int calculoMed (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        int med = 0;
       if   ((a < b && a > c)    || (a > b && a < c)) { med = a;}
       else if ((a < b && b < c) || (a > b && c < b)) { med = b;}
       else if ((a < b && b < c) || (a > b && c < b)) { med = c;}

        return med;
    }

    public int calculoMayor (int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        int mayor = 0;
        if   (a > b && a > c)    { mayor = a;}
        else if (a < b && c < b) { mayor = b;}
        else if (a < c && b < c) { mayor = c;}
        return mayor;
    }
}