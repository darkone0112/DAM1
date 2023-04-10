import java.util.Scanner;

public class practica6_1_5 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int posicion = 0;
        System.out.print("Introduzca palabra: ");
        String palabra = input.nextLine();
        int i = palabra.length() - 1;
        System.out.print(palabra.charAt(posicion) + "-");
        while (i >= 0 && posicion <= i) {
                posicion = posicion + 1;
                System.out.print(palabra.charAt(posicion) + "-");
            i = i - 1;
        }
        posicion = posicion + 1;
        System.out.print(palabra.charAt(posicion));
    }
}
