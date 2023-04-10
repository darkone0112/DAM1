package MetodosBusqueda;

/**
 * BusquedaLineal
 */
public class BusquedaLineal {
    public static void main(String[]Args) {
        int array [] = {3,8,15,6,4,6,55,1};
        int posicion = 0;
        int nbuscado = 15;
        boolean encontrados = false;
        while (!encontrados && posicion < array.length) {
            if (array[posicion] == nbuscado) {
                encontrados = true;
            } else {
                posicion++;
            }
        }
            if (encontrados = true) {
                System.out.printf("El valor " + nbuscado+  " se ha encontrado en la posicion de vector " + (posicion+1)  + "\n");
            }else{
                System.out.print("El valor no se ha encontrado");
            }
    }
}