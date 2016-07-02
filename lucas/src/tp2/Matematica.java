package tp2;

public class Matematica {
	static final Double pi = 3.14;
	// No va a poder ser modificado
	// final no admite cambios.
	// es la forma de crear contantes en java
 	//
	

	public Matematica() {
		// TODO Auto-generated constructor stub	
	}
	
	public static Double suma(Integer num1, Integer num2) {
		Double temp;
		temp = (double) (num1 + num2);
		
		return temp;
	}

	public static Double suma(Double num1, Double num2) {
		return (num1 + num2);
	}
	public Double calcCircunferencia (Object objeto){ //radio /////////////////////////////////////////////////
		
		if (objeto instanceof Integer){
			Integer integerradio = (Integer) objeto;
			return (pi*(2*integerradio));
		}
		else if (objeto instanceof Double){
			Double doublerradio = (Double) objeto;
			return (pi*(2*doublerradio));
		}
		else return -1.0;
	}
	
}//matematica
