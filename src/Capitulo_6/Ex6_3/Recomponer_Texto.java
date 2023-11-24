package Capitulo_6.Ex6_3;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Recomponer_Texto {
    public static void main(String[] args) {

        try {

            File file = new File("C:\\Users\\dsanzbas\\Desktop\\Ex6_1\\fichero.txt");
            File dir  = file.getParentFile();

            if (!dir.exists()) {
                System.out.printf("El directorio " + file.getParentFile() + " no existe");
                System.exit(1);
            }

            if (!file.exists()) {
                System.out.printf("El archivo " + file.getPath() + " no existe");
                System.exit(2);
            }

            String cadena_input = "";
            String string;
            FileReader input = new FileReader(file);
            BufferedReader buffer_input = new BufferedReader(input);

            while ((string = buffer_input.readLine()) != null) {
                cadena_input = cadena_input.concat(string + " ");
            }
            System.out.println("Registro del fichero: " + cadena_input);
            buffer_input.close();
            input.close();

        } catch (IOException e) {e.printStackTrace();}
    }
}
