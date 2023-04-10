package clasesobjetos;

public class vehiculo {
    /* Atributos */
    String marca;
    String modelo;
    int npasajeros;
    int capacidadFuel;
    float consumo;
    String colores [] = new String [5];
    public void calcautonomia(String [] Args) {
        float autonomia = capacidadFuel / consumo;
        System.out.println("La autonomia es de " + autonomia);
    }
    double combustibleneed(int distancia){
        double litros;
        litros = distancia / consumo;
        return litros;
    }
    public static void name() {
        
    }
}
