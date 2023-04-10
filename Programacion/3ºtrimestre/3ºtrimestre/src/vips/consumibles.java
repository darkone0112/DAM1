package vips;

public class consumibles {
    private String nombre;
    public int cantidad;
    public String [] whoami = new String [10];
    private double precio;
    private int dividir;

    public consumibles(String nombre,int cantidad, String [] whoami,double precio,int dividir){
        this.setNombre(nombre);
        this.setWhoami(whoami);
        this.setPrecio(precio);
        this.setDividir(dividir);
    }
    public consumibles(){
        /* default */
    }
    /* getters */
    public String getNombre() {
        return nombre;
    }
    public int getCantidad() {
        return cantidad;
    }
    public String[] getWhoami() {
        return whoami;
    }
    public double getPrecio() {
        return precio;
    }
    public int getDividir() {
        return dividir;
    }
    /* setters */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setWhoami(String[] whoami) {
        this.whoami = whoami;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setDividir(int dividir) {
        this.dividir = dividir;
    }
}

