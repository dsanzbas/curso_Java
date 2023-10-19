package Capitulo_4.Ex4_2;

public class Sumar extends Operaciones{

    Operaciones o = new Sumar();

    public int metodoSumar(int int1, int int2) {
        int resultado;
        resultado = int1 + int2;
        return resultado;
    }
    public double metodoSumar(double dbl1, double dbl2) {
        double resultado;
        resultado = dbl1 + dbl2;
        return resultado;
    }

    public int metodoPotencia(int int1, int int2) {
        int resultado;
        System.out.println("metodoPotencia - int, int");
        resultado = int1 + int2;
        return resultado;
    }
    public double metodoPotencia(double dbl1, int int1) {
        double resultado;
        System.out.println("metodoPotencia - double, int");
        resultado = Math.pow(dbl1,int1);
        return resultado;
    }
}
