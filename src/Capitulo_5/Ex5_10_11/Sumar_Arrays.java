package Capitulo_5.Ex5_10_11;

public class Sumar_Arrays {
    int[] a1 = new int[10];
    int[] a2 = new int[10];
    int[] suma = new int[10];
    int me_llevo, i = 0;

    public Sumar_Arrays(int[] a1, int[] a2) {
        this.a1 = a1;
        this.a2 = a2;
    }
    // Obtener array suma resultante
    public int[] getSuma() {
        return suma;
    }

    // Sumar arrays
    public void sumar_arrays () {
        int i, suma = 0;
        for (i = (a1.length - 1); i >= 0; i--) {
            suma = 0;
            suma = me_llevo + a1[i] + a2[i];
            if (suma >= 10) {
                if (i != 0) {
                    me_llevo = 1;
                    suma = suma - 10;
                }
                this.suma[i] = suma;
            } else {
                me_llevo = 0;
                this.suma[i] = suma;
            }
        }
    }

}
