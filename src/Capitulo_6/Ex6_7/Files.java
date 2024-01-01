package Capitulo_6.Ex6_7;

import java.io.*;
import java.util.ArrayList;

public class Files {
    private String dir;
    private File file = null;

    public Files() {
        this.dir = System.getProperty("user.dir") + "\\" + "fichero.txt";
        this.file = new File(this.dir);
        System.out.println("Path: " + this.dir);
    }

    public void leerFichero () {
        String line = "";
        String output = "";
        IsNumeric in = new IsNumeric();
        boolean number = false;
        try (FileReader input = new FileReader(file);BufferedReader bf = new BufferedReader(input)) {
            while ((line = bf.readLine()) != null) {
                number = in.Numeric(line);
                if (number) {
                    output = output.concat(line) + ",";
                }
            }
            System.out.println("output: " + output);
        }
        catch (IOException e) {e.printStackTrace();}
    }

    public void escribirFichero (ArrayList<Integer> num) {
        try (FileWriter output = new FileWriter(file)){
            int suma = 0;
            double media = 0.00;
            output.write("Números: " + '\n');

            for (int i = 0; i < 5; i++) {
                output.write(String.valueOf(num.get(i)) + '\n');
                suma = suma + num.get(i);
            }

            media = (double) suma / 5;

            output.write("Suma : " + suma + '\n');
            output.write("Media: " + media);
        }
        catch (IOException e) {e.printStackTrace();}
    }
}