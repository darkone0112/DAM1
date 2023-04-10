import java.util.Scanner;
public class practica6_1_3{
    public static void main(String [] Args) {
        Scanner input = new Scanner(System.in);
        int paso = 0;
        int contador = 0;
        String anterior = "";
        while (paso == 0) {
            System.out.print("Introduzca palabra: ");
            String palabra = input.nextLine();
            if (anterior.isEmpty()) {
                anterior.equals(palabra);
            }
            if (anterior.equals(palabra)) {
                paso = 1;
                System.out.print("La palabra original es: " + palabra + "y el programa leyó un total de: " + contador + "veces" );
            } else {
                contador++;
            }
            
            input.close();
        }
    }
}
