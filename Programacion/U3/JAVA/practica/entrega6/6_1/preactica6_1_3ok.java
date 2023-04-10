import java.util.Scanner; 
public class preactica6_1_3ok {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int paso = 0;
        int contador = 0;
        System.out.print("Introduzca palabra original: ");
        String anterior = input.nextLine();
        while (paso == 0) {
            System.out.print("Introduzca palabra: ");
            String palabra = input.nextLine();
            if (palabra.equals(anterior)) {
                paso = 1;
                System.out.print("La palabra original es: " + palabra + " y el programa leyó un total de: " + contador + " veces palabras diferentes" );
            } else {
                contador = contador + 1;
            }
        }
    }
}
