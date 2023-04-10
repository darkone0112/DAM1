package herencia1;

public class trabajador extends persona{
    private char categoria;
    private int antiguedad;

    public trabajador() {
        super();
    }
    public trabajador(String nombre,String telefono,int edad,char categoria,int antiguedad) {
        super(nombre,telefono,edad);
        this.categoria = categoria;
        this.antiguedad = antiguedad;
    }
    /* getters */
    public char getCategoria() {
        return categoria;
    }
    public int getAntiguedad() {
        return antiguedad;
    }
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }
    @Override
    public String toString() {
        return (super.toString() + " Categoria: " +categoria + " Antiguedad: " + antiguedad);
    }
/*     public class error extends Exception{
        
    } */
}

