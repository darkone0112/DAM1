package ciclismo;


/**
 * ciclismo
 */
public class ciclismo {
    private double tiempo;
    private double tiempoReal;
    private String nombre;
    private String equipo;
    private int numeroCiclista;
    private int posicion;
    private int peloton;

    public ciclismo(double tiempo,double tiempoReal,String nombre,String equipo,int numeroCiclista,int posicion,int peloton){
        this.setTiempo(tiempo);
        this.setTiempoReal(tiempoReal);
        this.setNombre(nombre);
        this.setEquipo(equipo);
        this.setNumeroCiclista(numeroCiclista);
        this.setPosicion(posicion);
        this.setPeloton(peloton);
    }
    public  ciclismo() {
        /* constructor por defecto */
    }
    /* setters */
    public void setTiempo(double tiempo){
        this.tiempo = tiempo;
    }
    public void setTiempoReal(double tiempoReal){
        this.tiempoReal = tiempoReal;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEquipo(String equipo){
        this.equipo = equipo;
    }
    public void setNumeroCiclista(int numeroCiclista){
        this.numeroCiclista = numeroCiclista;
    }
    public void setPosicion(int posisicon){
        this.posicion = posisicon;
    }
    public void setPeloton(int peloton){
        this.peloton = peloton;
    }

    /* getters */
    public double getTiempo(){
        return tiempo;
    }
    public double getTiempoReal(){
        return tiempoReal;
    }
    public String getNombre(){
        return nombre;
    }
    public String getEquipo(){
        return equipo;
    }
    public int getNumeroCiclista(){
        return numeroCiclista;
    }
    public int getPosicion(){
        return posicion;
    }
    public int getPeloton(){
        return peloton;
    }
}