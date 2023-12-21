package Capitulo_6.Ex6_7;

import java.io.*;

public class Files {
    private String dir;
    private File file = null;

    public Files() {
        this.dir = System.getProperty("user.dir") + "\\" + "fichero.txt";
        this.file = new File(this.dir);
    }

    public void leerFichero () {
        try (FileReader input = new FileReader(file);BufferedReader bf = new BufferedReader(input)){}
        catch (IOException e) {e.printStackTrace();}
    }

    public void escribirFichero (int[] n) {
        try (FileWriter output = new FileWriter(file)){
            int suma = 0;
            double media = 0.00;
            output.write("Numeros: " + '\n');

            for (int i = 0; i < 5; i++) {
                output.write(String.valueOf(n[i]) + '\n');
                suma = suma + n[i];
            }

            media = (double) suma/ 5;

            output.write("Suma : " + suma + '\n');
            output.write("Media: " + media);
        }
        catch (IOException e) {e.printStackTrace();}
    }
}