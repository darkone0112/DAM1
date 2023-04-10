package herencia1;

public class persona {
    private String nombre;
    private String telefono;
    private int edad;
    public persona() {
        /* default */
    }
    public persona(String nombre,String telefono,int edad){
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
    }
    /* getters */
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getTelefono() {
        return telefono;
    }
    /* setters */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    @Override
    public String toString(){
        return (nombre + edad + " años" + " telefono: " + telefono);
    }
}
