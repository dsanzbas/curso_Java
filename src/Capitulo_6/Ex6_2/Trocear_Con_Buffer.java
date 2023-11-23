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
            StringTokenizer cadena = new StringTokenizer(br.readLine());

            File file = new File("C:\\Users\\dsanzbas\\Desktop\\Ex6_1\\fichero.txt");
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

            while (cadena.hasMoreTokens()) {
                cadena_output = cadena.nextToken();
                output.write(cadena_output);
                output.write('\n');
            }
            output.close();

        } catch (InputMismatchException e) {
            System.out.println("Formato numérico incorrecto");
            input.nextLine();
        } catch (IOException e) {e.printStackTrace();}
    }
}
