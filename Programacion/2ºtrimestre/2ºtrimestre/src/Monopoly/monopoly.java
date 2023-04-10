package Monopoly;

import java.util.Random;

public class monopoly {
    public int dados() {
        Random rand = new Random();
        int dado1 = rand.nextInt((6-1)+1);
        int dado2 = rand.nextInt((6-1)+1);
        int avance = dado1 + dado2;
        System.out.print("Haz sacado" + avance);
        return avance;
    }
/*     public static int movimiento() {
        System.out.print("Te mueves hasta " + tablero );
    } */
    public void turno() {
        
    }
    public void tablero() {
        String casillas [] = new String [40];
        casillas [0] = "inicio";
        casillas [1] = "1";
        casillas [2] = "2";
        casillas [3] = "3";
        casillas [4] = "4";
        casillas [5] = "5";
        casillas [6] = "6";
        casillas [7] = "7";
        casillas [8] = "8";
        casillas [9] = "9";
        casillas [10] = "10";
        casillas [11] = "11";
        casillas [12] = "12";
        casillas [13] = "inicio";
        casillas [14] = "inicio";
        casillas [15] = "inicio";
        casillas [16] = "inicio";
        casillas [17] = "inicio";
        casillas [18] = "inicio";
        casillas [19] = "inicio";
        casillas [20] = "inicio";
        casillas [21] = "inicio";
        casillas [22] = "inicio";
        casillas [23] = "inicio";
        casillas [24] = "inicio";
        casillas [25] = "inicio";
        casillas [26] = "inicio";
        casillas [27] = "inicio";
        casillas [28] = "inicio";
        casillas [29] = "inicio";
        casillas [30] = "inicio";
        casillas [31] = "inicio";
        casillas [32] = "inicio";
        casillas [33] = "inicio";
        casillas [34] = "inicio";
        casillas [35] = "inicio";
        casillas [36] = "inicio";
        casillas [37] = "inicio";
        casillas [38] = "inicio";
        casillas [39] = "inicio";
    }
}
