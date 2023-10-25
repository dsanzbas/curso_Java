package Capitulo_4.Ex4_12;

public class Formas_Main {
    public static void main(String[] args) {

        Formas f = new Circulo();
        f.identidad();

        Circulo c = new Circulo();
        ((Formas) c).identidad();

        ((Circulo) f).identidad();

        //Formas f2 = new Formas(); >> Las clases abstractas no pueden instanciarse

        ((Formas) f).identidad();
    }
}
