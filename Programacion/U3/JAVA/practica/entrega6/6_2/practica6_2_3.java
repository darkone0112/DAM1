import java.util.Scanner;
public class practica6_2_3 {
    public static void main(String [] Args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca nombre");
        String nombre = input.nextLine();
        System.out.println("Introduzca primer apellido");
        String apellido1 = input.nextLine();
        System.out.println("Introduzca segundo apellido");
        String apellido2 = input.nextLine();
        String nombrefinal = nombre.concat(" " + apellido1.concat(" " + apellido2));
        System.out.println(nombrefinal);
    }
}
