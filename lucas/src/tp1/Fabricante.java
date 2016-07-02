package tp1;
public class Fabricante {

	public String nombre;
	public String telefono;
	public String direccion;
		
	public Fabricante() {
		// TODO Auto-generated constructor stub
	}

	public Fabricante(String nombre) {
		
	}


	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/*public void cargarFabricante (){
		Scanner sc = new Scanner(System.in); //para leer por teclado
		System.out.println("Ingrese nombre de Fabricante");
		nombre = sc.nextLine();
		System.out.println("Ingrese telefono del Fabricante " + nombre);
		telefono = sc.nextLine();
		System.out.println("Ingrese la Direccion del Fabricante " + nombre);
		direccion = sc.nextLine();
		System.out.println("Fabricante " + nombre + " cargado correctamente");
		
	}*/
	
}
