package Capitulo_6.Ex6_2;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Trocear_Con_Buffer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean dir_created = false;
        boolean file_created = false;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Introducir un texto: ");
            String cadena = br.readLine();

            String dir = System.getProperty("user.dir") + "\\fichero.txt";
            File file = new File(dir);
            File txt  = file.getParentFile();

            if (!txt.exists()) {
                dir_created = txt.mkdir();}

            if (file.exists()) {
                file_created = file.createNewFile();
            } //else {
            //    file.delete();
            //    file.createNewFile();
            //}

            String cadena_output;
            FileWriter output = new FileWriter(file);
            cadena_output = cadena.replaceAll(" ", "\n");
            output.write(cadena_output);

            output.close();

        } catch (InputMismatchException e) {
            System.out.println("Formato numérico incorrecto");
            input.nextLine();
        } catch (IOException e) {e.printStackTrace();}
    }
}
