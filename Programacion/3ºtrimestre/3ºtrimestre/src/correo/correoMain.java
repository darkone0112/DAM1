package correo;

import java.util.ArrayList;
import java.util.Scanner;

public class correoMain {
    public static ArrayList < correo > listacorreo = new ArrayList<>(1);
    public static Scanner input = new Scanner(System.in);
    public static void main(String[]args) {
        int exit = 0;
        do {
            menu();
        int n = 0;
        n = getInt(n);
        switch (n) {
            case 1:
                display();
                break;
            case 2:
                addMail();
            break;
            case 3:
                deleteMail();
                break;
            case 4:
                displayMail();
            break;
            case 5:
                displayAllMails();
                break;
            case 6:
                findMail();
            break;
            case 7:
                exit=1;
                System.out.print("Saliendo del Programa.....");
            break;
        }
        } while (exit == 0);
    }
    public static void menu() {
        System.out.print("1/Bandeja de entrada \n");
        System.out.print("2/Añadir correo \n");
        System.out.print("3/Eliminar correo \n");
        System.out.print("4/Mostrar correo \n");
        System.out.print("5/Mostrar todos los correos \n");
        System.out.print("6/Mostrar correos a partir de su origen \n");
        System.out.print("7/Salir \n");
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

    public static void display() {
        if (listacorreo.isEmpty()) {
            System.out.print("La bandeja de entrada esta vacia + \n");
        } else {
            for (int i = 0; i < listacorreo.size(); i++) {
                System.out.print("\n\n____________________________________________________\n");
                System.out.print("|Origen: " + listacorreo.get(i).getOrigen() + "\n");
                System.out.print("|\tAsunto: " + listacorreo.get(i).getAsunto() + "\n");
                System.out.print("|\t\t___Fecha: " + listacorreo.get(i).getFecha() + "___Hora:" + listacorreo.get(i).getHoraLlegada() + "|\n");
                System.out.print("|____________________________________________________|\n\n");
            }
        }
    }
    public static void addMail() {
        int posicion = listacorreo.size();
        listacorreo.add(new correo());
        System.out.print("Introduzca un origen: ");
        listacorreo.get(posicion).setOrigen(input.nextLine());
        System.out.print("\n Asunto: ");
        listacorreo.get(posicion).setAsunto(input.nextLine());
        System.out.print("\n Cuerpo");
        listacorreo.get(posicion).setCuerpo(input.nextLine());
        System.out.print("\n Destino: ");
        listacorreo.get(posicion).setFecha(input.nextLine());
        System.out.print("\n Fecha de llegada: ");
        listacorreo.get(posicion).setFecha(input.nextLine());
        System.out.print("\n Hora de llegada: ");
        listacorreo.get(posicion).setHoraLlegada(input.nextLine());
    }
    public static void deleteMail() {
        System.out.print("Mails Disponibles \n");
        for (int i = 0; i < listacorreo.size(); i++) {
            System.out.print("\n\n____________________________________________________\n");
            System.out.print("Nº Correo: " + i);
            System.out.print("Origen: " + listacorreo.get(i).getOrigen() + "\n");
            System.out.print("Asunto: " + listacorreo.get(i).getAsunto() + "\n");
            System.out.print("___________________________________________________\n");
        }
        System.out.print("Introduzca el numero de correo que desea borrar: ");
        int ncorreo = 0;
        getInt(ncorreo);
        listacorreo.remove(ncorreo);
        System.out.print(" \nCorreo Elminidao \n");
    }
    public static void displayMail() {
        for (int i = 0; i < listacorreo.size(); i++) {
            System.out.print("\n\n____________________________________________________\n");
            System.out.print("Nº Correo: " + i);
            System.out.print("Origen: " + listacorreo.get(i).getOrigen() + "\n");
            System.out.print("Asunto: " + listacorreo.get(i).getAsunto() + "\n");
            System.out.print("___________________________________________________\n");
        }
        System.out.print("Introduzca el numero de correo que desea visualizar: ");
        int ncorreo = 0;
        getInt(ncorreo);
        System.out.print(" \nCorreo:\n");
        System.out.print("\n\n____________________________________________________\n");
                System.out.print("|Origen: " + listacorreo.get(ncorreo).getOrigen() + "\n");
                System.out.print("|Destino" + listacorreo.get(ncorreo).getDestino() + "\n");
                System.out.print("|\tAsunto: " + listacorreo.get(ncorreo).getAsunto() + "\n");
                System.out.print("| " + listacorreo.get(ncorreo).getCuerpo() + "\n");
                System.out.print("|\t\t___Fecha: " + listacorreo.get(ncorreo).getFecha() + "___Hora:" + listacorreo.get(ncorreo).getHoraLlegada() + "|\n");
                System.out.print("|____________________________________________________|\n\n");
    }
    public static void displayAllMails() {
        for (int i = 0; i < listacorreo.size(); i++) {
            System.out.print("\n\n____________________________________________________\n");
            System.out.print("|Origen: " + listacorreo.get(i).getOrigen() + "\n");
            System.out.print("| +" + listacorreo.get(i).getDestino() + "\n");
            System.out.print("|\tAsunto: " + listacorreo.get(i).getAsunto() + "\n");
            System.out.print("| " + listacorreo.get(i).getCuerpo() + "\n");
            System.out.print("|\t\t___Fecha: " + listacorreo.get(i).getFecha() + "___Hora:" + listacorreo.get(i).getHoraLlegada() + "|\n");
            System.out.print("|____________________________________________________|\n\n");
        }
    }

    public static void findMail() {
        String forigen;
        System.out.print("Introduzca Origen a buscar: ");
        forigen = input.nextLine();
        for (int i = 0; i < listacorreo.size(); i++) {
            if (forigen.equalsIgnoreCase(listacorreo.get(i).getOrigen())) {
                System.out.print("\n\n____________________________________________________\n");
                System.out.print("|Origen: " + listacorreo.get(i).getOrigen() + "\n");
                System.out.print("| +" + listacorreo.get(i).getDestino() + "\n");
                System.out.print("|\tAsunto: " + listacorreo.get(i).getAsunto() + "\n");
                System.out.print("| " + listacorreo.get(i).getCuerpo() + "\n");
                System.out.print("|\t\t___Fecha: " + listacorreo.get(i).getFecha() + "___Hora:" + listacorreo.get(i).getHoraLlegada() + "|\n");
                System.out.print("|____________________________________________________|\n\n");
                break;
            }
        }
    }
}
