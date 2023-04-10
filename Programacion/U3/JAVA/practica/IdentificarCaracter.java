import java.util.Scanner;

import javax.lang.model.type.NullType;

public class IdentificarCaracter {
    /**
     *
     */
    private static final String INTROUDUZCA_CARACTER = "Introuduzca Caracter:";

    public static void main(String[]args) {
    System.out.println(INTROUDUZCA_CARACTER);
    Scanner Teclado = new Scanner(System.in);
        char caracter = Teclado.nextLine().charAt(0);
    if(Character.isLetter(caracter)){ 
        if(Character.isUpperCase(caracter)){
            System.out.println("El caracter esta en mayusculas");
        }else{
            System.out.println("El caracter esta en minusculas");
        }
    }else{
        if(Character.isDigit(caracter)){
            System.out.println("El caracter es un numero");
        }else{
            System.out.println("Es un caracter extraño");
        }
        
    }


}
}