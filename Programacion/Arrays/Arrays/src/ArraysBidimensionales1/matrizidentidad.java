package ArraysBidimensionales1;

import java.util.Scanner;

public class matrizidentidad {
   public static void main(String[]Args) {
       Scanner input = new Scanner(System.in);
       int tabla[][] = new int [5][5];
       int identidad = 0;
       for (int fila = 0; fila < tabla.length; fila++) {
           for (int columna = 0; columna < tabla[fila].length; columna++) {
               System.out.print("Fila " + (fila + 1) + " Columna " + (columna + 1) + ": ");
               tabla[fila][columna] = input.nextInt();
               if (fila == columna && tabla[fila][columna] == 0) {
                   identidad++;
               }else{
                   if (tabla[fila][columna]==1) {
                       identidad++;
                   }
               }
           }
       }
       if (identidad == 25) {
           System.out.println("Identidad");
       } else {
        System.out.println("NO Identidad");
       }
       display(tabla);
       input.close();
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

