package lucas;

import java.io.IOException;

import vehiculos.Autos;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main (String[] args) throws IOException{
		Animal perro = new Animal("Perro");
		System.out.println(perro.especie);
		System.out.println(perro.ObtenerEdad());
		perro.setearEdad("2");
	  
		
		
		Autos auto1 = new Autos();
		auto1.setKilometraje(20);
		auto1.setNroChasis("ABC123");
		auto1.setNroMotor("234234234234");
	
		System.out.println(auto1.mostrarDetalle());
		
		System.out.println(auto1.decirHola());
		
	}
	
	
	
}
