import java.lang.reflect.Method;
import java.lang.Math;
import java.util.Scanner;
public class ejercicio4 {
    public static void main(String [] args) {
     int alumnos;
     Scanner teclado = new Scanner(System.in);
     System.out.println("Introduzca un numero de alumnos");
     alumnos = teclado.nextInt();
     int bus = (alumnos / 60);
     int nbus = bus;
     int percapita = 0;
     int precioalumno = 0;
     int total = 0;
     if (alumnos % 60 != 0){
        nbus = nbus + 1;
     }
     int preciobus;
     preciobus = (nbus * 4000);
     if (alumnos <= 30){
        System.out.println("La cantidad de alumnos no es suficiente para el viaje");
     }else{
         if (alumnos >= 100){
             precioalumno = (alumnos * 65);
              percapita = 65;
              total = preciobus + precioalumno;
         }
         if (alumnos >= 55 && alumnos <=99 ){
             precioalumno = (alumnos * 70);
              percapita = 70;
              total = preciobus + precioalumno;
         }
         if (alumnos >= 30 && alumnos <=49 ){
            precioalumno = (alumnos * 95);
             percapita = 95;
             total = preciobus + precioalumno;
        }
     }
     System.out.println("El precio total del viaje es de: " + total + " Ademas el precio percapita es de " + percapita);
    }
    }