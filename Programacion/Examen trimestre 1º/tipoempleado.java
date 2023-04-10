import java.util.Scanner;
/**
 * tipoempleado
 */
import java.util.Scanner;
public class tipoempleado {
public static void main(String [] Args) {
    String paso = "";
    int nempleados = 0;
    double totalsalario = 0;
    double totaltramitado = 0;
    do {
        Scanner input = new Scanner(System.in);
        double salariobase;
        double incremento = 0;
        double salarioincrementado;
        do {
            System.out.print("Introduzca salario base: ");
            salariobase = input.nextDouble();    
        } while (salariobase <=  0);
        double extra;
        do {
            System.out.print("Introduzca extra: ");
            extra = input.nextDouble();
        } while (extra <= 0);
        double salariof = salariobase + extra;
        int tipo;
        do {
            System.out.print("Introduzca tipo de empleado: ");
            tipo = input.nextInt();
            if (tipo < 0 || tipo > 3) {
                System.out.print("*Error* Debe introducir un tipo de empleado valido");
            }
        
        } while (tipo < 0 || tipo > 3);
        switch (tipo) {
            case 1:
                if (salariobase < 3000) {
                   incremento = (salariobase * 0.02);
                }
                break;
            case 2:
                if (salariof < 2000) {
                    incremento = (extra * 0.05);
                }
            break;
            case 3:
                if (salariobase < 1500) {
                    incremento = (salariobase * 0.07);
                }else{
                    incremento = (salariobase * 0.05);
                }
            break;
        }
        System.out.println("El salario total es de: " + salariof + incremento + "€");
        nempleados = nempleados + 1;
        totalsalario = salariof + incremento;
        totaltramitado = totaltramitado + totalsalario;
        System.out.println("Desea realizar otra operacion (S/N): ");
        paso = input.next();
        System.out.print("\033[H\033[2J");
        System.out.flush();
    } while (paso.equalsIgnoreCase("S"));
    System.out.println("El numero total de empleados tramitados es de: " + nempleados);
    System.out.println("La cantidad total tramitada como salario es de: " + totaltramitado + "€");
}
}
/* ????¿¿¿¿ Como saber cuanto ha sido el salario de cada empleado al final del programa ???¿¿¿¿ */