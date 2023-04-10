package ArraysBidimensionales1;

public class diagonalmatriz {
    public static void main(String [] Args) {
        int diagonal [][] = new int [5][5];
        display(diagonal);
    }
    public static void display(int x[][]) {
        for (int fila = 0; fila < x.length; fila++) {
            for (int columna = 0; columna < x[fila].length; columna++) {
                if (fila == columna) {
                    System.out.print(0 + "\t");
                } else {
                    System.out.print(1 + "\t");
                }
            }
            System.out.println();
        }
    }
}
