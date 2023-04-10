package ArraysBidimensionales1;

import java.util.Scanner;
/**
 * viajesautobus
 */
public class viajesautobus {
    public static void main(String[]Args) {
        Scanner input = new Scanner(System.in);
        String dia[][] = new String [7][1];
        dia[0][0]="lunes";dia[1][0]="martes";dia[2][0]="miercoles";dia[3][0]="jueves";dia[4][0]="viernes";dia[5][0]="sabado";dia[6][0]="domingo";
        int [][] viajes = new int [7][];
        viajes[0] = new int [10];
        viajes[1] = new int [10];
        viajes[2] = new int [10];
        viajes[3] = new int [10];
        viajes[4] = new int [10];
        viajes[5] = new int [2];
        viajes[6] = new int [2];
        for (int fila = 0; fila < viajes.length; fila++) {
            for (int columna = 0; columna < viajes[fila].length; columna++) {
                System.out.print("Introduzca numero de viajeros viaje numero " + (columna+1) + " del " + dia[fila][0] + ": ");
                viajes [fila][columna] = input.nextInt();
            }
        }
        System.out.println();
        for (int fila = 0; fila < viajes.length; fila++) {
            System.out.print(dia[fila][0]+" ");
            for (int columna = 0; columna < viajes[fila].length; columna++) {
                System.out.print((columna +1) + "º " +viajes[fila][columna]+" pers|");
            }
            System.out.println();
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println();
        }
        input.close();

        
    }

}