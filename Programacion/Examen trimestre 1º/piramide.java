import java.util.Scanner;
public class piramide {
     public static void main(String [] Args) {
         Scanner input = new Scanner(System.in);
         int num;
         do {
             num = input.nextInt();
         } while (num<=0 || num > 20);
         /* Primer for numeros originales a la izquierda */
         for (int i = 1; i <= num; i++) {
             for (int j = 1; j <= i; j++) {
                if (j>9) {
                    System.out.printf("%d ", j);
                } else {
                    System.out.printf("%d  ", j);
                }
             }
        /* Segundos for los espacios en que son la misma cantidad en cada lado del reflejo */
             for (int j = i; j < num; j++) {
                 System.out.print("   ");
             }
             for (int j = i; j < num; j++) {
                System.out.print("   ");
            }
        /* Piramide de la derecha los if es para que si el numero es menor q 9 deje un espacio a la derecha y si no no lo haga por q el espacio lo va a usar el segundo digito */
            for (int j = i; j > 0; j--) {
                if (j == 1) {
                    System.out.printf("%d\n", j);
                } else {
                    if (j>9) {
                        System.out.printf("%d ", j);
                    } else {
                        System.out.printf("%d  ", j);
                    }
                }
            }
         }
     }
}
