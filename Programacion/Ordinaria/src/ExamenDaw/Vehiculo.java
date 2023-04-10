package ExamenDaw;
import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Vehiculo {
	private String matricula;
	private GregorianCalendar fecha;
	
	public Vehiculo(String matricula) {
		this.matricula = matricula;
		this.fecha = new GregorianCalendar();
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getFecha() {
		return String.format("%02d/%02d/%04d",Calendar.DATE,(Calendar.MONTH)+1,Calendar.YEAR);
	}

	public void setFecha(int dia, int mes, int anio) {
		this.fecha = new GregorianCalendar();
	}
	
	public abstract double calcularImporte();

	@Override
	public String toString() {
		return "Vehiculo - matricula: " + matricula + " - fecha: " + fecha;
	}
	
	
	
}
