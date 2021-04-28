package Vehiculos;

public class Vehiculo {
	int Matricula;
	String Modelo;
	
	public int getMatricula() {
		return Matricula;
	}
	public void setMatricula(int matricula) {
		Matricula = matricula;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	
	public Vehiculo(int matricula, String modelo ) {
		super();
		Matricula = matricula;
		Modelo = modelo;
	}
	
}
