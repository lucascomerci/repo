package vehiculos;

public class Vehiculos {
	
	protected Integer kilometraje;
	private String nroChasis;
	public String getNroChasis() {
		return nroChasis;
	}

	public void setNroChasis(String nroChasis) {
		this.nroChasis = nroChasis;
	}

	public String getNroMotor() {
		return nroMotor;
	}

	public void setNroMotor(String nroMotor) {
		this.nroMotor = nroMotor;
	}

	protected String nroMotor;
	
	public Vehiculos() {
		// TODO Auto-generated constructor stub
	}

	public Integer getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(Integer kilometraje) {
		this.kilometraje = kilometraje;
	}
	 public String decirHola(){
		 return "Hola mundo";
		 
	 }
	

}
