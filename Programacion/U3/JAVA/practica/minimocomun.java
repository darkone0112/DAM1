import java.util.Scanner;
public class minimocomun {
    public static void main(String [] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca n: ");
        int n = input.nextInt();
        System.out.print("Introduzca m: ");
        int m = input.nextInt();
        int n1 = n;
        int m1 = m;
        if (n < m) {
            int a = n;
            n = m1;
            m = n1;
        }
        int r = n % m;
        if (r == 0) {
            System.out.println("El maximo comun divisor es " + m);
        } else {
            while (r != 0) {
                n = m;
                m = r;
                r = n % m;
            }
                System.out.println("El maximo comun divisor de "+ n1 + " y " + m1 + " es " + m);
            }
        }
    }
