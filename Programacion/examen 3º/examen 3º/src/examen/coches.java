package examen;

public class coches extends vehiculos{
    private String marca;
    private String modelo;
    private int largo;

    public coches(){
        /* default */
        super();
    }
    public coches(String matricula,String fecha,String marca,String modelo,int largo){
        super(matricula,fecha);
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setLargo(largo);
    }
    /* gettes */
    public int getLargo() {
        return largo;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    /* setters */
    public void setLargo(int largo) {
        this.largo = largo;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double calc() {
        return largo*5;
    }
    @Override
    public String toString(){
        return (super.getMatricula() + " -Marca " + marca + " -Modelo " + modelo + " -Largo " + largo);
    }
}



