package vips;
/**
 * vips
 */
/**
 * persona
 */
public class persona {
    private String nombre;
    public double paga;
    private int cantidad;
    private String [] comida = new String [cantidad]; 

    public persona(String nombre,double paga,int cantidad,String [] comida){
        this.setNombre(nombre);
        this.setPaga(paga);
        this.setCantidad(cantidad);
        this.setComida(comida);
    }

    public persona(){
        /* default */
    }
    /* getters */
    public String getNombre() {
        return nombre;
    }
    public double getPaga() {
        return paga;
    }
    public int getCantidad() {
        return cantidad;
    }
    public String[] getComida() {
        return comida;
    }
    /* setters */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setComida(String[] comida) {
        this.comida = comida;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setPaga(double paga) {
        this.paga = paga;
    }
}

