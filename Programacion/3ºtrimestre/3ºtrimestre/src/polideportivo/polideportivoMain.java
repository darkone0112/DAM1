package polideportivo;

import java.util.Scanner;

public class polideportivoMain {
    public static void main(String [] Args) {
        String diaSemana[] = {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
        pista reserva[][] = new pista[3][7];
        String menuOptions [] = {"1/-Reservar pista","2/-Cancelar Reserva"/* ,"3/-Modifica tu reserva" */};
        start(reserva);
        do {
            int eleccion[] = new int[1];
            System.out.print("_____________________________________________________________________________________________________________________________________________________________________\n");
            displayDays(diaSemana);
            displayPista(reserva);
            System.out.print("_____________________________________________________________________________________________________________________________________________________________________\n");
            displayMenu(menuOptions);
            System.out.print("Seleccione una opcion: ");
            getInt(eleccion);
            switch (eleccion[0]) {
                case 0:
                    pista.makeReserva(reserva);
                    break;
                case 1:
                    pista.cancelReserva(reserva);
                    break;
                case 2:
                    pista.cancelReserva(reserva);
                    break;
                default:
                    break;
            }
            
            /* System.out.print(eleccion); */
            } while (true);
        
        
        

    }

    public static void getInt(int x[]){
        try (Scanner input = new Scanner(System.in)) {
            /* do { */
                try {
                    System.out.print("valor \n");
                    x[0] = Character.getNumericValue(input.nextLine().charAt(0)-1);
                } catch (Exception e) {
                    System.out.print("error! \n");
                }
            /* } while (error == 1); */
        }
    }
    public static void start(pista x [][]) {
        int j;
        for (int i = 0; i < x.length; i++) {
            for (j = 0; j < x[i].length; j++) {
                x[i][j] = new pista();
                x [i][j].setOcupada(false);
                switch (i) {
                    case 0:
                        x[i][j].SetHoraInicio(18);
                        x[i][j].SetHoraFinal(19);
                        break;
                        case 1:
                        x[i][j].SetHoraInicio(19);
                        x[i][j].SetHoraFinal(20);
                        break;
                        case 2:
                        x[i][j].SetHoraInicio(20);
                        x[i][j].SetHoraFinal(21);
                        break;
                }
            }
        }
    }
    public static void displayPista(pista x [][]) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {                
                if (x[i][j].getOcupada() == false) {
                    System.out.print("Libre|");
                    System.out.print(x[i][j].getHoraInicio() + ":00" + "-" + x[i][j].getHoraFinal() + ":00| \t");
                } else {
                    System.out.print(x[i][j].getNombre() + "|");
                    System.out.print(x[i][j].getHoraInicio() + ":00" + "-" + x[i][j].getHoraFinal() + ":00| \t");
                }
            }
            System.out.println();
            System.out.println();
        }
    }
    public static void displayDays(String x[]) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "\t\t\t");
        }
        System.out.println();
    }
    public static void displayMenu(String x[]) {
            for (int j = 0; j < x.length; j++) {
                System.out.print("  *   *   *   *   *   *   ");
            }
            for (int j = 0; j < x.length; j++) {
                System.out.print("\n * \t\t" + x[j] + "\t\t     *" + "\n");
            }
            for (int j = 0; j < x.length; j++) {
                System.out.print("  *   *   *   *   *   *   ");
        }
    }
}
