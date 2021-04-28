package Vehiculos;
import java.util.ArrayList;
import java.util.Scanner;

public class Test_Vehiculo {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList<Coche> Coc=new ArrayList<Coche>();
 ArrayList<Moto> Mot=new ArrayList<Moto>();
 ArrayList<Avion> Av=new ArrayList<Avion>();
 ArrayList<Helicoptero> Hel=new ArrayList<Helicoptero>();
int option;
do {
	menu();
	option=in.nextInt();
	switch(option) {
	case 1:
		Vehiculo_A(Av, Hel);
		break;
	case 2:
		Vehiculo_T(Mot,Coc);
		break;
	case 0:
		System.out.println("Espere un momento porfavor\n");
		break;
	default:
		System.out.println("Opcion no valida");
	}
}while(option!=0);

}
	public static void menu() {
		System.out.println("========================REGISTRO VEHICULOS====================");
		System.out.println("1.Vehiculos Aereos");
		System.out.println("2.Vehiculos Terrestres");
		System.out.println("0.Salir");
		System.out.print("►►►");
	}
	public static void Vehiculo_A(ArrayList<Avion> Av, ArrayList<Helicoptero> Hel) {
		int option;
		do {
			menu_A();
			option=in.nextInt();
			switch(option) {
			case 1:
				Avion(Av);
				break;
			case 2:
				Helicoptero(Hel);
				break;
			case 0:
				System.out.println("Espere un momento porfavor\n");
				break;
			default:
				System.out.println("Opcion no valida");
			}
		}while(option!=0);

	}
	public static void menu_A() {
		System.out.println("========================Registro de Vehiculos====================");
		System.out.println("1.Avion");
		System.out.println("2.Helicoptero");
		System.out.println("0.Salir");
		System.out.print("►►►");
	}
	public static void Avion(ArrayList<Avion> Av) {
		int Opciones;
		do {
			menu_Av();
			Opciones=in.nextInt();
			switch(Opciones) {
			case 1:
				AñadirNuevoAvion(Av);
				break;
				
			case 2:
				EditarDatosAvion(Av);
				break;
			case 3:
				ListadeAvion(Av);
				break;
			case 4:
				
				EliminarAvion(Av);
				break;
			case 0:
				System.out.println("Espere uno minutos \n el sistema esta guardando datos..");
				break;
			default:
				System.out.println("Opcion no valida");
			}
		}while(Opciones!=0);
	}
	public static void menu_Av() {
		System.out.println("1.Añadir Avion");
		System.out.println("2.Editar Datos Avion");
		System.out.println("3.Lista de  Aviones");
		System.out.println("4.Eliminar Avion");
		System.out.println("0.Salir");
		System.out.print("►►►");
	}
	public static void AñadirNuevoAvion(ArrayList<Avion> Av) {
		System.out.println("===============Agregue Vehiculo============");
		System.out.print("Matricula:");
		in.nextLine();
		int Matricula=in.nextInt();
		System.out.print("Modelo:");
		in.nextLine();
		String Modelo=in.nextLine();
		System.out.print("Altitud Maxima:");
		int Altitud_M=in.nextInt();
		System.out.print("Tipo :");
		in.nextLine();
		String tipo=in.nextLine();		
		Avion Avion=new Avion(Matricula,Modelo,Altitud_M,tipo);
		 Av.add(Avion);
	}
	public static void EditarDatosAvion(ArrayList<Avion> Av){
		System.out.println("Numero Matricula: ");
		int Matric=in.nextInt();
		
		for(Avion i:Av) {
			if(i.getMatricula()==Matric) {
				EditarDatosA(i);
				break;
			}
		}
	}
	public static void EditarDatosA(Avion Av){
		mostrarAvion(Av);
		System.out.println("========================================");
		System.out.println("Editando Datos De Avion");
		System.out.println("========================================");
		in.nextLine();
		System.out.println("Matricula:");
		int Matricula=in.nextInt();
		System.out.print("Modelo:");
		String Modelo=in.nextLine();
		System.out.println("Altitud Maxima:");
		in.nextLine();
		int Altitud_M=in.nextInt();
		System.out.print("Tipo:");
		String tipo=in.nextLine();
		
		if(Matricula!=0) {
			Av.setMatricula(Matricula);
		}
		if(Modelo!=null)
		{
			Av.setModelo(Modelo);
		}
		if(Altitud_M!=0)
		{
			Av.setAltitud_M(Altitud_M);
		}
		if(tipo!=null)
		{
			Av.setTipo(tipo);
		}
	}
	public static void mostrarAvion(Avion Av) {
		System.out.println("Matricula ►"+Av.getMatricula());
		System.out.println("Modelo    ►"+Av.getModelo());
		System.out.println("Altitud Maxima ►"+Av.getAltitud_M()+" Pies");
		System.out.println("Tipo      ►"+Av.getTipo());
		}
	
	public static void ListadeAvion(ArrayList<Avion> Av){
		for(int i=0; i<Av.size(); i++) {
			System.out.println("============================Registro Vehicular==============================");
			System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣Lista de Aviones♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
			System.out.println("Avion:"+(i+1)+" ◄ Matricula ►"+Av.get(i).getMatricula());
			System.out.println("Avion:"+(i+1)+" ◄ Modelo ►"+Av.get(i).getModelo());
			System.out.println("Avion:"+(i+1)+" ◄ Altitud Maxima ►"+Av.get(i).getAltitud_M()+" Pies");
			System.out.println("Avion:"+(i+1)+" ◄ Tipo ►"+Av.get(i).getTipo());
			System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
		}
	}
	public static void 	EliminarAvion(ArrayList<Avion> Av) {
		System.out.println("Eliminar de la lista a Avion");
		System.out.println("Ingrese Numero de Matricula: ");
		in.nextLine();
		int band=0;
		int Matric=in.nextInt();
		for(Avion i:Av) {
			if(i.getMatricula()==Matric) {
				Av.remove(i);
				System.out.println("Avion Eliminado!!!!!!!!!!!");
				band=1;
				break;
			}
		}
		if(band==0) {
			System.out.println("NO SE ENCONTRADO NINGUN RESULTADO");
		}
			
	}
	
	///////////////////////////
	public static void Helicoptero( ArrayList<Helicoptero> Hel) {
		int Opciones;
		do {
			menu_Hel();
			Opciones=in.nextInt();
			switch(Opciones) {
			case 1:
				AñadirNuevoHelicoptero(Hel);
				break;
				
			case 2:
				EditarDatosHelicoptero(Hel);
				break;
			case 3:
				ListadeHelicoptero(Hel);
				break;
			case 4:
				
				EliminarHelicoptero(Hel);
				break;
			case 0:
				System.out.println("Espere uno minutos \n el sistema esta guardando datos..");
				break;
			default:
				System.out.println("Opcion no valida");
			}
		}while(Opciones!=0);
	}
	public static void menu_Hel() {
		System.out.println("1.Añadir Helicoptero");
		System.out.println("2.Editar Datos Helicoptero");
		System.out.println("3.Lista de Helicopteros");
		System.out.println("4.Eliminar Helicoptero");
		System.out.println("0.Salir");
		System.out.print("►►►");
	}
	public static void AñadirNuevoHelicoptero( ArrayList<Helicoptero> Hel) {
		System.out.println("===============Agregue Vehiculo============");
		System.out.print("Matricula:");
		in.nextLine();
		int Matricula=in.nextInt();
		System.out.print("Modelo:");
		in.nextLine();
		String Modelo=in.nextLine();
		System.out.print("Altitud Maxima:");
		int Altitud_M=in.nextInt();
		System.out.print("Capacidad:");
		int Capacidad=in.nextInt();
		Helicoptero Helicoptero=new Helicoptero(Matricula,Modelo,Altitud_M,Capacidad);
		Hel.add(Helicoptero);
	}
	public static void EditarDatosHelicoptero( ArrayList<Helicoptero> Hel){
		System.out.println("Numero Matricula: ");
		int Matric=in.nextInt();
		
		for(Helicoptero i:Hel) {
			if(i.getMatricula()==Matric) {
				EditarDatosH(i);
				break;
			}
		}
	}
	public static void EditarDatosH(Helicoptero Hel){
		mostrarHelicoptero(Hel);
		System.out.println("========================================");
		System.out.println("Editando Datos De Helicoptero");
		System.out.println("========================================");
		in.nextLine();
		System.out.println("Matricula:");
		int Matricula=in.nextInt();
		System.out.print("Modelo:");
		String Modelo=in.nextLine();
		System.out.println("Altitud Maxima:");
		in.nextLine();
		int Altitud_M=in.nextInt();
		System.out.print("Capacidad:");
		int Capacidad=in.nextInt();
		
		if(Matricula!=0) {
			Hel.setMatricula(Matricula);
		}
		if(Modelo!= null)
		{
			Hel.setModelo(Modelo);
		}
		if(Altitud_M!=0)
		{
			Hel.setAltitud_M(Altitud_M);
		}
		if(Capacidad!=0)
		{
			Hel.setCapacidad(Capacidad);
		}
	}
	public static void mostrarHelicoptero(Helicoptero Hel) {
		System.out.println("Matricula ►"+Hel.getMatricula());
		System.out.println("Potencia ►"+Hel.getModelo());
		System.out.println("Altitud Maxima ►"+Hel.getAltitud_M()+" Pies");
		System.out.println("Capacidad ►"+Hel.getCapacidad()+" Toneladas");
		}
	public static void ListadeHelicoptero( ArrayList<Helicoptero> Hel) {
		for(int i=0; i<Hel.size(); i++) {
			System.out.println("============================Registro Vehicular==============================");
			System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣Lista de Helicopteros♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
			System.out.println("Helicoptero:"+(i+1)+" ◄ Matricula ►"+Hel.get(i).getMatricula());
			System.out.println("Helicoptero:"+(i+1)+" ◄ Modelo ►"+Hel.get(i).getModelo());
			System.out.println("Helicoptero:"+(i+1)+" ◄ Altitud Maxima ►"+Hel.get(i).getAltitud_M()+" Pies");
			System.out.println("Helicoptero:"+(i+1)+" ◄ Capacidad ►"+Hel.get(i).getCapacidad()+"  Toneladas");
			System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
		}
	}
	public static void 	EliminarHelicoptero( ArrayList<Helicoptero> Hel) {
		System.out.println("Eliminar de la lista a Helicoptero ");
		System.out.println("Ingrese Numero de Matricula : ");
		in.nextLine();
		int band=0;
		int Matric=in.nextInt();
		for(Helicoptero i:Hel) {
			if(i.getMatricula()==Matric) {
				Hel.remove(i);
				System.out.println("Helicoptero Eliminado!!!!!!!!!!!");
				band=1;
				break;
			}
		}
		if(band==0) {
			System.out.println("NO SE ENCONTRADO NINGUN RESULTADO");
		}
	}
	/////////////////////////
	public static void Vehiculo_T(ArrayList<Moto> Mot, ArrayList<Coche> Coc) {
		int opcion;
		do {
			Menu_Ter();
			opcion=in.nextInt();
			switch(opcion) {
			case 1:
				Moto(Mot);
				break;
			case 2:
				Coche(Coc);
				break;
			case 0:
				System.out.println("Espere un momento porfavor\n");
				break;
			default:
				System.out.println("Opcion no valida");
			}
		}while(opcion!=0);

	}
	public static void Menu_Ter() {
		System.out.println("========================Registro de Vehiculos====================");
		System.out.println("1.Moto");
		System.out.println("2.Coche");
		System.out.println("0.Salir");
		System.out.print("►►►");
	}
