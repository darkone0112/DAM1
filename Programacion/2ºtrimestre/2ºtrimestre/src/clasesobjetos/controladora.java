package clasesobjetos;

import java.util.Scanner;

public class controladora {
    public static void main(String [] Args) {
        try (Scanner input = new Scanner(System.in)) {
            vehiculo camion = new vehiculo();
            camion.marca = "Kamaz";
            camion.modelo = "uaz200";
            camion.consumo = 30;
            camion.capacidadFuel = 400;
            camion.npasajeros = 2;
            camion.colores [0] = "rojo";
            camion.colores [0] = "azul";
            vehiculo taxi = new vehiculo();
            taxi.marca = "Audi";
            taxi.modelo = "A5";
            taxi.consumo = 10;
            taxi.capacidadFuel = 60;
            taxi.npasajeros = 5;
            taxi.colores [0] = "blanco";

            System.out.printf("Vehiculo: Marca:%S -Modelo:%S -Consumo:%.2f -Capacidad:%d -pasajeros:%d ", camion.marca, camion.modelo, camion.consumo, camion.capacidadFuel, camion.npasajeros);
            System.out.println();
            camion.calcautonomia(Args);
            System.out.printf("Vehiculo: Marca:%S -Modelo:%S -Consumo:%.2f -Capacidad:%d -pasajeros:%d ", taxi.marca, taxi.modelo, taxi.consumo, taxi.capacidadFuel, taxi.npasajeros);
            System.out.println();
            taxi.calcautonomia(Args);
            System.out.println("Introduzca Distancia");
            int distancia = input.nextInt();
            System.out.printf("El combustible necesario para el camion recorrer " + distancia + " km es de " + camion.combustibleneed(distancia) + " litros");
        }

    }
}
