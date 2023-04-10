package RAM;

import java.util.Random;
import java.util.Scanner;

public class accesoAleatorio {
    public static int numeros[] = new int[49];
    public static Scanner input = new Scanner(System.in);
    public static int n = 0;
    public static Random rand = new Random();
    public static int num = 0;
    public static void main(String[]Args) {
        
        while (n<200) {
            num = rand.nextInt(49)-1;
            numeros[num-1] += 1; 
            n++;
        }
        
        display(numeros);
        System.out.print("\n"+n+"\n");
    }
    public static void display(int x[]) {
        for (int i = 0; i < x.length; i++) {
            System.out.print("\n" + numeros[i]);
        }
        System.out.println();
    }
}
