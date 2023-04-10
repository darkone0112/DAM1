package examenejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 * repaso1
 */
public class organizararray { 
    public static void main(String [] Args) {
        int vector[][] = new int [4][5];
        assign(vector);
        System.out.print("Array aleatorio sin organizar " + "\n");
        display(vector);
        System.out.println();
        organizarmayor(vector);
        System.out.print("Array aleatorio organizado de mayor a menor " + "\n");
        display(vector);
        System.out.println();
        organizarmenor(vector);
        System.out.print("Array aleatorio organizado de menor a mayor " + "\n");
        display(vector);

        
    }
    public static void assign(int x[][]) {
        try (Scanner input = new Scanner(System.in)) {
        }
        Random rand = new Random();
        for (int fila = 0; fila < x.length; fila++) {
            for (int columna = 0; columna < x[fila].length; columna++) {
                x[fila][columna] = rand.nextInt(((100-1)+1));
            }
        }
    }
    public static void display(int x[][]) {
        try (Scanner input = new Scanner(System.in)) {
        }
        for (int fila = 0; fila < x.length; fila++) {
            for (int columna = 0; columna < x[fila].length; columna++) {
                System.out.print(x[fila][columna] + "\t");
            }
            System.out.println();
        }
    }
    public static void organizarmayor(int x [][]) {
        int auxiliar = x[0][0];
        for (int fila = 0; fila < x.length; fila++) {
            for (int pasadas = 0; pasadas < x.length; pasadas++) {
                for (int columna = 0; columna < x.length-(pasadas); columna++) {
                    if (x[fila][columna + 1] > x[fila][columna]) {
                        auxiliar = x[fila][columna];
                        x[fila][columna] = x[fila][columna + 1];
                        x[fila][columna + 1] = auxiliar;
                    }else{
                        
                    }
                }
            }
        }
    }
    public static void organizarmenor(int x [][]) {
        int auxiliar = x[0][0];
        for (int fila = 0; fila < x.length; fila++) {
            for (int pasadas = 0; pasadas < x.length; pasadas++) {
                for (int columna = 0; columna < x.length-(pasadas); columna++) {
                    if (x[fila][columna + 1] < x[fila][columna]) {
                        auxiliar = x[fila][columna];
                        x[fila][columna] = x[fila][columna + 1];
                        x[fila][columna + 1] = auxiliar;
                    }else{
                        
                    }
                }
            }
        }
    }
}