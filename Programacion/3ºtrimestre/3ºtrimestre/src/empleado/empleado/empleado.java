import java.util.Date;
import java.util.Scanner;

public class empleado {
    Scanner input = new Scanner(System.in);
    private String nombre;
    private double sueldo;
    private Date fechaCont;

    public empleado(String nombre,double sueldo,Date fechaCont) {
        this.setNombre(nombre);
        this.setSueldo(sueldo);
        this.setFechaCont(fechaCont);
    }
    public empleado() {
        /* constructor por defecto */
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public void setFechaCont(Date fechaCont) {
        this.fechaCont = fechaCont;
    }

    public String getNombre() {
        return nombre;
    }
    public double getsueldo() {
        return sueldo;
    }public Date getFechaCont() {
        return fechaCont;
    }

    /* Subir sueldo */
    public void subirSueldo() {
        System.out.print("Porcentaje de subida del sueldo" + "\n");
        setSueldo((input.nextDouble()*(getsueldo()/100))+getsueldo());
        System.out.print("El nuevo sueldo es de: " + getsueldo() + "\n");
    }
}

