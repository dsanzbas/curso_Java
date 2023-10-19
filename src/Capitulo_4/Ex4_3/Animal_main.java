package Capitulo_4.Ex4_3;

public class Animal_main {
    public static void main(String[] args) {

        Animal a1 = new Animal("Perro",10);
//        Animal a2 = new Animal("Gato",5);

        System.out.println("Antes de clonar:");
        System.out.println("Animal a1 = " + a1);

        try {
            Animal a2 = (Animal) a1.clone();
            System.out.println("Animal a2 = " + a2);
        }
        catch (Exception e) {

        }
    }
}
