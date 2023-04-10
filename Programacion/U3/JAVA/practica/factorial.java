import java.util.Scanner;

public class factorial {
    public static void main(String [] Args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Introduzca un numero");
        int n = input.nextInt();
        int n1 = n;
        int factorial = 1;
       n = n - 1;
       factorial = n * n1;
       if (n1 == 0) {
        System.out.println("El factorial de 0 es: 1");
       } else {
        while (n > 1) {
            n = n - 1;
            factorial = factorial * n;
        }
        System.out.println("El factorial de " + n1 + " es: " + factorial);
       }
    }
}