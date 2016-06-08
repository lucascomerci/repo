package tp1;
import java.util.Scanner;

public class Main {
	public static void main (String[] parametro){
	//pide datos fabricante 1
		Fabricante fab1 = new Fabricante();
		//fab1.cargarFabricante();
		System.out.println("Cargar datos de Fabricante 1");
		Scanner sc = new Scanner(System.in); //para leer por teclado
		System.out.println("Ingrese nombre de Fabricante");
		fab1.nombre = sc.nextLine();

		System.out.println("Ingrese telefono del Fabricante " + fab1.nombre);
		fab1.telefono = sc.nextLine();
		System.out.println("Ingrese la Direccion del Fabricante " + fab1.nombre);
		fab1.direccion = sc.nextLine();
		System.out.println("Fabricante " + fab1.nombre + " cargado correctamente");
		System.out.println("---------------------------------------------------------");
	//pide datos para fabricante dos
		Fabricante fab2 = new Fabricante();
		System.out.println("Cargar datos de Fabricante 2");
		System.out.println("Ingrese nombre de Fabricante");
		fab2.nombre = sc.nextLine();
		System.out.println("Ingrese telefono del Fabricante " + fab2.nombre);
		fab2.telefono = sc.nextLine();
		System.out.println("Ingrese la Direccion del Fabricante " + fab2.nombre);
		fab2.direccion = sc.nextLine();
		System.out.println("Fabricante " + fab2.nombre + " cargado correctamente");
	//pide datos televisor 1
		Televisor tel1 = new Televisor();
		System.out.println("Cargar televisor 1 correspondiente al fabricante " + fab1.nombre);
		tel1.fabricante = fab1; //le asigno el objeto fab1
		System.out.println("Ingrese Modelo de Televisor 1");
		tel1.modelo = sc.nextLine();
		String strtemp;
		System.out.println("Ingrese Precio de Televisor 1");
		strtemp = sc.nextLine();
		
		
		
		
		tel1.setPrecio(strtemp );
		//tel1.precio = Double.parseDouble(strtemp);
		System.out.println("Ingrese Stock de Televisor 1");
		strtemp = sc.nextLine();
		tel1.stock = Integer.parseInt(strtemp);
		System.out.println("Ingrese Pulgadas de Televisor 1");
		strtemp = sc.nextLine();
		tel1.pulgadas = Integer.parseInt(strtemp);	
		System.out.println("Posee HDMI el Televisor 1");
		strtemp = sc.nextLine();
		tel1.poseeHDMI = Boolean.parseBoolean(strtemp);
		
		
		//pide datos televisor 2
		Televisor tel2 = new Televisor();
		System.out.println("Cargar televisor 2 correspondiente al fabricante " + fab2.nombre);
		tel2.fabricante = fab2; //le asigno el objeto fab2
		System.out.println("Ingrese Modelo de Televisor 2");
		tel2.modelo = sc.nextLine();
		System.out.println("Ingrese Precio de Televisor 2");
		strtemp = sc.nextLine();
		tel2.precio = Double.parseDouble(strtemp);
		System.out.println("Ingrese Stock de Televisor 2");
		strtemp = sc.nextLine();
		tel2.stock = Integer.parseInt(strtemp);
		System.out.println("Ingrese Pulgadas de Televisor 2");
		strtemp = sc.nextLine();
		tel2.pulgadas = Integer.parseInt(strtemp);	
		System.out.println("Posee HDMI el Televisor 2");
		strtemp = sc.nextLine();
		tel2.poseeHDMI = Boolean.parseBoolean(strtemp);
		
	
		//pide datos  AC1
		AireAcondicionado aa1 = new AireAcondicionado();
		System.out.println("Cargar Aire Acondicionado 1 correspondiente al fabricante " + fab1.nombre);
		aa1.fabricante = fab1; //le asigno el objeto fab1
		System.out.println("Ingrese Modelo del Aire Acondicionado 1");
		aa1.modelo = sc.nextLine();
		
		System.out.println("Ingrese Precio del Aire Acondicionado 1");
		strtemp = sc.nextLine();
		aa1.precio = Double.parseDouble(strtemp);
		System.out.println("Ingrese Stock del Aire Acondicionado 1");
		strtemp = sc.nextLine();
		aa1.stock = Integer.parseInt(strtemp);
		System.out.println("Ingrese Frigorias del Aire Acondicionado 1");
		strtemp = sc.nextLine();
		aa1.frigorias = Integer.parseInt(strtemp);
		
		//pide datos  AC2
		AireAcondicionado aa2 = new AireAcondicionado();
		System.out.println("Cargar Aire Acondicionado 2 correspondiente al fabricante " + fab2.nombre);
		aa2.fabricante = fab2; //le asigno el objeto fab2
		System.out.println("Ingrese Modelo del Aire Acondicionado 2");
		aa2.modelo = sc.nextLine();
				
		System.out.println("Ingrese Precio del Aire Acondicionado 2");
		strtemp = sc.nextLine();
		aa2.precio = Double.parseDouble(strtemp);
		System.out.println("Ingrese Stock del Aire Acondicionado 2");
		strtemp = sc.nextLine();
		aa2.stock = Integer.parseInt(strtemp);
		System.out.println("Ingrese Frigorias del Aire Acondicionado 2");
		strtemp = sc.nextLine();
		aa2.frigorias = Integer.parseInt(strtemp);
		
		
		//Muestra los datos
		System.out.println("################################");
		System.out.println("Datos Televisor 1");
		System.out.println("Fabricante: " + tel1.fabricante.nombre );
		System.out.println("Modelo: " + tel1.modelo );
		System.out.println("Precio: " + tel1.precio );
		System.out.println("Stock: " + tel1.stock );
		System.out.println("Pulgadas: " + tel1.pulgadas );
		System.out.println("Posee HDMI: " + tel1.poseeHDMI );
		
		System.out.println("################################");
		System.out.println("Datos Televisor 2");
		System.out.println("Fabricante: " + tel2.fabricante.nombre );
		System.out.println("Modelo: " + tel2.modelo );
		System.out.println("Precio: " + tel2.precio );
		System.out.println("Stock: " + tel2.stock );
		System.out.println("Pulgadas: " + tel2.pulgadas );
		System.out.println("Posee HDMI: " + tel2.poseeHDMI );
		
		System.out.println("################################");
		System.out.println("Datos Aire Aconcicionado 1");
		System.out.println("Fabricante: " + aa1.fabricante.nombre );
		System.out.println("Modelo: " + aa1.modelo );
		System.out.println("Precio: " + aa1.precio );
		System.out.println("Stock: " + aa1.stock );
		System.out.println("Frigorias: " + aa1.frigorias );
		
		System.out.println("################################");
		System.out.println("Datos Aire Aconcicionado 2");
		System.out.println("Fabricante: " + aa2.fabricante.nombre );
		System.out.println("Modelo: " + aa2.modelo );
		System.out.println("Precio: " + aa2.precio );
		System.out.println("Stock: " + aa2.stock );
		System.out.println("Frigorias: " + aa2.frigorias );
	}
	

}
