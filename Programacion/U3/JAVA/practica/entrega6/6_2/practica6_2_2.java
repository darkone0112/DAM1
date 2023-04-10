import java.util.Scanner;
public class practica6_2_2 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca la frase:");
        String frase = input.nextLine();
        frase = frase.replaceAll("a", "A");
        frase = frase.replaceAll("e", "E");
        frase = frase.replaceAll("i", "I");
        frase = frase.replaceAll("o", "O");
        frase = frase.replaceAll("u", "U");
        System.out.println(frase);
    }
}
