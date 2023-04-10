import java.util.Scanner;

/**
 * doblepiramideint
 */
import java.util.Scanner;
public class doblepiramideint {
    public static void main(String [] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca valor: ");
        int n = input.nextInt();
        int i = 1;
        int contador = 1;
        int contadorver = 1;
        int blanco = 0;
        int iespejo = 0;
        while (contadorver <= n) {
            i = 1;
            
            int contespejo = contador;
            while (contador > 0 && contador <= n) {
                blanco = 2 * (n - i);
                System.out.print(i + " " );
                i = i + 1;
                contador = contador - 1;
                iespejo = i - 1;
                
        }
        while (blanco > 0 ) {
                System.out.print(" " + " ");
                blanco = blanco - 1;
        }
        while (contespejo > 0 && contespejo <= n) {
            System.out.print(" " + iespejo);
            iespejo = iespejo - 1;
            contespejo = contespejo - 1;
        }
            System.out.println();
            contador = i;
            contadorver = contadorver + 1;
        }
        

    }
    

}