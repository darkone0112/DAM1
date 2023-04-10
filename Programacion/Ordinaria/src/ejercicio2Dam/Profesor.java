package ejercicio2Dam;

public class Profesor extends Trabajador {
	private String asignatura;
	private String catedratico;
	private String situacion;
	private int formacion;
	
public Profesor() {
	super();
}
public Profesor(String dni,String nombre,String apellidos,int anioIn,int anioNac,double sueldo,double precioTrienio,String asignatura,String catedratico,String situacion,int formacion) {
	super(dni,nombre,apellidos,anioIn,anioNac,sueldo,precioTrienio);
	this.setAsignatura(asignatura);
	this.setCatedratico(catedratico);
	this.setSituacion(situacion);
	this.setFormacion(formacion);
}
/*getters*/
public String getAsignatura() {
	return asignatura;
}
public String getCatedratico() {
	return catedratico;
}
public String getSituacion() {
	return situacion;
}
public int getFormacion() {
	return formacion;
}
/*setters*/
public void setAsignatura(String asignatura) {
	this.asignatura = asignatura;
}
public void setCatedratico(String catedratico) {
	this.catedratico = catedratico;
}
public void setSituacion(String situacion) {
	this.situacion = situacion;
}
public void setFormacion(int formacion) {
	this.formacion = formacion;
}
public double antiguedad() {
	getPrecioTrienio();
	double importe = 0;
	int ntrienios = (2022-getAnioIn())/3;
	if (getSituacion().equalsIgnoreCase("fijo") && !getSituacion().equalsIgnoreCase("catedratico")) {
		importe = getPrecioTrienio()*ntrienios;
	} else {if (getSituacion().equalsIgnoreCase("catedratico")) {
		importe = (getPrecioTrienio()*ntrienios)*1.45;
	}
	}
	return importe;
}
}
