import java.util.Scanner;
public class factorial {
    public static void main(String [] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca numero: ");
        int n = input.nextInt();
        int i = (n-1);
        int factorial = n;
        do {
            factorial = factorial * i;
            i--;
        } while (i > 0);
        int primero=(String.valueOf(Math.abs((long)factorial)).charAt(0));
        System.out.print("El primer valor del factorial es: " + Character.getNumericValue(primero));
    }
}
