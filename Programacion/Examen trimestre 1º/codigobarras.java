import java.util.Scanner;
public class codigobarras {
    public static void main(String [] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca numeros");
        String num = input.nextLine();
        int largo = num.length();
        int contador = 0;
                if (largo <=8) {
            System.out.println("EAN-8");
            if (largo < 8) {
                contador = 8 - largo;
                while (contador > 0) {
                    num = 0 + num;
                    contador--;
                }    
            }
        } else {
            System.out.println("EAN-13");
            if (largo <= 13 && largo > 8) {
                if (largo < 13) {
                    contador = 13 - largo;
                    while (contador > 0) {
                        num = 0 + num;
                        contador--;
                    }    
            }
        }
    }
    largo--;
    int numf = 0;
    int posicion = 0;
    /* System.out.println(largo); */
    while (largo > posicion) {
    int valor = (Character.getNumericValue(num.charAt(posicion)));
        if ((posicion + 1)%2==0) {
            numf = numf + valor;
        }else{
            numf = numf + (valor*3);
        }
    posicion++;;
    }
    /* System.out.println(numf); */
    if ((Character.getNumericValue(num.charAt(posicion))+ numf)%10==0) {
        System.out.println("SI");
    } else {
        System.out.println("NO");
    }
}
}