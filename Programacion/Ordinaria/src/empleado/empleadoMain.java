package empleado;

import java.util.ArrayList;
import java.util.Scanner;

public class empleadoMain {
    public static Scanner input = new Scanner(System.in);
    public static void main(String []args) {
        ArrayList <empleado> emplist = new ArrayList<>();
        while (true) {
        int n = 0;
        System.out.print("\n1-Agregar empleado\n");
        System.out.print("2-Visualizar empleados\n");
        n = input.nextInt();
        input.nextLine();
            switch (n) {
                case 1:
                    addEmp(emplist);
                    break;
                case 2:
                    display(emplist);
                    break;
                default:
                    break;
            }
        }
    }

    public static void addEmp(ArrayList <empleado> x) {
        System.out.print("\nNombre: ");
        String nombre = input.nextLine();
        System.out.println("\nDni");
        String dni = input.nextLine();
        System.out.print("\nNumero de hijos: ");
        int nHijos = input.nextInt();
        System.out.print("\nSueldo:");
        double sueldo = input.nextDouble();

        x.add(new empleado(nombre, dni, nHijos, sueldo));
    }
    public static void display(ArrayList <empleado>x) {
        for (int i = 0; i < x.size(); i++) {
            System.out.print(x.get(i).getNombre() + "\n");
            System.out.print(x.get(i).getDni()+"\n");
            System.out.print(x.get(i).getSueldo()+"\n");
            System.out.print(x.get(i).getnHijos()+"\n");
            System.out.print("Sueldo neto: "+x.get(i).sueldoNeto(x.get(i).getSueldo())+"\n");
        }
    }

}
