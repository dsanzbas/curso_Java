package Capitulo_4.Ex4_13;

public class Oculta {
    public static void main(String[] args) {
    }

    public interface Display {
        public void referencia();
    }

    private class ClasePrivada implements Display {
        Display cp = new ClasePrivada();

        @Override
        public void referencia() {
            System.out.println("Referencia: " + cp);
        }
    }
}
