package ejercicio2Dam;

import java.util.ArrayList;
import java.util.Scanner;

public class TrabajadorMain {
	public static ArrayList <Trabajador> trabalist = new ArrayList<>();
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[]args) {
		int n = 0;
		while (n!=-1) {
			switch (n) {
			case 1: 
				addTrabajador();
				break;
				case 2:
				cobroTrienios();
				break;
			
			default:
			}
			}
		}
	public static void cobroTrienios() {
		for (int i = 0; i < trabalist.size(); i++) {
			if (trabalist.get(i) instanceof Profesor) {
				Profesor nprofesor = (Profesor)trabalist.get(i);
				System.out.println("Profesor: " + trabalist.get(i).getNombre() + "Cobro Trienio= " + nprofesor.antiguedad());
			} else {
				System.out.println("Trabajador: " + trabalist.get(i).getNombre() + "Cobro Trienio= " + trabalist.get(i).antiguedad());
			}
			
		}
	}
	public static void addTrabajador() {
		String tipo = "";
		String dni ="";
		String nombre = "";
		String apellidos ="";
		int anioIn = 0;
		int anioNac = 0;
		double sueldo = 0;
		double precioTrienio = 0;
		String asignaturas = "";
		String catedratico ="";
		String situacion ="";
		int formacion = 0;
		int i = 0;
		do {
			System.out.println("Tipo de Trabajador");
			tipo = input.nextLine();
			if (tipo.equalsIgnoreCase("profesor")) {
				System.out.println("dni:");
				dni=input.nextLine();
				System.out.println("nombre:");
				nombre=input.nextLine();
				System.out.println("apellido:");
				apellidos=input.nextLine();
				System.out.println("a�oIn:");
				anioIn = input.nextInt();
				input.nextLine();
				System.out.println("a�o nacimiento:");
				anioNac = input.nextInt();
				input.nextLine();
				System.out.println("sueldo:");
				sueldo = input.nextDouble();
				input.nextLine();
				System.out.println("precioTrienio:");
				precioTrienio = input.nextDouble();
				input.nextLine();
				System.out.println("Asignatura:");
				asignaturas=input.nextLine();
				System.out.println("catedratico:");
				catedratico=input.nextLine();
				System.out.println("situaciono:");
				situacion=input.nextLine();
				System.out.println("Formacion:");
				formacion = input.nextInt();
				input.nextLine();
				Profesor profesor = new Profesor(dni,nombre,apellidos,anioIn,anioNac,sueldo,precioTrienio,asignaturas,catedratico,situacion,formacion); 
			} else {
				System.out.println("dni:");
				dni=input.nextLine();
				System.out.println("nombre:");
				nombre=input.nextLine();
				System.out.println("apellido:");
				apellidos=input.nextLine();
				System.out.println("a�oIn:");
				anioIn = input.nextInt();
				input.nextLine();
				System.out.println("a�o nacimiento:");
				anioNac = input.nextInt();
				input.nextLine();
				System.out.println("sueldo:");
				sueldo = input.nextDouble();
				input.nextLine();
				System.out.println("precioTrienio:");
				precioTrienio = input.nextDouble();
				input.nextLine();
				Trabajador trabajadorr = new Trabajador(dni,nombre,apellidos,anioIn,anioNac,sueldo,precioTrienio); 
			}
			i++;
		} while (!"0".equalsIgnoreCase(dni));
	}
}
