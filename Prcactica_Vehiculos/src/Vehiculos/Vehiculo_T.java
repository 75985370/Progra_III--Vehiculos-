package Vehiculos;

public class Vehiculo_T extends Vehiculo{

	int Potencia;

	public int getPotencia() {
		return Potencia;
	}
	public void setPotencia(int potencia) {
		Potencia = potencia;
	}
	
	public Vehiculo_T(int matricula, String modelo, int potencia) {
		super(matricula, modelo);
		Potencia = potencia;
	}
	

}
