package Capitulo_4.Ex4_2;

public class Operaciones {
    public static void main(String[] args) {
        int i1,i2,result2;
        double d1,d2,result1;
        Sumar s = new Sumar();

        result2 = s.metodoSumar(1,2);
        System.out.println("Resultado = " + result2);
        result2 = s.metodoSumar(2,2);
        System.out.println("Resultado = " + result2);
        result2 = s.metodoPotencia(2,56);
        System.out.println("Resultado = " + result2);
        result1 = s.metodoPotencia(2.56,6);
        System.out.println("Resultado = " + result1);
    }
}
