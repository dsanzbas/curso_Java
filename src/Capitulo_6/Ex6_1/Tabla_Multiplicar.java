package Capitulo_6.Ex6_1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tabla_Multiplicar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean dir_created = false;
        boolean file_created = false;
        try {
            System.out.println("Introducir un número entre el 1 y el 10: ");
            int intg = input.nextInt();

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
            for (int i = 1; i <= 10; i++) {
                cadena_output = i + " * " + intg + " = " + (i * intg);
                output.write(cadena_output);
            }
            output.close();

        } catch (InputMismatchException e) {
            System.out.println("Formato numérico incorrecto");
            input.nextLine();
        } catch (IOException e) {e.printStackTrace();}
    }
}
