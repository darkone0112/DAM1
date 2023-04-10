package ExamenDaw;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class ejercicioExamen {
	public static void main(String[] args) {
		String ficheroPartidos = "partidos.txt";
//		String ficheroPartidos = "D:\\Perfiles\\bt12DAW1\\Desktop\\ExamenJason\\Examen\\src\\partidos.txt";
		
		try {
			ArrayList<Partido> partidos = obtenerPartidos(ficheroPartidos);
			
			muestraPartidos(partidos);
			
			serializarPartidos(partidos);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Error");
		}
	}
	
	public static ArrayList<Partido> obtenerPartidos(String ficheroPartidos) throws IOException {
		ArrayList<Partido> partidos = new ArrayList<>();
		
		BufferedReader leerFichero = new BufferedReader(new FileReader(ficheroPartidos));
		
		String cadena = leerFichero.readLine();
		
		while (cadena != null) {
			partidos.add(new Partido(ajustarCadena(cadena.split("::")[0]),ajustarCadena(cadena.split("::")[1]),Integer.parseInt(cadena.split("::")[2]),Integer.parseInt(cadena.split("::")[3])));
			
			cadena = leerFichero.readLine();
		}
		
		return partidos;
		
	}
	
	public static void muestraPartidos(ArrayList<Partido> partidos) {
		for (int i = 0; i < partidos.size(); i++) {
			System.out.printf("%s %d - %s %d\n",partidos.get(i).getEquipoL(),partidos.get(i).getGolesL(),partidos.get(i).getEquipoV(),partidos.get(i).getGolesV());
		}
	}
	
	public static void serializarPartidos(ArrayList<Partido> partidos) throws IOException {
		RandomAccessFile ficheroAleatorio = new RandomAccessFile("equipo.dat", "rw");
//		RandomAccessFile ficheroAleatorio = new RandomAccessFile("D:\\Perfiles\\bt12DAW1\\Desktop\\ExamenJason\\Examen\\src\\equipos.dat", "rw");
		
		ficheroAleatorio.seek(0);
		for (int i = 0; i < partidos.size(); i++) {
			ficheroAleatorio.writeUTF(partidos.get(i).getEquipoL());
			ficheroAleatorio.writeUTF(partidos.get(i).getEquipoV());
			ficheroAleatorio.writeInt(partidos.get(i).getGolesL());
			ficheroAleatorio.writeInt(partidos.get(i).getGolesV());
		}
		
//		ficheroAleatorio.seek(0);
//		try {
//			while (true) {
//				System.out.printf("%s %s %d %d\n",ficheroAleatorio.readUTF(),ficheroAleatorio.readUTF(),ficheroAleatorio.readInt(),ficheroAleatorio.readInt());
//			}
//		} catch (EOFException e) {
//			// TODO: handle exception
//		}
		
		
	}
	
	public static String ajustarCadena(String cadena) {
		if (cadena.length() > 15) return cadena.substring(1,30);
		return String.format("%-15s", cadena);
	}
	
}
