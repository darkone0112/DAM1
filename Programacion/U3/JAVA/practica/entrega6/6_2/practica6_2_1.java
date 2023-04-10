import java.util.Scanner;
public class practica6_2_1 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int paso = 0;
        while (paso == 0) {
            System.out.print("Introduzca palabra:");
            String palabra = input.nextLine();
            System.out.println("Introduzca silaba:");
            String silaba = input.nextLine();
            System.out.print("La silaba introducida se encuentra en la palabra en la posicion: ");
            System.out.println(palabra.indexOf(silaba));
            System.out.println("Desea realizar otra operacion?");
            do {
                System.out.println("0-Si / 1-No");
                paso = input.nextInt(); 
                input.nextLine();
                System.out.print("\033[H\033[2J");
                System.out.flush();
            } while (paso > 1 ||paso < 0); 
        }
    }
}
