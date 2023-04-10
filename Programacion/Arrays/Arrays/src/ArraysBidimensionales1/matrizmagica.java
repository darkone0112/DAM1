package ArraysBidimensionales1;

import java.util.Scanner;

public class matrizmagica {
    public static void main(String [] Args) {
        int matriz [][] = new int [4][4];
        int columnat [] = new int [4];
        int varcolumna = 0;
        int filat [] = new int [4];
        int varfila = 0;
        int diagonales [] = new int [2];

        assign(matriz);
        Display(matriz);
        /* total columnas */
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                columnat[fila] += matriz[fila][columna];
            }
        }
        /* total filas */
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                filat[fila] += matriz[columna][fila];
            }
        }
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (fila == columna) {
                    diagonales[0 & 1] += matriz[fila][columna]; 
                }
                if (fila + columna == matriz.length - 1) {
                   diagonales[1] += matriz[fila][columna]; 
                }
            }
        }
        System.out.println("Total Columnas");
        displayfilcol(filat);
        System.out.println();
        System.out.println("Total Filas");
        displayfilcol(columnat);
        System.out.println();
        System.out.println("Total diagonal");
        displayfilcol(diagonales);
        
        for (int i = 0; i < filat.length; i++) {
            varfila += filat[i];
            varcolumna += columnat[i];
        }
        varcolumna = varcolumna/4;
        varfila = varfila/4;
        System.out.println();
        if (varcolumna == varfila && varcolumna == diagonales[0] && varfila == diagonales[0] && varcolumna == diagonales[1] && varfila == diagonales[1]) {
            System.out.println("M" + "\t" + "A" + "\t" + "G" + "\t" + "I" + "\t" + "C" + "\t" + "O");
        } else {
            System.out.println("No es magico =(");
        }

        
    }
    public static void assign(int x [][]) {
        Scanner input = new Scanner(System.in);
        for (int fila = 0; fila < x.length; fila++) {
            for (int columna = 0; columna < x[fila].length; columna++) {
                System.out.println("Valor Fila: " + fila + "Columna: " + columna);
                x[fila][columna] = input.nextInt();
            }
        }
    }
    public static void Display(int x[][]) {
        for (int fila = 0; fila < x.length; fila++) {
            for (int columna = 0; columna < x[fila].length; columna++) {
                System.out.print(x[fila][columna] + "\t");
            }
            System.out.println();
        }
    }
    public static void displayfilcol(int x[]) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "\t");
        }
    }
}
