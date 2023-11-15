package Capitulo_5.Ex5_10;

public class Multiplicar_Arrays {
    int[] a1 = new int[10];
    int[] a2 = new int[10];
    int[] multiplicacion = new int[10];
    int me_llevo, i = 0;

    public Multiplicar_Arrays(int[] a1, int[] a2) {
        this.a1 = a1;
        this.a2 = a2;
    }
    // Obtener array suma resultante
    public int[] getMulti() {
        return multiplicacion;
    }

    // Sumar arrays
    public void multiplicar_arrays () {
        int i, multiplica = 0;
        for (i = (a1.length - 1); i >= 0; i--) {
            multiplica = 0;
            if (a1[i] < a2[i]) {
                if (i != 0) {
                    multiplica = (10 + a1[i]) - (a2[i] + me_llevo);
                    me_llevo = 1;
                }
                else {
                    multiplica = a1[i] - a2[i];
                    me_llevo = 1;
                }
            }
            else {
                multiplica = a1[i] - (a2[i] + me_llevo);
                me_llevo = 0;
            }
            this.multiplicacion[i] = multiplica;
        }
    }
}
