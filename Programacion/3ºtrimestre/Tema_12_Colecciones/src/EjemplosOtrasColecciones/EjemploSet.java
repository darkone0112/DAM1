/* package EjemplosOtrasColecciones;

import java.time.LocalDate;
 import java.util.HashSet;
 import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet; 

 import PRACTICAS.Practica_12_1_ArrayList.Correo;

public class EjemploSet {
	public static void main(String[] args) {
		//Set <Persona> juntaDirectiva = new HashSet<>();
		//Set <Persona> juntaDirectiva = new TreeSet<>(); //nos obliga a implementar Comparable
		Set <Persona> juntaDirectiva = new LinkedHashSet<>();
		
		juntaDirectiva.add (new Persona (" 12345678A","Pepe","P�rez", LocalDate.of(1990,1,2 )));
		juntaDirectiva.add (new Persona (" 23456789B "," Juan ", " Mart�nez " , LocalDate.of( 1991,2,3 )));
		juntaDirectiva.add (new Persona (" 34567890C "," Ana ", " Ram�rez " , LocalDate.of( 1992,3,4)));
		juntaDirectiva.add (new Persona (" 45678901D "," Mar�a ", " L�pez " , LocalDate.of( 1993,4,5)));
		Persona p=new Persona (" 45678901D "," Mar�a ", " L�pez " , LocalDate.of( 1993,4,5));
		juntaDirectiva.add (p);
		juntaDirectiva.add (p);
		
	
		// Si tratamos de a�adir un elemento repetido ...
		juntaDirectiva.add (p);
		
		// Comprobamos que al listarlos todos, no aparece duplicado
		for( Persona p2 : juntaDirectiva)
			System.out. println (p2);
		
		for (Iterator iterator = juntaDirectiva.iterator(); iterator.hasNext();) {
			Persona persona = (Persona) iterator.next();
			if(persona.getNombre().equals(" Mar�a ")) iterator.remove();
			
		}
		
		System.out.println("\n DESPU�S DEL BORRADO");
		for( Persona p2 : juntaDirectiva)
			System.out. println (p2);
	}

} */
