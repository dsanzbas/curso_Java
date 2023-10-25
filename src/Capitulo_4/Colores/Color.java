package Capitulo_4.Colores;

public class Color {
    public static void main(String[] args) {

        class Blanco {
            public Blanco() {
                System.out.println("Pinta Blanco");
            }
        }
         class Negro {
             public Negro() {
                 System.out.println("Pinta Negro");
             }
         }

        Blanco b = new Blanco();
        Negro  n = new Negro();
    }
}
