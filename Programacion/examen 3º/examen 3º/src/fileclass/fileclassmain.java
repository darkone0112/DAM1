package fileclass;
/**
 * fileclassmain
 */

import java.io.File;
import java.util.Scanner;

public class fileclassmain {
public static Scanner input = new Scanner(System.in);
    public static void main(String[]args) {
        File file = new File("C:/Users/D4Rk0n3/Desktop/probando.txt");

        if (file.exists()) {
            System.out.println("Esiste");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
        } else {
            System.out.println("no esiste");
        }
    }
}
