import java.util.Scanner;

public class fechavalidaok {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int d, m, a, dmax;
        do {
            System.out.print("escribe un dia: ");
            d = input.nextInt();
        } while (d > 31 || d < 0);
        do {
            System.out.print("escibe un mes: ");
            m = input.nextInt();
        } while (m > 12 || m < 0);
        do {
            System.out.print("escibe un año: ");
            a = input.nextInt();
        } while (a < 0);
        switch (m) {
            case 2:
                if (bisiesto(a)) {
                    dmax = 29;
                }else{
                    dmax = 28;
                }
                break;
                case 4:
                case 6:  
                case 9:
                case 11:
                dmax = 30;            
            default:
            dmax = 31;
                break;
        }
        if (d > dmax) {
            System.out.print("La fecha no es correcta");
        }else{
            if (d==dmax){
                if (m == 12) {
                    d = 1;
                    m=1;
                    a++;
                    System.out.println("La fecha siguiente es: " + d  + "/" + m + "/" + a);
                }else{
                    d=1;
                    m++;
                    System.out.println("La fecha siguiente es: " + d  + "/" + m + "/" + a);
                }
                
            }else{
                d++;
                System.out.println("La fecha siguiente es: " + d  + "/" + m + "/" + a);

            }
        }
    }
    public static boolean bisiesto (int a){
        boolean bisiesto = false;
        if ((a%4==0 && a%100!=0) || a%400==0) {
            bisiesto=true;
        }
        return bisiesto;
    }
}
