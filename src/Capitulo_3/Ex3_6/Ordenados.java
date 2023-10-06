package Capitulo_3.Ex3_6;

public class Ordenados {

    int a,b,c;

    public void setOrdenados (int x, int y, int z)
    {
        a = x;
        b = y;
        c = z;
    }
    public boolean ordenados ()
    {
        boolean ordenados = false;

        if ((a < b) && (b < c))
        {
           ordenados = true;
        }
        return ordenados;
    }
    public boolean consecutivos ()
    {
        boolean consecutivos = false;

        if (((a + 1) == b) && ((b + 1) == c))
        {
            consecutivos = true;
        }
        return consecutivos;
    }
}