package Capitulo_4.Ex4_8;

public class Principal {
    public static void main(String[] args) {

        Figura_Geometrica fg1 = new Figura_Geometrica();
        Circulo cr1 = new Circulo();
        Rectangulo rc1 = new Rectangulo();
        Cuadrado cu = new Cuadrado();

        fg1.setColor("amarillo");
        System.out.println(fg1.toString());

        cr1.setColor("verde");
        cr1.setRadio(2.36);
        System.out.println(cr1.toString());

        rc1.setAlto(2.37);
        rc1.setAncho(8.91);
        System.out.println(rc1.toString());

        cu.setAncho(4.50);
        cu.setColor("verde");
        cu.setRelleno(true);
        System.out.println(cu.toString());
    }
}
