package Vehiculos;

public class Coche extends Vehiculo_T{
	String categoria;

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Coche(int matricula, String modelo, int potencia, String categoria) {
		super(matricula, modelo, potencia);
		this.categoria = categoria;
	}

	
}
