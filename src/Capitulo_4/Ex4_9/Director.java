package Capitulo_4.Ex4_9;

public class Director extends Profesor{

    String nombre_dir;
    double sueldo_dir;

    public Director(String nombre, double sueldo) {
        super(nombre, sueldo);
    }

    public Director() {
        super();
    }

    public Director(String nombre_dir) {
        this.nombre_dir = nombre_dir;
    }

    public double getSueldo_dir() {
        return (super.getSueldo_pr() * 1.25);
    }

    public void mostrarMensaje () {
        System.out.println("Clase Director");
    }

    public String toString() {
        return "Director: " + "nombre_dir='" + super.getNombre_pr() + ", sueldo_dir=" + getSueldo_dir() + '}';
    }
}
