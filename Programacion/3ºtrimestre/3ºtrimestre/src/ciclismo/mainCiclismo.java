package ciclismo;
import java.util.Scanner;

public class mainCiclismo {
    public static void main(String [] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Numero de ciclistas: ");
            int n = 0;
            n = input.nextInt();
            input.nextLine();
            ciclismo ciclistas[] = new ciclismo [n];
            assign(ciclistas);
            organizar(ciclistas);
            
            display(ciclistas);
            
            algoritmoPeloton(ciclistas);
        }
    }
    public static void assign(ciclismo x[]) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Datos de ciclistas sin orden de tiempos necesario: " + "\n");
            for (int i = 0; i < x.length; i++) {
                x[i] = new ciclismo();
                System.out.print("Nombre Ciclista-" + (i+1) + ": ");
                x[i].setNombre(input.nextLine());
                System.out.print("Equipo Ciclista-" + (i+1) + ": ");
                x[i].setEquipo(input.nextLine());
                System.out.print("Numero Ciclista-" + (i+1) + ": ");
                x[i].setNumeroCiclista(input.nextInt());
                input.nextLine();
                System.out.print("Tiempo Real (s) Ciclista-" + (i+1) + ": ");
                x[i].setTiempoReal(input.nextDouble());
                input.nextLine();
            }
        }
    }
    public static void organizar(ciclismo x[]) {
        ciclismo temp = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i].getTiempoReal() < x[i-1].getTiempo()) {
                temp = x[i-1];
                x[i-1] = x[i];
                x[i] = temp;
            }
        }
    }
    public static void display(ciclismo x[]) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i].getTiempoReal() + "\n");
        }
    }
    public static void algoritmoPeloton(ciclismo x[]) {
        int nPelotones = 1;
        x[0].setPeloton(1);
        x[0].setPosicion(1);
        x[0].setTiempo(x[0].getTiempoReal());
        int peloton = 1;
        System.out.print("---PELOTON-1---" + "\n");
        System.out.print(x[0].getNombre() + " | " + x[0].getEquipo() + " | nº" + x[0].getNumeroCiclista() + " | Peloton" + x[0].getPeloton() + " | Posicion-" + x[0].getPosicion() + "º | Tiempo" + x[0].getTiempo() + "seg | Tiempo Real" + x[0].getTiempoReal() + "seg\n");
        for (int i = 1; i < x.length; i++) {
            if (x[i].getTiempoReal() > (x[i-1].getTiempoReal()+2)) {
                peloton++;
                System.out.print("______________________________________________" + "\n");
                System.out.print("---PELOTON-" + peloton + "---" + "\n");
                nPelotones++;
                x[i].setPeloton(peloton);
                x[i].setPosicion(i+1);
                x[i].setTiempo(x[i].getTiempoReal());
                System.out.println();
                System.out.print(x[i].getNombre() + " | " + x[i].getEquipo() + " | nº" + x[i].getNumeroCiclista() + " | Peloton-" + x[i].getPeloton() + " | Posicion-" + x[i].getPosicion() + "º | Tiempo" + x[i].getTiempo() + "seg | Tiempo Real" + x[i].getTiempoReal() + "seg\n");
            } else {
                x[i].setPeloton(peloton);
                x[i].setPosicion(i+1);
                x[i].setTiempo(x[i-1].getTiempoReal());
                System.out.print(x[i].getNombre() + " | " + x[i].getEquipo() + " | nº" + x[i].getNumeroCiclista() + " | Peloton-" + x[i].getPeloton() + " | Posicion-" + x[i].getPosicion() + "º | Tiempo" + x[i].getTiempo() + "seg | Tiempo Real" + x[i].getTiempoReal() + "seg\n");
            }
        }
        System.out.print("Pelotones Totales = " + nPelotones);
    }
    public static void cls(){
/*         System.out.print("Everything on the console will cleared"); */
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
