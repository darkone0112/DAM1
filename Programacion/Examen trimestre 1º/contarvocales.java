import java.util.Scanner;

public class contarvocales {
    public static void main(String [] Args) {
        Scanner input = new Scanner(System.in);
        int vocales = 0;
        int nfrase = 0;
        String frase = " ";
        while (frase != "") {
            System.out.print("Introduzca frase: ");
            frase = input.nextLine();
            int contador = 0;
            while (contador < frase.length()) {
                char letra = frase.charAt(contador);
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    vocales++;
                }
            contador++;
            }
        contador = 0;
        nfrase++;
        }
        nfrase--;
        System.out.print("Se han introducido un total de " + nfrase + " frases y " + vocales + " vocales");
    }
}
