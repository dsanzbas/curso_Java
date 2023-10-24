package Capitulo_4.Ex4_9;

public class Profesor {

    String nombre_pr;
    double sueldo_pr;

    public Profesor(String nombre, double sueldo) {
        this.nombre_pr = nombre;
        this.sueldo_pr = sueldo;
    }

    public Profesor() {
        this.nombre_pr = "";
        this.sueldo_pr = 0.00;
    }

    public String getNombre_pr() {
        return nombre_pr;
    }

    public void setNombre_pr(String nombre) {
        this.nombre_pr = nombre;
    }

    public double getSueldo_pr() {
        return sueldo_pr;
    }

    public void setSueldo_pr(double sueldo) {
        this.sueldo_pr = sueldo;
    }

    public void mostrarMensaje () {
        System.out.println("Clase profesor");
    }

    public String toString() {
        return "Profesor: " + "nombre_pr = '" + nombre_pr + '\'' + ", sueldo_pr = " + sueldo_pr + '}';
    }
}
