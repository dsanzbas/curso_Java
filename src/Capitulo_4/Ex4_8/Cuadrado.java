package Capitulo_4.Ex4_8;

public class Cuadrado extends Rectangulo{

    double lado, ancho;

    public Cuadrado() {
        super();
    }

    public Cuadrado(double ancho, double alto, String color, boolean relleno) {
        super(ancho, alto, color, relleno);
    }

    public Cuadrado(double lado) {
        super(lado,lado);
    }

    @Override
    public String toString() {
        return "Cuadrado { " +
                "Area = " + calcularArea() +
                " " +
                " Perimetro = " + calcularPerimetro() +
                '}';
    }

    @Override
    public double calcularArea() {
        return super.calcularArea();
    }

    @Override
    public double calcularPerimetro () {
        return super.calcularPerimetro();
    }

    public void setAncho(double lado) {
        super.setAncho(lado);
        super.setAlto(lado);

    }
}
