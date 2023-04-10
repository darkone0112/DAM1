package ArraysBidimensionales1;

import java.util.Scanner;

public class matrizfilamayor {
   public static void main(String[]Args) {
       int matriz[][] = new int [3][4];
       int sumfil [] = new int [3];
       assign(matriz);
       for (int fila = 0; fila < matriz.length; fila++) {
           for (int columna = 0; columna < matriz[fila].length; columna++) {
               sumfil[fila] += matriz [fila][columna];
           }
       }
       rellenar(sumfil);

       compare(sumfil);
   }
   public static void assign(int x[][]) {
       Scanner input = new Scanner(System.in);
       for (int fila = 0; fila < x.length; fila++) {
           for (int columna = 0; columna < x[fila].length; columna++) {
               System.out.println("Introduzca valor en la posicion " + fila + "_" + columna );
                x[fila][columna] = input.nextInt();
           }
       }
       input.close();
   }
   public static void rellenar(int x[]) {
       for (int i = 0; i < x.length; i++) {
           System.out.println(x[i]);
       }
   }
   public static void compare(int x []) {
       int mayor = 0;
       for (int i = 0; i < x.length; i++) {
        if (i>0) {
            if (x[i] > x[i-1]) {
                mayor = i;
            }
       }
   }
   System.out.println("La fila mayor es la " + (mayor+1));
}
}
