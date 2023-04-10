import java.util.Scanner;
public class llamada {
    public static void main( String [] Args ) {
        double impuestodia = 0;
        double impuestohora = 0;
        double precio = 0;
        double total = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca dia de la semana");
        String dia = teclado.next();
        if ( dia.equalsIgnoreCase("domingo")){
            impuestodia = 0.03;
           // System.out.println("bien");//
        }
    System.out.println("La hora de su llamada:");
    System.out.print("HH:");
    Scanner input = new Scanner(System.in);
    int hora = input.nextInt();
    System.out.print("MM:");
    int minutos = input.nextInt();
    System.out.println("La hora de su llamada fue " + hora + ":" + minutos);
    if (hora > 14 && hora <= 23 ){
        impuestohora = 0.10;
    }else{
        impuestohora = 0.15;
    }
    System.out.println("Introduzca la duracion de su llamada");
    int llamada = input.nextInt();
    if (llamada <= 5){
        precio = 1.0;
    }
    if (llamada <=8 && llamada > 5);{
        precio = 1.80;
    }
    if (llamada <= 10 && llamada > 8){
        precio = 2.50;
    }
    if (llamada >= 10){
        precio = 3.0;
    }
    total = precio + (precio * impuestodia) + (precio * impuestohora);
    System.out.println("El precio total de su llamda seria de: " + total);
    }
}
