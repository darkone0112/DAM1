package examen;

/**
 * vehiculos
 */
public abstract class vehiculos {
    private String matricula;
    private String fecha;
public vehiculos(){
    
}
public vehiculos(String matricula,String fecha){
    this.setFecha(fecha);
    this.setMatricula(matricula);
}
/* getters */
public String getFecha() {
    return fecha;
}
public String getMatricula() {
    return matricula;
}
/* setters */
public void setFecha(String fecha) {
    this.fecha = fecha;
}
public void setMatricula(String matricula) {
    this.matricula = matricula;
}
public String toString(){
    return("Matricula - "+matricula+" Fehca - "+ fecha);
}
public abstract double calc();
}
