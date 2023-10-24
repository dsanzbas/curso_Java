package Capitulo_4.Ex4_9;

public class Main_Class {
    public static void main(String[] args) {
        Profesor p1 = new Director("Director_1",2000.00);
        Profesor p2 = new Profesor("Professor_1",1500.00);

        System.out.println("P1: " + p1.toString());
        System.out.println("P2: " + p2.toString());

        p1.mostrarMensaje();
        p2.mostrarMensaje();

        Director d1 = (Director) p1;

        System.out.println(d1.getNombre_pr());
        System.out.println(d1.getSueldo_pr());
        System.out.println(d1.getSueldo_dir());
    }
}
