package n1ejercicio1;

import java.util.ArrayList;
import java.util.List;

import n1ejercicio2.Persona;

public class NoGenericMethods {
	
	List<Persona>   listaobjetos;

	public NoGenericMethods(Persona p1, Persona p2, Persona p3) {
		super();
		listaobjetos = new  ArrayList<Persona>();
		listaobjetos.add(p1);
		listaobjetos.add(p2);
		listaobjetos.add(p3);
	}

	public Persona LeePersona( int i) {
		
		return 		listaobjetos.get(i);
	}

	public void  AsignaPersona( Persona p1,int i) {
		listaobjetos.add(i, p1);
	}
	private  Persona trabajador1;
	private  Persona trabajador2;
	private  Persona trabajador3;
 

	public static void main(String[] args) {
		
		Persona p1 = new Persona("JUAN RAMON","GONZALEZ PEREZ" ,12);
		Persona p2 = new Persona("ANA","MARIA MATUTES" ,43);
		Persona p3 = new Persona("ARTURO","PEREZ REVERTE" ,53);
		
		NoGenericMethods listaobjetos = new NoGenericMethods( p1, p2, p3);
		
		System.out.println( listaobjetos.LeePersona(0).toString() );
		System.out.println( listaobjetos.LeePersona(1).toString() );
		System.out.println( listaobjetos.LeePersona(2).toString() + "\n\n");
		
		NoGenericMethods listaobjetos2 = new NoGenericMethods(p3, p2, p1);
	 
		System.out.println( listaobjetos2.LeePersona(0).toString() );
		System.out.println( listaobjetos2.LeePersona(1).toString() );
		System.out.println( listaobjetos2.LeePersona(2).toString() + "\n\n" );
		
 		
	}

}
