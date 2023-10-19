package Capitulo_4.Ex4_3;

public class Animal_main {
    public static void main(String[] args) {

        Animal a1 = new Animal("Perro",10);
//        Animal a2 = new Animal("Gato",5);

        System.out.println("Antes de clonar:");
        System.out.println("Animal a1 = " + a1);

        try {
            Animal a2 = a1.clone();

            if (a1.equals(a2)) {
               System.out.println("a1 == a2");
               System.out.println("a1 = " + a1);
               System.out.println("a2 = " + a2);
            }
            else {
              System.out.println("a1 != a2");
              System.out.println("a1 = " + a1);
              System.out.println("a2 = " + a2);
            }
        }

        catch (Exception e) {

        }
    }
}
