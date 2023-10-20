package Capitulo_4.Ex4_3;

public class Gato extends Animal {
    static int vidas = 7;

    public static int vidas() {
        return vidas;
    }

    public int restarVidas () {
        vidas--;
        return vidas;
    }
}
