package Capitulo_4.Ex4_8;

public class Figura_Geometrica extends Principal {
    protected String color;
    protected boolean relleno;

    public Figura_Geometrica(String color, boolean relleno) {
        this.color = color;
        this.relleno = relleno;
    }

    public Figura_Geometrica() {
        this.color   = "rojo";
        this.relleno = true;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    @Override
    public String toString() {
        return "Figura_Geometrica{" +
                "color='" + color + '\'' +
                ", relleno=" + relleno +
                '}';
    }
}
