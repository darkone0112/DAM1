public class arraybidimensional {
        public static void main(String args[]) {
            int [][] array1 = {{1,2,3,4,5},{1,2,3,4},{1,2,3}};
            int [][] array2 = {{5,4,3,2,1},{4,3,2,1},{3,2,1}};
            System.out.println("Primer Array");
            display(array1);
            System.out.println("Segundo Array");
            display(array2);
        }
        public static void display( int x[][] ) {
            for (int fila = 0; fila < x.length; fila++) {
                for (int columna = 0; columna < x[fila].length; columna++) {
                    System.out.print(x[fila][columna] + "\t");
                }
                System.out.println();
            }
        }
}
