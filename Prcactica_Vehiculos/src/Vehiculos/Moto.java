package Vehiculos;

public class Moto extends Vehiculo_T  {
 String S_Arranque;


public String getS_Arranque() {
	return S_Arranque;
}

public void setS_Arranque(String s_Arranque) {
	S_Arranque = s_Arranque;
}

public Moto(int matricula, String modelo, int Potencia ,String s_Arranque) {
	super(matricula, modelo, Potencia);
	S_Arranque = s_Arranque;
}

}
