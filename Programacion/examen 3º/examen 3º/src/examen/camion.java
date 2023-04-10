package examen;

public class camion extends vehiculos{
    private int nruedas;

public camion (){
    super();
}
public camion(String matricula,String fecha,int nruedas){
    super(matricula,fecha);
    this.setNruedas(nruedas);
}

/* getters */
public int getNruedas() {
    return nruedas;
}
/* setters */
public void setNruedas(int nruedas) {
    this.nruedas = nruedas;
}
public double calc() {
    return nruedas * 15;
}
public String toString(){
    return (super.getMatricula() + " -Nº Ruedas: " + nruedas);
}
}
