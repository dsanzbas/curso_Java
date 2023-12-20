package Capitulo_6.Ex6_7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MathFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op = 0;

        System.out.println("1 - Introducir nuevos datos");
        System.out.println("2 - Leer datos del archivo");

        try {
            op = scanner.nextInt();
        } catch (InputMismatchException e ) {e.printStackTrace();}

        switch (op) {
            case 1:
                LeerDatos ld = new LeerDatos();
                break;
            case 2:
                IntroDatos id = new IntroDatos();
                break;
            default:
                LoggerClass lc = new LoggerClass();
                lc.showMessage("Opción incorrecta");
                System.exit(1);
                break;
        }
    }
}
