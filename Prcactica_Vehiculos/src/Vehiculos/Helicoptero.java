package Vehiculos;

public class Helicoptero extends Vehiculo_A {
int Capacidad;

public int getCapacidad() {
	return Capacidad;
}

public void setCapacidad(int capacidad) {
	Capacidad = capacidad;
}

public Helicoptero(int matricula, String modelo, int altitud_M, int capacidad) {
	super(matricula, modelo, altitud_M);
	this.Capacidad = capacidad;
}



}
