package examen;

import java.util.ArrayList;
import java.util.Scanner;

public class vehiculosMain {
    public static Scanner input = new Scanner(System.in);
    public static ArrayList <vehiculos> lVehiculos = new ArrayList<>();
    public static void main(String[]args) {
        int n = 0;
        while (n!=-1) {
            System.out.println("\n1/Añadir Coche");
            System.out.println("2/Mostrar Coches");
            System.out.println("3/Añadir Camion");
            System.out.println("4/Mostrar Camiones");
            n = input.nextInt();
            input.nextLine();
            switch (n) {
                case 1:
                    addCoche();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                     addCamion();
                    break;
                case 4:

                    break;
                default:
                    break;
            }
            n=0;
        }
    }
    public static void display() {
        for (int i = 0; i < lVehiculos.size(); i++) {
            if (lVehiculos.get(i) instanceof coches) {
                coches pedro = (coches)lVehiculos.get(i);
                System.out.print("\nEl coche con matricula: " + lVehiculos.get(i).getMatricula() + " tiene un importe: " + pedro.calc()+"\n");
            }else{
                if (lVehiculos.get(i) instanceof camion) {
                    camion eduardo = (camion)lVehiculos.get(i);
                    System.out.print("\n El camion con matricula" + lVehiculos.get(i).getMatricula() + " tiene un importe: " + eduardo.calc() +"\n");
                } else {
                    System.out.println("No eduardo or pedro found in System");
                }
            }
        }
    }
    public static void addCoche() {
        int size = 0;
        System.out.print("\nCuantos coches desea añadir: ");
        size = input.nextInt();
        input.nextLine();
        for (int i = 0; i < size; i++) {
            System.out.print("\nmatricula:");
            String matricula = input.nextLine();
            System.out.print("\nfecha:");
            String fecha = input.nextLine();
            System.out.print("\nmarca:");
            String marca = input.nextLine();
            System.out.print("\nmodelo:");
            String modelo = input.nextLine();
            System.out.print("\nlargo:");
            int largo = input.nextInt();
            input.nextLine();
            System.out.println();
            lVehiculos.add(new coches(matricula, fecha, marca, modelo, largo));
        }
    }
    public static void addCamion() {
        int size = 0;
        System.out.print("\nCuantos camiones desea añadir: ");
        size = input.nextInt();
        input.nextLine();
        for (int i = 0; i < size; i++) {
            System.out.print("\nmatricula:");
            String matricula = input.nextLine();
            System.out.print("\nfecha:");
            String fecha = input.nextLine();
            System.out.print("\nnRuedas:");
            int nRuedas = input.nextInt();
            input.nextLine();
            lVehiculos.add(new camion(matricula, fecha,nRuedas));
        }
    }

}
