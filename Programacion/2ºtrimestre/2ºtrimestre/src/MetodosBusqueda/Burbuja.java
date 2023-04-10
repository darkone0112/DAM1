package MetodosBusqueda;

/**
 * Burbuja
 */
public class Burbuja {
    public static void main(String [] Args) {
        int [] vector = new int [20];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*100);
        }
        System.out.print("Sin ordenar: " + "\n");
        display(vector);
        int aux = 0;
       for (int pasadas = 1; pasadas < vector.length; pasadas++) { 
            for (int i = 0; i < vector.length-(pasadas); i++) {
                if (vector[i] > vector[i+1]) {
                    aux = vector[i];
                    vector[i] = vector[i+1];
                    vector[i+1] = aux;
                }
            }
        }
        System.out.print("Ordenado: " + "\n");
        display(vector);
    }
    public static void display(int x[]) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.print("\n");
    }
}