import java.util.Scanner;

public class practica6_2_4 {
    public static void main(String [] Args){
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca palabra");
        String palabra = input.nextLine();
        if (palabra.endsWith("ar") || palabra.endsWith("er") || palabra.endsWith("ir")) {
            System.out.println("Es infinitivo");
        } else {
            System.out.println("No es infinitivo");
        }
    }
}
