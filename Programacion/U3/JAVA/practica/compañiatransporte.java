import java.lang.reflect.Method;
import java.util.Scanner;

public class compañiatransporte {
    public static void main(String [] Args) {
        int zona = 0;
        int peso = 0;
        int multiplicador = 0;
        int precio = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca el peso del paquete en gramos");
        peso = input.nextInt();
        if (peso > 5000) {
            System.out.println("Por razones de logistica es imposible llevar a cabo el envio");
        }else{
            System.out.println("Introduzca su zona de envio");
            System.out.println("Zona 1: America del Norte");
            System.out.println("Zona 2: America Central");
            System.out.println("Zona 3: America del Sur");
            System.out.println("Zona 4: Europa");
            System.out.println("Zona 5: Asia");
            zona = input.nextInt();
            switch (zona) {
                case 1:
                    multiplicador = 24;
                    precio = peso * multiplicador;
                    break;
                    case 2:
                    multiplicador = 20;
                    precio = peso * multiplicador;
                    break;
                    case 3:
                    multiplicador = 21;
                    precio = peso * multiplicador;
                    break;
                    case 4:
                    multiplicador = 10;
                    precio = peso * multiplicador;
                    break;
                    case 5:
                    multiplicador = 18;
                    precio = peso * multiplicador;
                    break;
            }
            System.out.println("El precio total de su envio es de " + precio );
        }
        input.close();
    }
}
