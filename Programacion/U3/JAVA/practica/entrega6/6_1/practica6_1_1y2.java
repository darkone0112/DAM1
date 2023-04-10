import java.util.Scanner;
public class practica6_1_1y2 {
    public static void main(String [] Args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Introduzca el nombre de alumno 1: ");
            String nombre1 = input.nextLine();
            System.out.print("Introduzca el nombre de alumno 2: ");
            String nombre2 = input.nextLine();
            if (nombre1.length() > nombre2.length()) {
                System.out.print("El nombre mas largo es: " + nombre1 + " y el mas corto es: " + nombre2);
            } else {
                System.out.println("El nombre mas largo es: " + nombre2 + " y el mas corto es: " + nombre1);
            }
            
        //Pasar todo el nombre a mayusculas sin importar como este escrito//
        System.out.println("Los nombres pasados a mayusculas serian:");
        System.out.println(nombre1.toUpperCase());
        System.out.println(nombre2.toUpperCase());
    }

}
