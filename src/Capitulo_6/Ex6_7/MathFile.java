package Capitulo_6.Ex6_7;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MathFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op = 0;
        ArrayList<Integer> num = new ArrayList<>();
        Files f = new Files();

        try {
            System.out.println("1 - Introducir nuevos datos");
            System.out.println("2 - Leer datos del archivo");
            op = scanner.nextInt();
        } catch (InputMismatchException e) {e.printStackTrace();}

        switch (op) {
            case 1:
                System.out.println("Introduzca 5 valores númericos");
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Valor " + (i + 1) + ": " );
                        num.add(i, scanner.nextInt());
                    }
                } catch (InputMismatchException e) {e.printStackTrace();}
                f.escribirFichero(num);
                break;
            case 2:
                System.out.println("Leyendo el fichero...");
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Valor " + (i + 1) + ": " );
                        num.add(i, scanner.nextInt());
                    }
                } catch (InputMismatchException e) {e.printStackTrace();}
                break;
            default:
                LoggerClass lc = new LoggerClass();
                lc.showMessage("Opción incorrecta");
                System.exit(1);
                break;
        }
    }
}
