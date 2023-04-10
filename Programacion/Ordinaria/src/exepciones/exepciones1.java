package exepciones;

import java.util.Scanner;

public class exepciones1 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String [] args) {
        int f;
        int c;
        do {
            System.out.print("\nTamaño fila: ");
            f = getInt();
            if (f <=0 || f > 4) {
                System.out.print("\nnumero mayor q 0 e igual o menor q 4");
            }
        } while (f <=0 || f > 4);
        do {
            System.out.print("\nTamaño columna");
            c = getInt();
            if (f <=0 || f > 4) {
                System.out.print("\nnumero mayor q 0 e igual o menor q 4");
            }
        } while (c <= 0 || c > 4);
        int [][] arrayInt = new int [f][c];
        assign(arrayInt);
        System.out.print("\n___________________________\n\n");
        display(arrayInt);
        ordenarArray(arrayInt);
        System.out.print("\n___________________________\n\n");
        display(arrayInt);

    }
    public static int getInt() {
        int n = 0;
        boolean error = true;
        while (error) {
            try {
                n = input.nextInt();
                error = false;
            } catch (Exception e) {
                //TODO: handle exception
                System.out.print("\nSe debe introducir un entero\n");
            }finally{input.nextLine();}
        }
        return n;
    }
    public static void assign(int [][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print("\nFila: " + (i+1) + "|" + "columna: " + (j+1) + " ");
                x[i][j] = getInt();
            }
        }
    }
    public static void display(int [][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print( + x[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void ordenarArray(int [][] x) {
        int temp = 0;
        for (int i = 0; i < x.length; i++) {
       for (int pasadas = 1; pasadas < x.length; pasadas++) { 
            for (int j = 0; j < x.length-(pasadas); j++) {
                if (x[i][j] > x[i][j+1]) {
                    temp = x[i][j];
                    x[i][j] = x[i][j+1];
                    x[i][j+1] = temp;
                }
            }
        }
        }
    }
}
