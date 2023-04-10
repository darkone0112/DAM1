/* package ejercicio1Dam;

import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class vehiculoMain {
	public static ArrayList <MULTAS> listmultas = new ArrayList<>();
	public static void main(String[]args) {
		pasoArrayList();
		dineroRecaudado(listmultas);
		pasoAFTexto(listmultas);
		
	}
	public static void pasoAFTexto(ArrayList <MULTAS> x) {
		try {
			RandomAccessFile random1 = new RandomAccessFile("c:/users/user/desktop/Recaudaciones.txt","raw");
			random1.seek(random1.length());
			for (int i = 0; i < x.size(); i++) {
				random1.writeUTF(multas.get(i).getMatricula);
				random1.writeUTF(multas.get(i).getPropietario);
				random1.writeDouble(multas.get(i).getImporteMulta);
				random1.writeUTF("\n");
			}			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static double dineroRecaudado(ArrayList <MULTAS> x ) {
		double importeTotal = 0;
		for (int i = 0; i < x.size; i++) {
			importeTotal += x.get(i).getImporteMulta;
		}
		return importeTotal;
	}
	public static void pasoArrayList() {
		try {
			RandomAccessFile random = new RandomAccessFile("c:/users/user/desktop/multas.dat", "rw");
			try {
				random.seek(0);
				int i = 0;
				int bytes;
				while (random.getFilePointer()<random.length() && i < 20) {
					multas.add(new multas);
						multas.get(i).setMatricula = random.readUTF();
						multas.get(i).setPropietario = random.readUTF();
						multas.get(i).setImporteMulta += random.readDouble();
					}
						
					i++;
				
				random.close();
			}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

 */