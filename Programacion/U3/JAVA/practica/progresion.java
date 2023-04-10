import java.util.Scanner;
public class progresion {
    public static void main(String [] Args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de numeros a mostrar");
        int n = input.nextInt();
        System.out.println("Introduzca el primer termino");
        int termino = input.nextInt();
        System.out.println("Introduzca la razon");
        int razon = input.nextInt();
        int acumulador = 0;
        while (n >= 1) {
            termino = termino * razon;
            acumulador = acumulador + termino;
            n = n - 1;
            System.out.println(termino);
            System.out.println(acumulador);

        }
    }
}
