package ExamenDaw;
public class Camion extends Vehiculo {
	private int ruedas;

	public Camion(String matricula, int ruedas) {
		super(matricula);
		this.ruedas = ruedas;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	
	public double calcularImporte() {
		return (15*ruedas);
	}
	
	@Override
	public String toString() {
		return "COCHE - matricula: "+this.getMatricula()+" - N�mero de ruedas: "+ruedas;
	}
}
