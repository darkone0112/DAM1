package MetodosBusqueda;
import java.util.Arrays;
import java.util.Random;
public class BusquedaBinaria {
    public static void main(String[]Args) {
        Random rand = new Random((0-100)+100);
        int vector [] = new int [100];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(100);
        }
        Arrays.sort(vector);
        int nbuscado = 15;
        boolean encontrado = false;
        int inicio,fin,centro;
        centro = 0;
        inicio = 0;
        fin = vector.length;

        while (!encontrado && fin >= inicio) {
            centro = (inicio + fin)/2;
            if (nbuscado == vector[centro]) {
                encontrado = true;
            } else {
                if (nbuscado < vector[centro]) {
                    fin = centro - 1;
                } else {
                    inicio = centro +1;
                }
            }
        }
        System.out.print("Se ha encontrado el valor " + nbuscado + " en la posicion " + centro);
    }
}