public static void Moto(ArrayList<Moto> Mot) {
	int Opciones;
	do {
		Menu_M();
		Opciones=in.nextInt();
		switch(Opciones) {
		case 1:
			AñadirNuevoMoto(Mot);
			break;
			
		case 2:
			EditarDatosMoto(Mot);
			break;
		case 3:
			ListadeMotos(Mot);
			break;
		case 4:
			
			EliminarMoto(Mot);
			break;
		case 0:
			System.out.println("Espere uno minutos \n el sistema esta guardando datos..");
			break;
		default:
			System.out.println("Opcion no valida");
		}
	}while(Opciones!=0);
}
public static void Menu_M() {
	System.out.println("1.Añadir Moto");
	System.out.println("2.Editar Datos Moto");
	System.out.println("3.Lista de  Motos");
	System.out.println("4.Eliminar Moto");
	System.out.println("0.Salir");
	System.out.print("►►►");
}
public static void AñadirNuevoMoto(ArrayList<Moto> Mot) {
	System.out.println("===============Agregue Vehiculo============");
	System.out.print("Matricula:");
	in.nextLine();
	int Matricula=in.nextInt();
	System.out.print("Modelo:");
	in.nextLine();
	String Modelo=in.nextLine();
	int Potencia=in.nextInt();
	System.out.print("Sistema de Arranque:");
	String S_Arranque=in.nextLine();
	Moto Moto=new Moto(Matricula,S_Arranque,Potencia,Modelo);
	   Mot.add(Moto);
}
public static void EditarDatosMoto(ArrayList<Moto> Mot){
	System.out.println("Numero Matricula: ");
	int Matric=in.nextInt();
	
	for(Moto i:Mot) {
		if(i.getMatricula()==Matric) {
			EditarDatosM(i);
			break;
		}
	}
}
public static void EditarDatosM(Moto Mot){
	mostrarMoto(Mot);
	System.out.println("========================================");
	System.out.println("Editando Datos De Motocicleta");
	System.out.println("========================================");
	in.nextLine();
	System.out.println("Matricula:");
	int Matricula=in.nextInt();
	System.out.println("Modelo:");
	in.nextLine();
	String Modelo=in.nextLine();
	System.out.print("Potencia:");
	int Potencia=in.nextInt();
	System.out.print("Sistema de Arranque:");
	String S_Arranque=in.nextLine();
	
	if(Matricula!=0) {
		Mot.setMatricula(Matricula);
	}
	if(Modelo!=null)
	{
		Mot.setModelo(Modelo);
	}
	if(Potencia!=0)
	{
		Mot.setPotencia(Potencia);
	}
	
	if(S_Arranque!=null)
	{
		Mot.setS_Arranque(S_Arranque);
	}
}
public static void mostrarMoto(Moto Mot) {
	System.out.println("Matricula ►"+Mot.getMatricula());
	System.out.println(" Modelo ►"+Mot.getModelo());
	System.out.println(" Potencia ►"+Mot.getPotencia());
	System.out.println(" Sistema de Arranque ►"+Mot.getS_Arranque());
	}

