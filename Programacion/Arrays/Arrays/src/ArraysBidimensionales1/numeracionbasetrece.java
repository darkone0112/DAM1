package ArraysBidimensionales1;

import java.util.Scanner;

public class numeracionbasetrece {
    public static void main(String[]Args) {
        String matriz [] = {"+","-","*","/","=","?","¢","!","¿","$","(","@","#"};
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca un numero decimal: ");
        int n = input.nextInt();
        int matrizz [] = new int [String.valueOf(n).length()];
            for (int i = 0; i < (String.valueOf(n)).length(); i++) {
                matrizz[i] = Character.getNumericValue(String.valueOf(n).charAt(i));
                System.out.print(matrizz[i] + "\t");
            }
            String matrizfinal [] = new String [matrizz.length];
        for (int i = 0; i < matrizz.length; i++) {
            if (i > 0 && matrizz[i-1] == 1) {
                switch (matrizz[i]) {
                    case 0:
                        System.out.print(matriz[10]);
                        break;
                        case 1:
                        System.out.print(matriz[11]);
                        break;
                        case 2:
                        System.out.print(matriz[12]);
                        break;
                }
            }
            

    }
    }
}
