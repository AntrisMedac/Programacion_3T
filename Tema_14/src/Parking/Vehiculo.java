package Parking;

public class Vehiculo {

	private String Matricula;
	private String Tipo;
	
	public Vehiculo(String matricula, String tipo) {
		this.Matricula = matricula;
		this.Tipo = tipo;
	}

	public String getMatricula() {
		return Matricula;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setMatricula(String matricula) {
		Matricula = matricula;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	@Override
	public String toString() {
		return Matricula;
	}
	
}