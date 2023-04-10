import java.util.Scanner;

public class salariohora {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca salario por horas");
        double p = input.nextDouble();
        System.out.println("Introduzca las horas trabajadas");
        double h = input.nextDouble();
        double extra = (h - 40) * (1.5 * p);
        double salario = 0;
        if (h <= 40) {
            salario = h * p;
        } else {
            salario = (40 * p) + extra;
        }
        System.out.print("El salario que le corresponde es de " + salario + "€" );
    }
}
    
