package ExamenDaw;
public class Coche extends Vehiculo {
	private String marca, modelo;
	private double largo;
	
	public Coche(String matricula, String marca, String modelo, double largo) {
		super(matricula);
		this.marca = marca;
		this.modelo = modelo;
		this.largo = largo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}
	
	public double calcularImporte() {
		return (5*largo);
	}

	@Override
	public String toString() {
		return "COCHE - matricula: "+this.getMatricula()+" - Marca y modelo: "+marca+" "+modelo+" - Largo: "+largo+" metros";
	}
	
	
}