public static void ListadeMotos(ArrayList<Moto> Mot) {
	for(int i=0; i<Mot.size(); i++) {
		System.out.println("============================Registro Vehicular==============================");
		System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣Lista de Motocicletas♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
		System.out.println("Moto:"+(i+1)+" ◄ Matricula ►"+Mot.get(i).getMatricula());
		System.out.println("Moto:"+(i+1)+" ◄ Modelo ►"+Mot.get(i).getModelo());
		System.out.println("Moto:"+(i+1)+" ◄ Potencia ►"+Mot.get(i).getPotencia()+" CC ");
		System.out.println("Moto:"+(i+1)+" ◄ Sistema de Arranque ►"+Mot.get(i).getS_Arranque());
		System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
	}
}
public static void 	EliminarMoto(ArrayList<Moto> Mot) {
	System.out.println("Eliminar de la lista a Moto");
	System.out.println("Ingrese Numero de Matricula: ");
	in.nextLine();
	int band=0;
	int Matric=in.nextInt();
	for(Moto i:Mot) {
		if(i.getMatricula()==Matric) {
			Mot.remove(i);
			System.out.println("Motocicleta  Eliminada!!!!!!!!!!!");
			band=1;
			break;
		}
	}
	if(band==0) {
		System.out.println("NO SE ENCONTRADO NINGUN RESULTADO");
	}
}
///////////////////////////////////
public static void Coche(ArrayList<Coche> Coc) {
	int Opciones;
	do {
		Menu_C();
		Opciones=in.nextInt();
		switch(Opciones) {
		case 1:
			AñadirNuevoCoche(Coc);
			break;
			
		case 2:
			EditarDatosCoche(Coc);
			break;
		case 3:
			ListadeCoche(Coc);
			break;
		case 4:
			
			EliminarCoche(Coc);
			break;
		case 0:
			System.out.println("Espere uno minutos \n el sistema esta guardando datos..");
			break;
		default:
			System.out.println("Opcion no valida");
		}
	}while(Opciones!=0);
}
public static void Menu_C() {
	System.out.println("1.AñadirCoche");
	System.out.println("2.Editar Datos Coche");
	System.out.println("3.Lista de  Coches");
	System.out.println("4.Eliminar Coche");
	System.out.println("0.Salir");
	System.out.print("►►►");
}
public static void AñadirNuevoCoche(ArrayList<Coche> Coc) {
	System.out.println("===============Agregue Vehiculo============");
	System.out.print("Matricula:");
	in.nextLine();
	int Matricula=in.nextInt();
	System.out.print("Modelo:");
	in.nextLine();
	String Modelo=in.nextLine();
	System.out.print("Potencia");
	int Potencia=in.nextInt();
	System.out.print("Categoria:");
	String categoria=in.nextLine();
	Coche Coche=new Coche(Matricula,Modelo,Potencia,categoria);
	   Coc.add(Coche);
}
public static void EditarDatosCoche(ArrayList<Coche> Coc){
	System.out.println("Numero Matricula: ");
	int Matric=in.nextInt();
	
	for(Coche i:Coc) {
		if(i.getMatricula()==Matric) {
			EditarDatosC(i);
			break;
		}
	}
}
public static void EditarDatosC(Coche Coc ){
	mostrarCoche(Coc);
	System.out.println("========================================");
	System.out.println("Editando Datos De Coche");
	System.out.println("========================================");
	in.nextLine();
	System.out.println("Matricula:");
	int Matricula=in.nextInt();
	System.out.println("Modelo:");
	in.nextLine();
	String Modelo=in.nextLine();
	System.out.print("Potencia:");
	int Potencia=in.nextInt();
	System.out.print("Categoria:");
	String Categoria=in.nextLine();
	
	if(Matricula!=0) {
		Coc.setMatricula(Matricula);
	}
	if(Modelo!=null)
	{
		Coc.setModelo(Modelo);
	}
	if(Potencia!=0)
	{
		Coc.setPotencia(Potencia);
	}
	
	if(Categoria!=null)
	{
		Coc.setCategoria(Categoria);
	}
}
public static void mostrarCoche(Coche Coc) {
	System.out.println("Matricula ►"+Coc.getMatricula());
	System.out.println(" Modelo ►"+Coc.getModelo());
	System.out.println(" Potencia ►"+Coc.getPotencia()+" CC ");
	System.out.println(" Categoria ►"+Coc.getCategoria());
	}
