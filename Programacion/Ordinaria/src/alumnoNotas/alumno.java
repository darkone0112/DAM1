package alumnoNotas;

public class alumno {
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double nota5;
    public alumno(){}

    public alumno (String nombre,double nota1,double nota2,double nota3,double nota4,double nota5){
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.nota5 = nota5;
    }
    /* getters */
    public String getNombre() {
        return nombre;
    }
    public double getNota1() {
        return nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public double getNota3() {
        return nota3;
    }
    public double getNota4() {
        return nota4;
    }public double getNota5() {
        return nota5;
    }
    /* setters */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }
    public void setNota5(double nota5) {
        this.nota5 = nota5;
    }
    @Override
    public String toString() {
        double media = (nota1 + nota2 + nota3 + nota4 + nota5)/5;
        return ("\nEl alumno " + nombre + " Tiene una media de: " + media);
    }
}
