import java.util.Scanner;

public class temperaturas {
    public static void main(String [] Args) {
        Scanner input = new Scanner(System.in);
        int pos = 0;
        int menu = 0;
        int totald = 0;
        int totaln = 0;
        int media = 0;
        System.out.println("Especifique las temperaturas");
        String [] dia = new String [7];
        dia[0]="lunes";
        dia[1]="martes";
        dia[2]="miercoles";
        dia[3]="jueves";
        dia[4]="viernes";
        dia[5]="Sabado";
        dia[6]="Domingo";
        int [] diurna = new int [7];
        int [] nocturna = new int [7];
        for (int i = 0; i < dia.length; i++) {
            System.out.print("Temperatura diura del "+dia[i] + ": ");
            diurna[pos] = input.nextInt();
            System.out.print("Temperatura nocturna: "+dia[i] + ": ");
            nocturna[pos] = input.nextInt();
            pos++;
            /* System.out.println("Diurna = " + diurna[i] + " Nocturna = " + nocturna[i]); */
        }
        System.out.println("1-Resumen de Temperaturas");
        System.out.println("2-Media de temperaturas diurnas");
        System.out.println("3-Media de temperaturas nocturnas");
        System.out.println("4-Media de temperaturas totales");
        System.out.println("5-Temperatura minima");
        System.out.println("6-Temperatura maxima");
        menu = input.nextInt();
        switch (menu) {
            case 1:
            for (int i = 0; i < dia.length; i++) {
                System.out.println(dia[i] + " Temp diurna: " + diurna[i] 
                + " ºc " + " Temp nocturna " + nocturna[i] + " ºc");
            }
                break;
            case 2:
            for (int i = 0; i < diurna.length; i++) {
                totald = totald + diurna[i];
            }
            media = totald / diurna.length;
            System.out.println(media);
            break;
            case 3:
            for (int i = 0; i < nocturna.length; i++) {
                totald = totald + nocturna[i];
            }
            media = totald / nocturna.length;
            System.out.println(media);
            break;
            case 4:
            for (int i = 0; i < diurna.length; i++) {
                totald = totald + diurna[i] + nocturna[i];
            }
            media = totald / diurna.length;
            System.out.println(media);
            break;
            default:
                break;
        }
        input.close();
    }
}