public static void ListadeCoche(ArrayList<Coche> Coc) {
	for(int i=0; i<Coc.size(); i++) {
		System.out.println("===============Registro Vehicular============");
		System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣Lista de Coches♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
		System.out.println("Coche:"+(i+1)+" ◄ Matricula ►"+Coc.get(i).getMatricula());
		System.out.println("Coche:"+(i+1)+" ◄ Modelo ►"+Coc.get(i).getModelo());
		System.out.println("Coche:"+(i+1)+" ◄ Potencia ►"+Coc.get(i).getPotencia()+" CC ");
		System.out.println("Coche:"+(i+1)+" ◄ Categoria ►"+Coc.get(i).getCategoria());
		System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
	}
}
public static void 	EliminarCoche(ArrayList<Coche> Coc) {
	System.out.println("Eliminar de la lista a coche");
	System.out.println("Ingrese Numero de Matricula: ");
	in.nextLine();
	int band=0;
	int Matric=in.nextInt();
	for(Coche i:Coc) {
		if(i.getMatricula()==Matric) {
			Coc.remove(i);
			System.out.println("Coche  Eliminado!!!!!!!!!!!");
			band=1;
			break;
		}
	}
	if(band==0) {
		System.out.println("NO SE ENCONTRADO NINGUN RESULTADO");
	}
}


}
