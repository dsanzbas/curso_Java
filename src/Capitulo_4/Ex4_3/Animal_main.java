package Capitulo_4.Ex4_3;

public class Animal_main {
    public static void main(String[] args) {

        Animal a1 = new Animal("Perro",10);
        boolean equal = false;
//        Animal a2 = new Animal("Gato",5);

        System.out.println("Antes de clonar:");

        try {
            Animal a2 = a1.clone();
            a2.setNombre("Gato");
            System.out.println("a1 = " + a1);
            System.out.println("a2 = " + a2);
            Animal a3 = new Animal(a2);

            if (a1.equals(a2)) {
               System.out.println("a1 == a2");
            }
            else {
               System.out.println("a1 != a2");
            }
            System.out.println("Nº animales: " + Animal.numAnimales);
            System.out.println("Animal a3.nombre: " + a3.nombre);
            System.out.println("Animal a3.edad  : " + a3.edad);
        }

        catch (Exception e) {

        }
    }
}
