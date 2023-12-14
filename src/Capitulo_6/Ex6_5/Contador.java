package Capitulo_6.Ex6_5;

public class Contador {
    private char[] abc = {'A','a','B','b','C','c','D','d','E','e',
            'F','f','G','H','h','I','i','J','j','K','k','L','l',
            'M','m','N','n','O','o','P','p','Q','q','R','r','S','s',
            'T','t','U','u','V','v','W','w','X','x','Y','y','Z','z'};
    public int[] total;

    public Contador() {
        this.total = new int[abc.length];
        for (int i = 0; i < this.total.length; i++) {
            this.total[i] = 0;
        }
    }

    public int[] getTotal() {
        return total;
    }

    public char[] getAbc() {
        return abc;
    }

    public void buscarCaracter (char input) {
        for (int i = 0; i < abc.length; i++) {
            if (input == abc[i]) {
                total[i]++;
                i = abc.length;
            }
        }
    }
}