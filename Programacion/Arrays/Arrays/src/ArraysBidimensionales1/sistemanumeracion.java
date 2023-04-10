package ArraysBidimensionales1;

import java.util.Scanner;

/**
 * sistemanumeracion
 */
public class sistemanumeracion {
    public static void main(String[]Args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca numero en decimal");
        int n = input.nextInt();
        if (n >= 10) {
            
        } else {
            int matriz [] = new int [String.valueOf(n).length()];
            for (int i = 0; i < (String.valueOf(n)).length(); i++) {
                matriz[i] = Character.getNumericValue(String.valueOf(n).charAt(i));
                System.out.print(matriz[i] + "\t");
            }
            correspondencia(matriz);
        }
        
    }
    public static void correspondencia(int x[]) {
        for (int i = 0; i < x.length; i++) {
            switch (x[i]) {
                case 0:
                    System.out.print("+");
                    break;case 1:
                    System.out.print("-");
                    break;case 2:
                    System.out.print("*");
                    break;case 3:
                    System.out.print("/");
                    break;case 4:
                    System.out.print("=");
                    break;case 5:
                    System.out.print("?");
                    break;case 6:
                    System.out.print("¢");
                    break;case 7:
                    System.out.print("!");
                    break;case 8:
                    System.out.print("¿");
                    break;case 9:
                    System.out.print("$");
                    break;case 10:
                    System.out.print("(");
                    break;case 11:
                    System.out.print("@");
                    break;case 12:
                    System.out.print("#");
                    break;
                
            }
        }    
        }
}