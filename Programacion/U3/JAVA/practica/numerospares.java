import java.security.PublicKey;
import java.util.Scanner;
public class numerospares {
 public static void main(String [] Args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Introduzca un numero entero mayor que 1");
     int n = input.nextInt();
     int n1 = n - 1;
    while (n <= 1) {
        System.out.println("El numero debe ser mayor que 1!!");
        n = input.nextInt();
    }
    System.out.println("Los numeros pares desde 1 hasta " + n + " Son:");
     while (n1 > 1) {
         if (n1 % 2 == 0) {
             System.out.println(n1);
             n1 = n1 - 1;
         }else{
             n1 = n1 - 1;
         }
     }
 }
}