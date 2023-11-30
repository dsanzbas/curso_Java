package Capitulo_6.Ex6_4;

import java.io.*;

public class Concatenar_Ficheros {
    public static void main(String[] args) {

        try {

            String dir_path1 = System.getProperty("user.dir") + "\\fichero1.txt";
            File file1 = new File(dir_path1);
            String dir_path = System.getProperty("user.dir") + "\\fichero.txt";
            File file = new File(dir_path);
            String dir_path2 = System.getProperty("user.dir") + "\\fichero2.txt";
            File file2 = new File(dir_path2);
            File dir  = file.getParentFile();

            if (!dir.exists()) {
                System.out.printf("El directorio " + dir_path + " no existe");
                System.exit(1);
            }

            if (!file.exists()) {
                System.out.printf("El archivo " + file.getPath() + " no existe");
                System.exit(2);
            }

            if (!file1.exists()) {
                System.out.printf("El archivo " + file1.getPath() + " no existe");
                System.exit(2);
            }

            String cadena_input = "";
            String string;
            FileReader input  = new FileReader(file);
            FileReader input1 = new FileReader(file1);
            BufferedReader buffer_input  = new BufferedReader(input);
            BufferedReader buffer_input1 = new BufferedReader(input1);
            FileWriter output = new FileWriter(file2);

            while ((string = buffer_input.readLine()) != null) {
                cadena_input = string + "\n";
                output.write(cadena_input);
            }

            System.out.println("Registro del fichero: " + cadena_input);
            buffer_input.close();
            input.close();
            cadena_input = "";
            while ((string = buffer_input1.readLine()) != null) {
                cadena_input = string + "\n";
                output.write(cadena_input);
            }
            System.out.println("Registro del fichero: " + cadena_input);
            buffer_input1.close();
            input1.close();
            output.close();

        } catch (IOException e) {e.printStackTrace();}
    }
}
