package ArraysBidimensionales1;

import java.util.Scanner;

public class matrizpotencia {
    public static void main(String[]Args) {
        int matriz [][] = new int [20][2];
        int potenciacion [] = new int [20];
        assign(matriz);
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (columna > 0) {
                    potenciacion[fila] = matriz[fila][columna] * matriz[fila][columna];
                }
            }
        }
        display(potenciacion);
    }
    public static void display(int x []) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(2^x [i]);
        }
    }
    public static void assign(int x [] []) {
        int exponente = 0;
        Scanner input = new Scanner(System.in);
        for (int fila = 0; fila < x.length; fila++) {
            for (int columna = 0; columna < x[fila].length; columna++) {
                if (columna == 0) {
                    do {  
                        System.out.print("Exponente(1/Positivo o 2/Negativo): ");
                        exponente = input.nextInt();
                        if (exponente != 1 && exponente != 2) {
                            System.out.println("Debe introducir el exponente (- O +)");
                        }
                    } while (exponente != 1 && exponente != 2);
                    switch (exponente) {
                        case 1:
                            x[fila][columna] = -1;
                            break;
                    
                        case 2:
                            x[fila][columna] = 1;
                            break;

                    }
                }else{
                    System.out.print("Introduzca valor del exponente");
                    x[fila][columna] = input.nextInt();
                }
            }
        }
        input.close();
    }
}
