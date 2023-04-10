import java.util.Scanner;

public class practica6_2_5 {
    public static void main(String [] Args){
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca frase");
        String frase = input.nextLine();
        System.out.println("Introduzca palabra");
        String palabra = input.nextLine();
        System.out.println(frase.lastIndexOf(palabra));
}
}
