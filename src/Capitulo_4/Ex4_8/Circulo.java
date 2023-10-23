package Capitulo_4.Ex4_8;

public class Circulo extends Figura_Geometrica{

    double radio;
    final double PI = 3.141592;

    public Circulo() {
        this.radio = 1.0;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo (double radio, String color, boolean relleno) {
        super(color,relleno);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea () {
        double area;
        area = Math.pow(this.radio,2) * PI;
        return area;
    }

    public double calcularPerimetro () {
        double perimetro;
        perimetro = (2 * PI) * this.radio;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Circulo de radio" + getRadio() + " - Superclase: " + super.toString();
    }
}
