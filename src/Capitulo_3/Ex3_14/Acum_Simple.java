package Capitulo_3.Ex3_14;

public class Acum_Simple {

    private int a = 0, i;

    public void Acumular()
    {
       for (i = 1; i < 1001; i++)
       {
           if (i % 2 == 0)
           {
              a = a + i;
           }
       }
        System.out.println("Suma total de los primeros 1000 números pares: " + a);
    }
}
