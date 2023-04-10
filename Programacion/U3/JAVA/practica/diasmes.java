import java.util.Scanner;
public class diasmes {
    public static void main(String [] Args) {
        Scanner input = new Scanner(System.in);
        int numerodias = 0;
        int mes = 0;
        while (mes > 12 || mes < 1) {
        System.out.println("Introduzca un numero que corresponda a un mes");
        mes = input.nextInt();
            if (mes > 12 || mes < 1){
                System.out.println("Valor erroneo, introduzca nuevo valor:");
            }    
        }
        switch (mes) {
            case 1:;
            case 3:;
            case 5:;
            case 7:;
            case 8:;
            case 10:;
            case 12:;
                numerodias = 31;
                break;
            case 2: numerodias = 28;
            break;
            case 4:;
            case 6:;
            case 9:;
            case 11:numerodias = 30;
            break;
        
        }
        System.out.println("El mes " + mes + " tiene " + numerodias + " dias");
    }
}