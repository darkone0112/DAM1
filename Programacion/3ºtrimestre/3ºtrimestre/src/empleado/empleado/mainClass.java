import java.text.SimpleDateFormat;
import java.util.Scanner;

public class mainClass {
    public static void main(String[]Args) {
        Scanner input = new Scanner(System.in);
        empleado empleados[] = new empleado [2];
        empleado empleado1 = new empleado();
        empleado empleado2 = new empleado();
        empleados[0] = empleado1;
        empleados[1] = empleado2;
        assign(empleados);
        int cursor = 1;
        System.out.print("1-Visualizar Datos" + "\n" + "2-Modificar salario" + "\n");
        cursor = input.nextInt();
        /* System.out.print("error" + "\n"); */
        switch (cursor) {
            case 1:
                display(empleados);
                break;
            case 2:
                for (int i = 0; i < empleados.length; i++) {
                    System.out.print("Empleado-" + i + ": ");
                    empleados[i].subirSueldo();
                }
                System.out.print("Datos Modificas: ");
                display(empleados);
                break;
            default:
            System.out.print("Por defecto");
                display(empleados);
                break;
        }
      input.close();  
    }
    public static void assign(empleado x[]) {
        try (Scanner input = new Scanner(System.in)) {
            for (int i = 0; i < x.length; i++) {
                System.out.print("Nombre del empleado-" + (i+1) + ": ");
                x[i].setNombre(input.nextLine()); 
                System.out.println();
                System.out.print("Sueldo del empleado-" + (i+1) + ": ");
                x[i].setSueldo(input.nextDouble());
                input.nextLine();
                System.out.println();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                System.out.print("Fecha de contrado-" + (i+1) + ": ");
                try {
                    x[i].setFechaCont(sdf.parse(input.nextLine())); 
                } catch (Exception e) {
                    System.out.print("Fecha invalida");
                }
                System.out.println();
            }
        }
    }
    public static void display(empleado x []) {
        for (int i = 0; i < x.length; i++) {
            System.out.print("Datos del empleado-"+(i+1)+": "+"\n");
            System.out.print("Nombre: " + x[i].getNombre() + "\n");
            System.out.print("Sueldo: " + x[i].getsueldo() + "\n");
            System.out.print("Fecha de contrato: " + x[i].getFechaCont() + "\n");
            System.out.println("______________________________________________________________________________");
        }
    }
}

