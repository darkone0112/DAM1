package VectorEstadistica;

import java.util.Scanner;

public class controladora {
    public static void main(String[]args) {
        String salir = "";
        do {
            VectorEstadistica mivector = new VectorEstadistica();
            int mivectorr[] = new int[40];
            int cursor = 0;
            Scanner input = new Scanner(System.in);
            do {
                System.out.print("1/Completar aleatoriamente el vector" + "\n" + "2/Completar manualmente el vector" + "\n");
                cursor = input.nextInt();    
            } while (cursor != 1 && cursor != 2);
            switch (cursor) {
                case 1:
                mivector.cargar(mivectorr);
                    break;
                    case 2:
                    mivector.cargarmanual(mivectorr);
                        break;
            
                default:
                    break;
            }
            
            mivector.display(mivectorr);
            System.out.println();;
            mivector.maximo(mivectorr);
            System.out.println();
            mivector.minimo(mivectorr);
            System.out.println();
            System.out.print("La mediana del array es: " + mivector.mediana(mivectorr) + "\n");
            System.out.print("La media del array es: " + mivector.media(mivectorr) + "\n");
        do {            
            input.nextLine();
            System.out.print("Desea salir del programa? S/N: ");
            salir = input.nextLine();
        } while ("s" != salir.intern() && "n" != salir.intern() && "S" != salir.intern() && "N" != salir.intern());
        mivector.cls();
        input.close();
        } while (salir.equalsIgnoreCase("N"));
    }
}
