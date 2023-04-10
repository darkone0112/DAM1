package ejercicio2Dam;

public class Trabajador {
	private String dni;
	private String nombre;
	private String apellidos;
	private int anioIn;
	private int anioNac;
	private double sueldo;
	private double precioTrienio;
	
	public Trabajador() {
		/*Default*/
	}
	public Trabajador(String dni,String nombre,String apellido,int anioIn, int anioNac,double sueldo,double precioTrienio) {
		this.setDni(dni);
		this.setNombre(nombre);
		this.setApellidos(apellido);
		this.setAnioIn(anioIn);
		this.setAnioNac(anioNac);
		this.setSueldo(sueldo);
		this.setPrecioTrienio(precioTrienio);
	}
	/*getters*/
	public String getDni() {
		return dni;
	}
	public String getNombre() {
		return nombre;
	}public String getApellidos() {
		return apellidos;
	}
	public int getAnioIn() {
		return anioIn;
	}
	public int getAnioNac() {
		return anioNac;
	}
	public double getSueldo() {
		return sueldo;
	}
	public double getPrecioTrienio() {
		return precioTrienio;
	}
	/*setters*/
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void setAnioIn(int anioIn) {
		this.anioIn = anioIn;
	}
	public void setAnioNac(int anioNac) {
		this.anioNac = anioNac;
	}
	public void setPrecioTrienio(double precioTrienio) {
		this.precioTrienio = precioTrienio;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public double trienios() {
		return ((2022 - getAnioIn())/3);
	}
	public double antiguedad(){
		double importe = 0;
		int ntrienios = (2022 - getAnioIn())/3;
		importe = getPrecioTrienio() * ntrienios;
		return importe;
	}
} 
