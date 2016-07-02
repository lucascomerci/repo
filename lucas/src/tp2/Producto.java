package tp2;

public class Producto {
	protected static Integer stock = 0;
	protected Double precio;
	protected String marca;

	public Producto() {
		// TODO Auto-generated constructor stub
		stock ++;
	}
	
	public Producto(String marca){
		stock ++;
		this.marca = marca;	
	}
	
	public void finalize(){
		stock --;
		
	}
}
