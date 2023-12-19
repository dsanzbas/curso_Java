package Capitulo_6.Ex6_6;

import Capitulo_6.Ex6_5.Contador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BuscarPalabra {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introducir nombre de fichero: ");
        String fichero = scanner.nextLine();

        LoggerClass lc = new LoggerClass();
        String dir = System.getProperty("user.dir") + "\\" + fichero + ".txt";
        File file = new File(dir);
        File txt;
        txt = file.getParentFile();

        try (FileReader input = new FileReader(file); BufferedReader bf = new BufferedReader(input)){

            if (!txt.exists()) {
                String message = "El directorio no existe";
                lc.showMessage(message);
                System.exit(1);
            }
            if (!file.exists()) {
                String message = "El fichero no existe";
                lc.showMessage(message);
                System.exit(1);
            }

            String cadenaInput;
            cadenaInput = bf.readLine();
            System.out.println("Introducir texto a buscar: ");
            String buscar = scanner.nextLine();
            boolean val = cadenaInput.contains(buscar);

            if (val) {
                String message = "Texto encontrado";
                lc.showMessage(message);
            } else {
                String message = "Texto no encontrado";
                lc.showMessage(message);
            }
        } catch (IOException e) {e.printStackTrace();}
    }
}
