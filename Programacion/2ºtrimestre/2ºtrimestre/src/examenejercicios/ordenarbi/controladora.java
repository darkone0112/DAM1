package examenejercicios.ordenarbi;

import java.util.Random;
import java.util.Scanner;

public class controladora {
    public static void main(String [] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("numeros de filas" + "\n");
            int filas = input.nextInt();
            System.out.print("numeros de filas" + "\n");
            int columnas = input.nextInt();
            int vector [][] = new int [filas][columnas];
            int vectoraux [] = new int [filas * columnas];
            assign(vector);
            System.out.println();
            display(vector);
            int i = 0;
            for (int fila = 0; fila < vector.length; fila++) {
                for (int columna = 0; columna < vector.length; columna++) {
                    vectoraux[i] = vector[fila][columna];
                    i++;
                }
            }
/*         System.out.println();
            display2(vectoraux); */
            ordenar(vectoraux);
/*         System.out.println();
            display2(vectoraux); */
            i = 0;
            for (int fila = 0; fila < vector.length; fila++) {
                for (int columna = 0; columna < vector.length; columna++) {
                  vector[fila][columna] = vectoraux[i];  
                  i++;
                }
            }
            System.out.println();
            display(vector);
        }
    }
    public static void assign(int x [][]) {
        Random rand = new Random((0-100)+100);
        for (int fila = 0; fila < x.length; fila++) {
            for (int columna = 0; columna < x.length; columna++) {
                x[fila][columna] = rand.nextInt((100));
            }
        }
    }
    public static void display(int x [][]) {
        for (int fila = 0; fila < x.length; fila++) {
            for (int columna = 0; columna < x.length; columna++) {
                System.out.print(x[fila][columna] + "\t");
            }
            System.out.println();
        }
    }
    public static void display2(int x[]) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "\t");
        }
    }
    public static void ordenar(int x []) {
        int aux = 0;
        for (int pasadas = 1; pasadas < x.length; pasadas++) {
            for (int i = 0; i < x.length-(pasadas); i++) {
                if (x[i] > x[i+1]) {
                    aux = x[i];
                    x[i] = x[i+1];
                    x[i+1] = aux;
                }
            }
        }
    }
}
