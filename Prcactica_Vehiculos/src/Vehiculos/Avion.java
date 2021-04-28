package Vehiculos;

public class Avion extends Vehiculo_A {
String tipo;
public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public Avion(int matricula, String modelo, int altitud_M, String tipo) {
	super(matricula, modelo, altitud_M);
	this.tipo = tipo;
}
}
