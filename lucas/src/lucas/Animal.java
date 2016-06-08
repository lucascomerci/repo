package lucas;

public class Animal {
	public String especie;
	protected Float altura;
	String raza;
	private Integer edad;

	public Animal() {
		// TODO Auto-generated constructor stub
	}
	 public Animal (String especie) {
		 this.especie = especie;
	 }
	 
	 public Animal (Integer edad) {
		 this.edad = edad;
	 }
	 
	 public Integer ObtenerEdad(){
		 return edad;
		 
	 }
	 protected void setearEdad(String edad){
		 this.edad = Integer.valueOf(edad);
	 }
	 protected void setearEdad(Integer edad){
		 this.edad = edad;
	 }

}
