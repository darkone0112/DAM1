package linkedListPrueba;
import java.util.LinkedList;
import java.util.Random;
import java.util.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * mainLinkedList
 */
public class prueba {
    public static Random rand = new Random();
    public static ArrayList < linkedListPrueba > pruebas = new ArrayList<>(30000 );
    public static LinkedList <linkedListPrueba> pruebaLinked = new LinkedList<>();
    public static Date fecha = new Date(System.currentTimeMillis());
    public static void main(String [] Args) {
        assignArrayList();
        assignLinkedList();
    }
    public static void assignArrayList() {
        System.out.print("ArrayList \n");
        System.out.print("_______________________________________________\n");
        System.out.print("\n Hora de Comienzo: " + fecha + "\n");
        for (int i = 0; i < pruebas.size(); i++) {
            pruebas.add(new linkedListPrueba());
            /* pruebas.get(i).setNombre("Alumno" + i); */
        }
        System.out.print("\n Hora de Fin: " + fecha + "\n");
        
        LocalDateTime.now();
    }
    public static void assignLinkedList() {
        System.out.print("\nLinkedList \n");
        System.out.print("_______________________________________________\n");
        System.out.print("\n Hora de Comienzo: " + fecha + "\n");
        do {
            pruebaLinked.add((int)Math.random()*(pruebaLinked.size()), new linkedListPrueba());
            /* pruebaLinked.get() */
        } while (pruebaLinked.size()<30000);
        System.out.print("\n Hora de Fin: " + fecha + "\n");
    }
/*     public static void startLinkedList() {
        linkedListPrueba prueba1 = new linkedListPrueba();
    } */
}