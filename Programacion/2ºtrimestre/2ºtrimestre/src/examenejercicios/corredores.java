package examenejercicios;

public class corredores {
    public static void main(String[]Args) {
        String table [][] = new String [6][5];
         table[0][0]="Nombre";
         table[0][1]="C1";
         table[0][2]="C2";
         table[0][3]="C3";
         table[0][4]="C4";
         table[1][0]="Nombre1";
         table[1][1]="9";
         table[1][2]="10";
         table[1][3]="8";
         table[1][4]="10";
         table[2][0]="Nombre2";
         table[2][1]="9";
         table[2][2]="10";
         table[2][3]="8";
         table[2][4]="18";
         table[3][0]="Nombre3";
         table[3][1]="9";
         table[3][2]="10";
         table[3][3]="8";
         table[3][4]="11";
         table[4][0]="Nombre4";
         table[4][1]="9";
         table[4][2]="10";
         table[4][3]="8";
         table[4][4]="18";
         table[5][0]="Nombre5";
         table[5][1]="9";
         table[5][2]="10";
         table[5][3]="8";
         table[5][4]="8";
         System.out.print("Tabla de corredores" + "\n");
         display(table);
         System.out.println();
         System.out.print("Diferencia entre primera marca y ultima " + "\n");
         int diferencia [] = new int [5];
         for (int i = 0; i < diferencia.length; i++) {
             diferencia[i] = Integer.valueOf(table[i+1][4]) - Integer.valueOf(table[i+1][1]); 
         }
         for (int i = 0; i < diferencia.length; i++) {
             System.out.print("Corredor" + (i+1) + "\n");
             System.out.print("Diferencia = " + Math.abs(diferencia[i]) + "segundos" + "\n");
             System.out.print("________________________________" + "\n" );
         }

    }
    public static void display(String x [][]) {
        for (int fila = 0; fila < x.length; fila++) {
            for (int columna = 0; columna < x[fila].length; columna++) {
                System.out.print( "\t" + x[fila][columna] + "\t");
            }
            System.out.println();
        }
    }
    public static void dif(int x []) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "\t");
        }
    }
}
