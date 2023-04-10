import java.util.Scanner;
public class proge {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de numeros a mostrar");
        int n = input.nextInt();
        System.out.println("Introduzca el primer termino");
        int termino = input.nextInt();
        System.out.println("Introduzca la razon");
        int razon = input.nextInt();
        int acumulador = termino;
        while (n > 1) {
            termino = termino * razon;
            acumulador = acumulador + termino;
            n = n - 1;
            /* System.out.println(termino); */
            /* System.out.println(acumulador); */
    }
    System.out.println("El resultado de la suma de los valores de la razon geometrica es "+ acumulador);
}
}
