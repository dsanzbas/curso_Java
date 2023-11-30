package Capitulo_6.Ex6_5;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Contar_Letras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contar_Letras tm = new Contar_Letras();
        String package_name = tm.getClass().getPackageName();

        try {
            System.out.println("Introducir nombre de fichero: ");
            String fichero = scanner.nextLine();
            //String dir = System.getProperty("user.dir") + "\\" + package_name + "\\fichero1.txt";
            String dir = System.getProperty("user.dir") + "\\" + fichero + ".txt";
            File file = new File(dir);
            File txt  = file.getParentFile();

            if (!txt.exists()) {
                System.out.println("El directorio no existe");
                System.exit(1);
            }
            if (!file.exists()) {
                System.out.println("El fichero no existe");
                System.exit(1);
            }

            String cadena_input;
            FileReader input = new FileReader(file);
            BufferedReader bf = new BufferedReader(input);
            while ((cadena_input = bf.readLine()) != null){
                cadena_input.
            }
            output.close();

        } catch (InputMismatchException e) {
            System.out.println("Formato numérico incorrecto");
            input.nextLine();
        } catch (IOException e) {e.printStackTrace();}
    }
}
