
import java.util.ArrayList;
import java.util.Scanner;

/**
 * vipsMain
 */
public class vipsMain {
    public static boolean javiel;
    public static double javi = 0.50;
    public static Scanner input = new Scanner(System.in);
    public static ArrayList < persona > listaPersona = new ArrayList<>();
    public static ArrayList < consumibles > listaConsumibles = new ArrayList<>();
    public static double total = 0;
    public static void main(String [] args) {
        char cursor;
        start();
        System.out.print("Esta javiel: (S/Y)");
        cursor = input.nextLine().charAt(0);
        Character.toUpperCase(cursor);
        if (cursor == 'S') {
            javiel = true;
         javielsi();   
        } else {
            javiel = false;
            javielno();
        }
    }
    public static void javielsi(){
        do {
            displayMenu();
            menu();
        } while (true);
    }
    public static void javielno() {
        do {
            displayMenu();
            menu();
        } while (true);
    }
    
    public static void displayMenu() {
        System.out.print("\n\t\t\t\t\t\t\t\t___________________________________\n");
        System.out.print("\n\t\t\t\t\t\t\t\t1/Añadir consumible compartido\n");
        System.out.print("\t\t\t\t\t\t\t\t2/Añadir consumible a persona\n");
        System.out.print("\t\t\t\t\t\t\t\t3/Desglose consumibles\n");
        System.out.print("\t\t\t\t\t\t\t\t4/Desglose persona\n");
        System.out.print("\t\t\t\t\t\t\t\t5/Mostrar Todo\n");
        System.out.print("\t\t\t\t\t\t\t\t6/Salir\n");
        if (javiel = true) {
            System.out.print("\t\t\t\t TOTAL=" + (total/2) + "€");
        } else {
            System.out.print("\t\t\t\t TOTAL=" + total + "€");
        }
        System.out.print("\n\t\t\t\t\t\t\t\t___________________________________\n");

    }
    public static void menu() {
        int n = 0;
        n = input.nextInt();
        switch (n) {
            case 1:
                addcons();
                break;
            case 2:
                addSingleCons();
                break;
            case 3:
                displayConsumibles();
                break;
            case 4:
                displayPersonas();
                break;
            case 5:
                System.out.print("\nDesglose por Personas");
                displayPersonas();
                System.out.print("\n:...............................:\n");
                System.out.print("\nDesglose por Consumibles");
                displayConsumibles();
                break;
            case 6:
                
                break;
        }
    }
    public static void start() {
        int n = 0;
        System.out.print("Cuantos Pibiños?: ");
        n = input.nextInt();
        input.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Persona º" + (i+1));
            listaPersona.add(new persona());
            System.out.print("\n Nombre: ");
            listaPersona.get(i).setNombre(input.nextLine());
        }
    }
    public static void addcons() {
        System.out.print("Que van a comer?: ");
        listaConsumibles.add(new consumibles());
        input.nextLine();
        listaConsumibles.get(listaConsumibles.size()-1).setNombre(input.nextLine());
        System.out.print("\nPrecio: ");
        listaConsumibles.get(listaConsumibles.size()-1).setPrecio(input.nextDouble());
        System.out.print("\nEntre cuantos se va a dividir");
        int cantidadDividir = 0;
        cantidadDividir = input.nextInt();
        input.nextLine();
        listaConsumibles.get(listaConsumibles.size()-1).cantidad = cantidadDividir;
       /*  System.out.print("\n"+listaConsumibles.get(listaConsumibles.size()-1).getCantidad());
        System.out.print("\n"+listaConsumibles.get(listaConsumibles.size()-1).whoami[0]); */
        System.out.print("\nEntre quienes se va a dividir");
        for (int i = 0; i < cantidadDividir; i++) {
            /* System.out.print("ojo"); */
            for (int j = 0; j < listaPersona.size(); j++) {
                System.out.print("\n/"+(j+1)+listaPersona.get(j).getNombre() + "\n");
            }
            int n = 0;
            System.out.print("\n0/Salir");
            System.out.print("\n ELige: ");
            n = input.nextInt();
            n = n -1;
            if (n == -1) {
                break;
            }else{
               listaConsumibles.get(listaConsumibles.size()-1).whoami[i]=listaPersona.get(n).getNombre();
/*                listaPersona.get(n).setPaga(listaConsumibles.get(listaConsumibles.size()-1).getPrecio()/cantidadDividir); */
               listaPersona.get(n).paga += listaConsumibles.get(listaConsumibles.size()-1).getPrecio()/cantidadDividir;
            }
        }
        total += listaConsumibles.get(listaConsumibles.size()-1).getPrecio();
    }
    public static void addSingleCons() {
        System.out.print("Que va a comer?: ");
        listaConsumibles.add(new consumibles());
        input.nextLine();
        listaConsumibles.get(listaConsumibles.size()-1).setNombre(input.nextLine());
        System.out.print("\nPrecio: ");
        listaConsumibles.get(listaConsumibles.size()-1).setPrecio(input.nextDouble());
        System.out.print("\nQuien va a pedir?: ");
        for (int j = 0; j < listaPersona.size(); j++) {
            System.out.print("\n/"+(j+1)+listaPersona.get(j).getNombre() + "\n");
        }
        listaConsumibles.get(listaConsumibles.size()-1).setCantidad(1);
        int n = 0;
        n = input.nextInt();
        n -=1;
        listaConsumibles.get(listaConsumibles.size()-1).whoami[0]=listaPersona.get(n).getNombre();
        /*                listaPersona.get(n).setPaga(listaConsumibles.get(listaConsumibles.size()-1).getPrecio()/cantidadDividir); */
        listaPersona.get(n).paga += listaConsumibles.get(listaConsumibles.size()-1).getPrecio();
        total += listaConsumibles.get(listaConsumibles.size()-1).getPrecio();
    }
    public static void displayPersonas() {
        for (int i = 0; i < listaPersona.size(); i++) {
            System.out.print("\n" + listaPersona.get(i).getNombre() + ": ");
            if (javiel=true) {
                System.out.print(" " + (listaPersona.get(i).getPaga()/2) + "\n");
            } else {
                System.out.print(" " + listaPersona.get(i).getPaga() + "\n");
            }
            
        }
    }
    public static void displayConsumibles() {
        for (int i = 0; i < listaConsumibles.size(); i++) {
            System.out.print("\n" + listaConsumibles.get(i).getNombre());
            if (javiel=true) {
                System.out.print("....." + (listaConsumibles.get(i).getPrecio()/2) + "€\n");
            } else {
                System.out.print("....." + listaConsumibles.get(i).getPrecio() + "€\n");
            }
            System.out.print("(");
            for (int j = 0; j < (listaConsumibles.get(i).getCantidad()) ; j++) {
                if (javiel=true) {
                    System.out.print(listaConsumibles.get(i).whoami[j] + "..." + ((listaConsumibles.get(i).getPrecio()/listaConsumibles.get(i).getCantidad())/2)+"€)\n");
                } else {
                    System.out.print(listaConsumibles.get(i).whoami[j] + "..." + listaConsumibles.get(i).getPrecio()/listaConsumibles.get(i).getCantidad()+"€)\n");
                }
                
            }
        }
    }
    public static int getInt(int x){
        int error = 0;
        do {
            error=0;
            try {
                x = input.nextInt();
            } catch (Exception e) {
                System.out.print("Valor Erroneo + \n");
                error=1;
            }
            input.nextLine();
        } while (error == 1);
        return x;
    }
}


