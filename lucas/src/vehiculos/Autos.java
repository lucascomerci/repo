package vehiculos;


public class Autos extends Vehiculos {
	
	private String modelo;
	private String anio;
	String tamano;
	protected String color;
	
	

	public Autos() {
		// TODO Auto-generated constructor stub
	}

	
	 /*
	 protected void ObtenerModelo(String edad){
		return modelo;
	
	 }

*/

	public String mostrarDetalle(){
		String detalle = this.nroMotor+" "+this.getNroChasis();
		return detalle;
		
	}
	
	public String toString(){
		return this.mostrarDetalle();
	}

	public String decirHola(){
		 return "chau mundo";
		 
	 }
	
}


