package tp2;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

import tp1.Fabricante;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		//Fabricante fab2 = new Fabricante();
		Producto pro1 = new Producto();
		Producto pro2 = new Producto("Samsung");
		
	
	/////////////////////////////LISTAS////////////////////////////////////////
		
		
		
		// ------ Lista que se comporta como arreglo ------ //
		List<Integer> lista = new ArrayList<Integer>(); //tamanio variable
		List<Fabricante> listafab = new ArrayList<Fabricante>(); //tamanio variable

		// ------ Arreglo ------ //
		//Integer arregloI[] = new Integer[10]; //tamanio fijo
  		  Integer[] arregloI = new Integer[10]; //tamanio fijo

		System.out.println("Tamaño lista original: " + lista.size());	
		System.out.println("Tamaño array original: " + arregloI.length);
		//Integer nro;
		
		for(int i = 0; i < 10; i++)
		{
			/*
			nro = new Integer(i+1);
			lista.add(nro);
			 */
			lista.add(new Integer(i+1));
			System.out.println("Tamaño lista en carga: " + lista.size());
		}
		for(int i = 0; i < lista.size(); i++)
		{
			System.out.println("Lista en i: " + i + " valor: " + lista.get(i));
		}
		//Integer nro;
		for(int i = 0; i < 10; i++)
		{
			/*
			nro = new Integer(i+10);
			arregloI[i] = nro;
			 */

			arregloI[i] = new Integer(i+10);
			System.out.println("Tamaño array en carga: " + arregloI.length);
		}

		Fabricante temp;
		for (int i=0; i<3; i++) 
		{
			//System.out.println(nro);
			
			temp = new Fabricante();
			
			System.out.println("Cargar datos de Fabricante "+ (i+1));
			Scanner sc = new Scanner(System.in); //para leer por teclado
			System.out.println("Ingrese nombre de Fabricante");
			temp.nombre = sc.nextLine();

			System.out.println("Ingrese telefono del Fabricante " + temp.nombre);
			temp.telefono = sc.nextLine();
			System.out.println("Ingrese la Direccion del Fabricante " + temp.nombre);
			temp.direccion = sc.nextLine();
			System.out.println("Fabricante " + temp.nombre + " cargado correctamente");
			System.out.println("---------------------------------------------------------");
			listafab.add(temp);
			
		}
		
		
		for (int i=0; i<3; i++) 
		{
			
			System.out.println("Fabricante: "+ listafab.get(i).nombre);
						
		}
		
		
		
		
		
		
		
		
		
		
		
		for(int i = 0; i < arregloI.length; i++)
		{
			System.out.println("Arreglo en i: " + i + " valor: " + arregloI[i]);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
