package herencia1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class personaControladora {
    public static ArrayList <persona> perlist = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);
    public static void main(String[]args) {
        while (true) {
            int n = 0;
            System.out.print("\n1/Añadir trabajador\n");
            System.out.print("\n2/Visualizar trabajadores\n");
            System.out.print("\n3/Mayor antiguedad\n");
            n = getInt();
            switch (n) {
                case 1:
                    addTra();
                    break;
                case 2:
                    display(perlist);
                    break;
                case 3:
                    older(perlist);
                    break;
                default:
                    break;
            }
        }
    }
    public static char getCat() {
        boolean error = true;
        char cat = ' ';
        while (error) {
            cat = input.nextLine().charAt(0);
            if (cat != 'a' && cat != 'b' && cat != 'c') {
                System.out.print("\nLa categoria solo puede ser (a-b-c)\n");
                
            }else{error = false;} 
        }
        return cat;
    }
    public static void addTra() {
        System.out.print("\nnombre: ");
        String nombre = input.nextLine();
        System.out.print("\ntelefono: ");
        String telefono = input.nextLine();
        System.out.print("\nedad: ");
        int edad = input.nextInt();
        input.nextLine();
        System.out.print("\ncategoria: ");
        char categoria = getCat();
        System.out.print("\nantiguedad: ");
        int antiguedad = input.nextInt();
        input.nextLine();
        perlist.add(new trabajador(nombre,telefono,edad,categoria,antiguedad));
    }
    public static void display(ArrayList <persona> x) {
        for (int i = 0; i < x.size(); i++) {
            System.out.print("\n" + x.get(i).toString() + "\n");
        }
    }
    public static int getInt() {
        int n = 0;
        boolean error = true;
        while (error) {
            try {
                n = input.nextInt();
                error = false;
            } catch (Exception e) {
                //TODO: handle exception
                System.out.print("\nSe debe introducir un entero\n");
            }finally{input.nextLine();}
        }
        return n;
    }

    public static String older(ArrayList <persona> x) {
        int [] arrayAnti = new int [x.size()];
        for (int i = 0; i < x.size(); i++) {
            trabajador tra =(trabajador) x.get(i);
            arrayAnti[i] = tra.getAntiguedad();
        }
        Arrays.sort(arrayAnti);
        int antiguedad = arrayAnti[x.size()-1];
        return ("La antiguedad mayor es de " + antiguedad + " años");
    }
}
