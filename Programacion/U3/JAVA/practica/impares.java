import java.util.Scanner;

public class impares {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de numeros impares que desea imprimir");
        int n = input.nextInt();
        int imp = 1;
        int suma = 0;
        System.out.println("La suma de los  " + n + " numeros impares es:");
        while (n != 0) {
            if (imp % 2 != 0 ){
                /* System.out.println(imp); */
                n = n - 1;
                suma = suma + imp;
                imp = imp + 1;
                
                
            }else{
                imp = imp + 1;
            }
        }
        System.out.println(suma);
    }
}
