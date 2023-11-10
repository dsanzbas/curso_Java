package Capitulo_5.Ex5_10;

public class Restar_Arrays {
    int[] a1 = new int[10];
    int[] a2 = new int[10];
    int[] resta = new int[10];
    int me_llevo, i = 0;

    public Restar_Arrays(int[] a1, int[] a2) {
        this.a1 = a1;
        this.a2 = a2;
    }
    // Obtener array suma resultante
    public int[] getResta() {
        return resta;
    }

    // Sumar arrays
    public void restar_arrays () {
        int i, resta = 0;
        for (i = (a1.length - 1); i >= 0; i--) {
            resta = 0;
            if (a1[i] < a2[i]) {
                if (i != 0) {
                    resta = (10 + a1[i]) - (a2[i] + me_llevo);
                    me_llevo = 1;
                }
                else {
                    resta = a1[i] - a2[i];
                    me_llevo = 1;
                }
            }
            else {
                resta = a1[i] - (a2[i] + me_llevo);
                me_llevo = 0;
            }
            this.resta[i] = resta;

        }
    }

}
