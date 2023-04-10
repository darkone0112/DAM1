package cuentaCorriente;

import java.util.Scanner;

public class cuentaCorriente {
    String dni;
    String nombre;
    String apellidos;
    String direccion;
    long numCuenta;
    double saldo;

    public double ingresar() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Introduzca la cantidad a ingresar" + "\n");
            saldo += input.nextDouble();
        }
        System.out.print("Su saldo actual es: " + saldo + "\n");
        return saldo;
    }

    public double sacar() {

        try (Scanner input = new Scanner(System.in)) {
            double extraer = 0;
            do {
                System.out.print("Introduzca la cantidad a extraer" + "\n");    
                extraer = input.nextDouble();
                if (saldo < extraer) {
                    System.out.print("");
                    System.out.print("");
                }
            } while (saldo < extraer);
            saldo -= extraer;
                do {
                    System.out.print("Introduzca la cantidad a extraer" + "\n");    
                    extraer = input.nextDouble();
                    if (saldo < extraer) {
                        System.out.print("");
                    }
                } while (saldo < extraer);
                saldo -= extraer;
        }
        System.out.print("Su saldo actual es: " + saldo + "\n");
        return saldo;
    }

    public void saldo() {
        System.out.print("Su saldo actual es: " + saldo + "\n");
    }
    
    public void modificar() {
        try (Scanner input = new Scanner(System.in)) {
            int cursor = 0;
            System.out.print("Que parametro desea modificar?" + "\n" + "1/Nombre" + "\n" + "2/Apellidos" + "\n" + "3/DNI" + "\n" + "4/Direccion");
            cursor = input.nextInt();
            switch (cursor) {
                case 1:
                    System.out.print("Introduzca el nuevo Nombre: " + "\n");
                    nombre = input.nextLine();
                    System.out.print("Nuevo Nombre: " + nombre + "\n");
                    break;
                case 2:
                    System.out.print("Introduzca el nuevo Apellido " + "\n");
                    apellidos = input.nextLine();
                    System.out.print("Nuevo apellido: " + apellidos + "\n");
                    break;
                case 3:
                    System.out.print("Introduzca el nuevo DNI: " + "\n");
                    dni = input.nextLine();
                    System.out.print("Nuevo DNI: " + dni + "\n");
                    break;
                case 4:
                    System.out.print("Introduzca el nuevo DNI: " + "\n");
                    dni = input.nextLine();
                    System.out.print("Nuevo DNI: " + dni + "\n");
                    break;
                default:
                    break;
            }
        }
    }

    public void menu() {
        try (Scanner input = new Scanner(System.in)) {
            int cursor = 0;
            do {
                System.out.print("1/Ingresar" + "\n");
                System.out.print("2/Extraer" + "\n");
                System.out.print("3/Mostrar Saldo" + "\n");
                System.out.print("4/Modificar datos de cuenta" + "\n");
                System.out.print("5/Terminar" + "\n");
                cursor = input.nextInt();
                switch (cursor) {
                    case 1:
                        ingresar();
                        break;
                        case 2:
                        sacar();
                        break;
                        case 3:
                        saldo();
                        break;
                        case 4:
                        modificar();;
                        break;
                        case 5:
                        break;
                }
                System.out.print("Desea realizar otra operacion? (1/Si 2/No)" + "\n");
                cursor = input.nextInt();
            } while (cursor == 1);
        }
        System.out.print("Hasta Pronto");

    }
}



