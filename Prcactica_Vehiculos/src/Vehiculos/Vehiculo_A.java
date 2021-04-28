package Vehiculos;

public class Vehiculo_A extends Vehiculo{
	
	int Altitud_M;

	public int getAltitud_M() {
		return Altitud_M;
	}
	public void setAltitud_M(int altitud_M) {
		Altitud_M = altitud_M;
	}
	public Vehiculo_A(int matricula, String modelo,  int altitud_M) {
		super(matricula, modelo);
		Altitud_M = altitud_M;
	}
	
	

}
