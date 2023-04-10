package ArraysBidimensionales1;
public class filasparesinpares {
    public static void main(String [] Args) {
        int tabla [][] = new int [10][10];
        display(tabla);
    }
    public static void display(int x[][]) {
        for (int fila = 0; fila < x.length; fila++) {
            for (int columna = 0; columna < x[fila].length; columna++) {
                if (fila == 0) {
                    System.out.print("NULL" + "\t");
                } else {
                    if (fila % 2 == 0 && fila != 0) {
                        System.out.print(1 + "\t");
                    } else {
                        System.out.print(0 + "\t");
                    }
                }
            }
            System.out.println();
        }
    }
}
