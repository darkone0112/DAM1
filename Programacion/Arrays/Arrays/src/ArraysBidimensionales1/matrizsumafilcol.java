package ArraysBidimensionales1;

import java.util.Scanner;

public class matrizsumafilcol {
   public static void main(String[]Args) {
       Scanner input = new Scanner(System.in);
       int matriz [][] = new int[5][5];
       for (int fila = 0; fila < matriz.length; fila++) {
           for (int columna = 0; columna < matriz[fila].length; columna++) {
               matriz[fila][columna] = input.nextInt();
           }
       }
       fila(matriz);
       columna(matriz);
       display(matriz);
       input.close();
   }
   public static void fila(int x[][]) {
    for (int fila = 0; fila < x.length; fila++) {
        int total = 0;
        for (int columna = 0; columna < x[fila].length; columna++) {
            total = total + x[fila][columna];
            
        }
        System.out.print("Fila " + (fila+1) + "= " + (total));
        System.out.println();
    }
   }
   public static void columna(int x [][]) {
        for (int fila = 0; fila < x.length; fila++) {
            int total = 0;
            for (int columna = 0; columna < x[fila].length; columna++) {
                total = total + x[columna][fila];
            }
            System.out.print("Columna " + (fila+1) + "= " + (total));
            total = 0;
            System.out.println();
        }
   }
   public static void display(int x[][]) {
    for (int fila = 0; fila < x.length; fila++) {
        for (int columna = 0; columna < x[fila].length; columna++) {
            System.out.print(x[fila][columna] + "\t");
        }
        System.out.println();
    }
   }
}
