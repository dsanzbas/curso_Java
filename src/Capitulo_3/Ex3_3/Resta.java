package Capitulo_3.Ex3_3;

public class Resta {
    public int resta;

    //Resta() {resta = 0;}

    public int Resta_Int (int valor1, int valor2)
    {
        if (valor1 >= valor2)
            resta = valor1 - valor2;
        else
            resta = valor2 - valor1;
        return resta;
    }
}