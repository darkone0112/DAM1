package ArraysBidimensionales1;

import java.util.Scanner;

public class arrayunisumafilabi {
public static void main(String[]Args) {
    int bidimensional [][] = new int [5][10];
    int unidimensional [] = new int [5];
    assign(bidimensional);
    int total;
    for (int fila = 0; fila < bidimensional.length; fila++) {
        total = 0;
        for (int columna = 0; columna < bidimensional[fila].length; columna++) {
            total = total + bidimensional[fila][columna];
        }
        unidimensional[fila]=total;
    }
    display(unidimensional);
}

public static void assign(int x [][]) {
    Scanner input = new Scanner(System.in);
    for (int fila = 0; fila < x.length; fila++) {
        for (int columna = 0; columna < x[fila].length; columna++) {
            System.out.print("Valor fila: " + (fila + 1) + " Columna: " + (columna + 1) + " ");
            x[fila][columna] = input.nextInt(); 
        }
    }
    input.close();
}
public static void display(int x []) {
    for (int i = 0; i < x.length; i++) {
        System.out.print("Suma fila: " + (i+1) + "= " + x[i]);
        System.out.println();
    }
}
}


