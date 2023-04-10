package ArraysBidimensionales1;
import java.util.Random;

public class matriztraspuesta {
    public static void main(String[]args) {
        Random rand = new Random();
        int columna = 5;
        int fila = 3;
        int tabla [][] = new int[fila][columna];
        int traspuesta [][] = new int [columna][fila];
/*         display(tabla);
        display(traspuesta); */
        for ( fila = 0; fila < tabla.length; fila++) {
            for ( columna = 0; columna < tabla[fila].length; columna++) {
                tabla[fila] [columna] = rand.nextInt((10 - 0)+1)+1;;
                for (int fila1 = 0; fila1 < traspuesta.length; fila1++) {
                    for (int columna1 = 0; columna1 < traspuesta[fila1].length; columna1++) {
                        traspuesta [fila1] [columna1] = tabla[0][0];

                    }
                }
                System.out.print(tabla[fila][columna] + "\t");
            }
            System.out.println();
            
    }
    for ( fila = 0; fila < traspuesta.length; fila++) {
        for ( columna = 0; columna < traspuesta[fila].length; columna++) {
            /* traspuesta[fila] [columna] = rand.nextInt((10 - 0)+1)+1;; */
            System.out.print(traspuesta[fila][columna] + "\t");
        }
        System.out.println();
}
    }
/*     public static void display(int x[][]) {
        Random rand = new Random();
        int fila;
        int columna;
        for ( fila = 0; fila < x.length; fila++) {
            for ( columna = 0; columna < x[fila].length; columna++) {
                x[fila] [columna] = rand.nextInt((10 - 0)+1)+1;;
                System.out.print(x[fila][columna] + "\t");
            }
            System.out.println();
    } */

}



