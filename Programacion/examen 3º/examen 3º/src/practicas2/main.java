package practicas2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[]Args) {
        makeCopy();
        compareFiles();
    }

    public static void compareFiles() {
        try {
/*         String file1;
        String file2;
        System.out.println("\nIntroduzca ruta absoluta del primer archivo");
        file1 = input.nextLine();
        System.out.println("\nIntroduzca ruta absoluta del segundo archivo");
        file2 = input.nextLine(); */
        
            FileInputStream archivo1 = new FileInputStream("C:\\Users\\D4Rk0n3\\Desktop\\DAM\\programacion\\examen 3º\\examen 3º\\src\\practicas2\\probando1.txt");
            FileInputStream archivo2 = new FileInputStream("C:\\Users\\D4Rk0n3\\Desktop\\DAM\\programacion\\examen 3º\\examen 3º\\src\\practicas2\\diferente.txt");
            System.out.print("OJO1");
            int nBytes1 = archivo1.read();
            int nBytes2 = archivo2.read();
            int contBytes1 = 0;
            int contBytes2 = 0;
            while (nBytes1!=-1) {
                nBytes1 = archivo1.read();
                contBytes1++;
            }
            while (nBytes2!=-1) {
                nBytes2 = archivo2.read();
                contBytes2++;
            }
            System.out.print("OJO2");
            if (contBytes1 == contBytes2) {
                System.out.print("\nLos archivos son iguales\n");
            } else {
                System.out.print("\nLos archivos son diferentes\n");
            }
            archivo1.close();
            archivo2.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    public static void makeCopy() {
        int nBytes;
        try {
            FileInputStream inputStream = new FileInputStream("C:\\Users\\D4Rk0n3\\Desktop\\DAM\\programacion\\examen 3º\\examen 3º\\src\\practicas2\\probando1.txt");
            FileOutputStream copia = new FileOutputStream("C:\\Users\\D4Rk0n3\\Desktop\\DAM\\programacion\\examen 3º\\examen 3º\\src\\practicas2\\probando1-clon.txt");
            int contBytes=0;
            nBytes=inputStream.read();
            while (nBytes!=-1) {
                System.out.print(nBytes);
                copia.write(nBytes);
                nBytes = inputStream.read();
                contBytes++;
            }
            System.out.println("\nHe leido " + contBytes + "bytes");
        } catch (Exception e) {
            System.out.print("aqlgo paso");
        }
    }
}
