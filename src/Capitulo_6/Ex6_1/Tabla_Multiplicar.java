package Capitulo_6.Ex6_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.*;

public class Tabla_Multiplicar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tabla_Multiplicar tm = new Tabla_Multiplicar();
        String package_name = tm.getClass().getPackageName();

        try {
            System.out.println("Introducir un número entre el 1 y el 10: ");
            int intg = input.nextInt();
            //String dir = System.getProperty("user.dir") + "\\" + package_name + "\\fichero1.txt";
            String dir = System.getProperty("user.dir") + "\\fichero1.txt";
            File file = new File(dir);
            File txt  = file.getParentFile();

            if (!txt.exists()) {
                txt.mkdir();
            }

            file.createNewFile();

            String cadena_output;
            FileWriter output = new FileWriter(file);
            for (int i = 1; i <= 10; i++) {
                cadena_output = i + " * " + intg + " = " + (i * intg) + "\n";
                output.write(cadena_output);
            }
            output.close();

        } catch (InputMismatchException e) {
            System.out.println("Formato numérico incorrecto");
            input.nextLine();
        } catch (IOException e) {e.printStackTrace();}
    }
}
