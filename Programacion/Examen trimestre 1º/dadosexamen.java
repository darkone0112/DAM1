import java.util.Scanner;

public class dadosexamen {
    public static void main(String [] Args) {
        Scanner input = new Scanner(System.in);
        int apuesta = 0;
        int banca = 1500;
        int saldo = 90;
        int pago = 0;
        int dado1 = 0;
        int dado2 = 0;
        int puntos = 0;
        int jugadorw = 0;
        int bancaw = 0;
        int tiradas = 0;
        int repetir = 0;
        String seguir = "";
        do {
            do {
                System.out.println("Introduzca apuesta");    
                apuesta = input.nextInt();
                if (apuesta > saldo) {
                    System.out.println("La apuesta excede el saldo");
                }
            } while (apuesta < 6 || saldo < 6 || apuesta > saldo);
            do {
                repetir = 0;
            do {
                System.out.println("dado1");
                dado1 = input.nextInt();
                System.out.println("dado2");
                dado2 = input.nextInt();
            } while (dado1 <0 && dado1 > 6 && dado2 <0 && dado2 > 6);
            puntos = dado1 + dado2;
            pago = (apuesta * 3);
            switch (puntos) {
                case 11:
                case 8:
                System.out.println("Gana el jugador " + pago);
                if (banca < apuesta*3) {
                    saldo = saldo + banca;
                    banca = 0;
                    System.out.println("La banca se ha quedado sin dinero");
                } else {
                    saldo = saldo + pago;
                    banca = banca - pago;
                }
                jugadorw++;
                tiradas = tiradas + 1;
                break;
                case 6:
                case 5:
                case 12:
                System.out.println("Gana la banca " + apuesta);
                saldo = saldo - apuesta;
                banca = banca + apuesta;
                bancaw++;
                tiradas = tiradas + 1;
                break;
                default:
                System.out.println("Se repite la tirada");
                tiradas = tiradas + 1;
                repetir = 1;
                break;
            }
        } while (repetir == 1);
        if (saldo >= 6 && banca != 0) {
            System.out.println("Desea seguir jugando:");
            seguir = input.next();    
        }
        } while (seguir.equalsIgnoreCase("S") && saldo > 6 && banca != 0);
        System.out.println("El saldo del jugar es de: " + saldo);
        System.out.println("El saldo de la banca es de: " + banca);
        System.out.println("Han habido un total de " + tiradas + " tiradas");
        System.out.println("El jugador a ganado un total de: " + jugadorw + " y la banca " + bancaw + " tiradas");
        in.close();
    }
}