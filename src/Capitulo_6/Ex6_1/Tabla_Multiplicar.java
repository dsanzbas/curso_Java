package Capitulo_6.Ex6_1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tabla_Multiplicar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Introducir un número entre el 1 y el 10: ");
            int i = input.nextInt();

            File file = new File("C:\\Users\\crist\\Desktop\\Ex6_1", "Ex6_1.txt");

            boolean dir_created = file.mkdir();
            boolean file_created = file.createNewFile();

            if ((dir_created) && (file_created)) {
                FileOutputStream output = new FileOutputStream(file);
            }
        } catch (InputMismatchException e) {
            System.out.println("Formato numérico incorrecto");
            input.nextLine();
        } catch (IOException e) {e.printStackTrace();}
    }
}
