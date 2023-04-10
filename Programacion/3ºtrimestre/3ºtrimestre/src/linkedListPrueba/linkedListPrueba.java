package linkedListPrueba;

public class linkedListPrueba {
    private int valor;
    private String nombre;

public linkedListPrueba(int valor,String nombre) {
 this.setValor(valor);
 this.setNombre(nombre);   
}
public linkedListPrueba() {
    /* default */
}
/* setters */
public void setValor(int valor) {
    this.valor = valor;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
/* getters */
public int getValor() {
    return valor;
}
public String getNombre() {
    return nombre;
}
}

