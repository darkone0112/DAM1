package ExamenDaw;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClaseControladora {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<Vehiculo> registro = new ArrayList<>();
		
		registro = registrarEntradas();
		
		cierreCaja(registro);
	}
	
	public static ArrayList<Vehiculo> registrarEntradas() {
		
		String vehiculo, matricula, marca, modelo;
		double largo = 0;
		int ruedas = 0;
		
		boolean error;
		
		ArrayList<Vehiculo> registro = new ArrayList<>();
		
		do {
			error=false;
			System.out.print("Matricula: ");
			matricula = scan.nextLine();
			if (!matricula.equals("0")) {
				do {
					System.out.print("Vehiculo (coche o camion): ");
					vehiculo = scan.nextLine();				
				} while (!vehiculo.equalsIgnoreCase("coche") && !vehiculo.equalsIgnoreCase("camion"));
				if (vehiculo.equalsIgnoreCase("coche")) {
					System.out.print("Marca: ");
					marca = scan.nextLine();
					System.out.print("Modelo: ");
					modelo = scan.nextLine();
					
					do {
						error = false;
						try {
							System.out.print("Largo: ");
							largo = scan.nextDouble();						
						} catch (InputMismatchException e) {
							// TODO: handle exception
							System.out.println("Dato incorrecto");
							error = true;
						}
						scan.nextLine();
					} while (error);
					
					registro.add(new Coche(matricula, marca, modelo, largo));
				} else if (vehiculo.equalsIgnoreCase("camion")) {
					
					do {
						error = false;
						try {
							System.out.print("Numero ruedas: ");
							ruedas = scan.nextInt();						
						} catch (InputMismatchException e) {
							// TODO: handle exception
							System.out.println("Dato incorrecto");
							error = true;
						}
						scan.nextLine();
					} while (error);
					registro.add(new Camion(matricula, ruedas));
				}				
			}
		} while (!matricula.trim().equals("0"));
		
		return registro;
	}
	
	public static void cierreCaja(ArrayList<Vehiculo> registro) {
		for (int i = 0; i < registro.size(); i++) {
			System.out.printf("Matricula: %-15s Importe: %.2f\n",registro.get(i).getMatricula(),registro.get(i).calcularImporte());
		}
	}
}
