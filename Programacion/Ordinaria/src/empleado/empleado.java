package empleado;


public class empleado {
    private String nombre;
    private String dni;
    private int nHijos;
    private double sueldo;
    public  empleado() {/* Default */}

    public empleado(String nombre,String dni,int nHijos, double sueldo) {
     this.nombre = nombre;
     this.dni = dni;
     this.nHijos = nHijos;   
     this.sueldo = sueldo;
    }

    /* getters */
    public String getNombre() {
        return nombre;
    }
    public String getDni() {
        return dni;
    }public int getnHijos() {
        return nHijos;
    }
    public double getSueldo() {
        return sueldo;
    }
    /* setters */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setnHijos(int nHijos) {
        this.nHijos = nHijos;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double sueldoNeto(double sueldo) {
        int tramos = (int) sueldo;
        double sueldoNeto = 0;
        if (tramos <=1000) {
            sueldoNeto = sueldo - (sueldo * (0.0612 - disminucionIrpf(nHijos)));      
        } else {
            if (sueldo >=1001 && sueldo <1400) {
                sueldoNeto = sueldo - (sueldo * (0.118 - disminucionIrpf(nHijos))); 
            } else {
                if (sueldo >=1400 && sueldo < 2900) {
                    sueldoNeto = sueldo - (sueldo * (0.2003 - disminucionIrpf(nHijos))); 
                } else {
                    sueldoNeto = sueldo - (sueldo * (0.25 - disminucionIrpf(nHijos))); 
                }
            }
        }
        return sueldoNeto;
    }
    public double disminucionIrpf(int nHijos){
        double disminucion;
        switch (nHijos) {
            case 0:
                disminucion = 0;
                break;
            case 1:
                disminucion = 0.01;
                break;
            case 2:
                disminucion = 0.04;
                break;
            case 3:
                disminucion = 0.07;
            break;
            default:
                disminucion = 0.07;
                break;
        }
        return disminucion;
    }
}
