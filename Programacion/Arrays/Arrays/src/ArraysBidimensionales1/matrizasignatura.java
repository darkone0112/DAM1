package ArraysBidimensionales1;

import java.util.Scanner;

public class matrizasignatura {
    public static void main(String [] Args) {
        Scanner input = new Scanner(System.in);
        String asignatura[] = {"PROG", "SISIF", "BD"};
        String estudiantes[] = {"est1","est2","est3","est4","est5","est6","est7","est8","est9","est10","est11","est12","est13","est14","est15"};
        int notas [][] = new int [3][15];
        for (int fila = 0; fila < notas.length; fila++) {
            for (int columna = 0; columna < notas[fila].length; columna++) {
                System.out.print("Introduzca nota estudiante: " + estudiantes[columna] + " de la asignatura: " + asignatura[fila] + ": ");
                notas[fila][columna] = input.nextInt();
            }
        }
        for (int fila = 0; fila < notas.length; fila++) {
            System.out.print("\t");
            for (int columna = 0; columna < notas[fila].length; columna++) {
                System.out.print(estudiantes[columna] + "\t");
            }
            System.out.println();
            System.out.print(asignatura[fila] + "\t");
            
            for (int columna = 0; columna < notas[fila].length; columna++) {
                System.out.print(notas[fila][columna] + "\t");
            }
            System.out.println();
        }
        input.close();
    }
}
