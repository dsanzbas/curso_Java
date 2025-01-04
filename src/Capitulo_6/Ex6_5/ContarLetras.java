package Capitulo_6.Ex6_5;

import java.io.*;
import java.util.Scanner;

public class Contar_Letras {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introducir nombre de fichero: ");
        String fichero = scanner.nextLine();
        FileReader input = null;
        BufferedReader bf = null;
        try {
            String dir = System.getProperty("user.dir") + "\\" + fichero + ".txt";
            File file = new File(dir);
            File txt = file.getParentFile();

            if (!txt.exists()) {
                System.out.println("El directorio no existe");
                System.exit(1);
            }
            if (!file.exists()) {
                System.out.println("El fichero no existe");
                System.exit(1);
            }

            String cadenaInput;
            int i = 0;
            Contador bc = new Contador();
            input = new FileReader(file);
            bf = new BufferedReader(input);
            while ((cadenaInput = bf.readLine()) != null) {
                for (i = 0; i < cadenaInput.length(); i++) {
                    bc.buscarCaracter(cadenaInput.charAt(i));
                }
            }
            int[] total = bc.getTotal();
            char[] abc = bc.getAbc();
            for (i = 0; i < abc.length; i++) {
                System.out.println("Nº veces letra " + abc[i] + " :" + total[i]);
            }

        } catch (IOException e) {e.printStackTrace();}
        finally {
            if (input != null) {input.close();}
            if (bf    != null) {bf.close();}
        }
    }
}
