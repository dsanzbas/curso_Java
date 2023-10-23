package Capitulo_4.Ex4_8;

public class Rectangulo extends Figura_Geometrica{
    double ancho;
    double alto;

    public Rectangulo() {
        this.alto = 1.0;
        this.ancho = 1.0;
    }

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public Rectangulo (double ancho, double alto, String color, boolean relleno) {
        super(color, relleno);
        this.ancho = ancho;
        this.alto  = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double calcularArea () {
        double area;
        area = this.alto * this.ancho;
        return area;
    }

    public double calcularPerimetro () {
        double perimetro;
        perimetro = (alto * 2) + (ancho * 2);
        return perimetro;
    }

    @Override
    public String toString() {
        return "Area : " + calcularArea() + " " + "Perímetro: " + calcularPerimetro() + " " + " - Superclase: " +
                super.toString();
    }
}
