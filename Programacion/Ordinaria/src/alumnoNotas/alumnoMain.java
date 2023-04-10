package alumnoNotas;

import java.util.Scanner;

public class alumnoMain {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[]args) {
        alumno alumnos [] = new alumno [1];
        alumnos[0] = new alumno();
        addAlumno(alumnos);
        display(alumnos);
    }
    public static void addAlumno(alumno x []) {
        for (int i = 0; i < x.length; i++) {
            System.out.print("\nNombre alumno nº" + (i+1) + "\n");
            x[i].setNombre(input.nextLine());
            System.out.print("Nota 1: ");
            x[i].setNota1(input.nextDouble());
            input.nextLine();
            System.out.print("Nota 2: ");
            x[i].setNota2(input.nextDouble());
            input.nextLine();
            System.out.print("Nota 3: ");
            x[i].setNota3(input.nextDouble());
            input.nextLine();
            System.out.print("Nota 4: ");
            x[i].setNota4(input.nextDouble());
            input.nextLine();
            System.out.print("Nota 5: ");
            x[i].setNota5(input.nextDouble());
            input.nextLine();
        }
    }
    public static void display(alumno x []) {
        for (int i = 0; i < x.length; i++) {
            System.out.print("\n" + x[i].toString());
        }
    }
}
