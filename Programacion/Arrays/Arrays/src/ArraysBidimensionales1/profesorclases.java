package ArraysBidimensionales1;

import java.util.Scanner;

public class profesorclases {
    public static void main(String [] Args) {
    String alumno [] = {"al1","al2","al3","al4","al5"};
    int nota [][] = new int [3][5];
    assign(nota);
    System.out.println("Profesor numero 1");
    System.out.println("________________________________________________________________________");
    System.out.print("\t");
    for (int fila = 0; fila < alumno.length; fila++) {
        System.out.print(alumno[fila] + "\t");
    }
    System.out.println();
    display(nota);
    int notamax = nota [0][0];
    int notamin = nota[0][0];
    for (int fila = 0; fila < nota.length; fila++) {
        for (int columna= 1; columna < nota[fila].length; columna++) {
            if (nota[fila][columna] > notamax) {
                notamax = nota[fila][columna];
            }
        }
    }    for (int fila = 0; fila < nota.length; fila++) {
        for (int columna= 1; columna < nota[fila].length; columna++) {
            if (nota[fila][columna] <  notamin) {
                notamin = nota[fila][columna];
            }
        }
    }
    System.out.println("nota maxima= " + notamax);
    System.out.println("La nota maxima es de: ");
    String asignatura [] = {"SISIF", "PROG", "BD"};
    for (int fila = 0; fila < nota.length; fila++) {
        for (int columna = 0; columna < nota[fila].length; columna++) {
            if (nota[fila][columna] == notamax) {
                System.out.println(alumno[columna] + "en: " + asignatura[fila]);
            }
        }
    }
    System.out.println("nota minima= " + notamin);
    
    }
    public static void assign(int x [][]) {
        String asignatura [] = {"SISIF", "PROG", "BD"};
        String alumno [] = {"al1","al2","al3","al4","al5"};
        Scanner input = new Scanner(System.in);
        for (int fila = 0; fila < x.length; fila++) {
            for (int columna = 0; columna < x[fila].length; columna++) {
                System.out.print("Nota " + alumno[columna] + " en: " + asignatura[fila] + ": ");
                x[fila][columna] = input.nextInt();
            }
        }
        input.close();
    }
    public static void display(int x[][]) {
        String asignatura [] = {"SISIF", "PROG", "BD"};
        for (int fila = 0; fila < x.length; fila++) {
            System.out.print(asignatura[fila] + "\t");
            for (int columna = 0; columna < x[fila].length; columna++) {
                System.out.print(x[fila][columna] + "\t");
            }
            System.out.println();
        }
    }

}
