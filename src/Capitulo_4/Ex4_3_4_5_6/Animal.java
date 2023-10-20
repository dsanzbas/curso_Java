package Capitulo_4.Ex4_3_4_5_6;

public class Animal implements Cloneable {

    protected String nombre;
    protected int edad;
    public static int numAnimales = 0;
    private Animal animal;

    // Constructor por defecto
    public Animal() {
    }

    // Constructor copia
    public Animal(Animal a) {
        this.nombre = a.getNombre();
        this.edad   = a.getEdad();
    }

    // Constructor con parámetros formales de entrada
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        numAnimales ++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public Animal clone() {
        Animal a = new Animal(this.nombre, this.edad);
        return a;
    }

    public boolean equals(Animal a) {

        boolean result = false;

        if (a.getEdad() == this.edad && this.nombre.equals(a.getNombre()))
        {
            result = true;
        }

        return result;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
