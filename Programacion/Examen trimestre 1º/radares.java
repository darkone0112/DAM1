import java.util.Scanner;
/**
 * radares
 */
public class radares {
    public static void main(String [] Args) {
        Scanner input = new Scanner(System.in);
        int distancia = 1;
        int vmax = 1;
        int tiempo = 1;
        try {
        System.out.print("Introduzca distancia: ");
        distancia = input.nextInt();
        System.out.print("Introduzca velocidad maxima permitida: ");
        vmax = input.nextInt();
        double porcentaje = vmax * 0.20;
        System.out.print("Tiempo para recorrer la distancia entre camaras: ");
        tiempo = input.nextInt();  
        int vmedia = distancia / tiempo;
        if (tiempo < 0 || vmax < 0 || distancia <0) {
            System.out.print("ERROR");
        }else{
            if (vmedia > vmax) {
                if ((vmedia) > (vmax + porcentaje)) {
                    System.out.println("Puntos");
                } else {
                    System.out.println("Multa");
                }
            } else {
                System.out.println("OK");
            }
        }
    } catch (Exception e) {
        System.out.print("Fin del Programas");
    }
    }
}