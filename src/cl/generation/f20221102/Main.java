package cl.generation.f20221102;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// herencia en Java

		// instanciando objetos
		Entrenador entrenador = new Entrenador();
		entrenador.setNombre("John");
		entrenador.setApellido("Doe");
		entrenador.setEdad(55);
		entrenador.setAniosExperiencia(10);
		entrenador.setEquipo("Valdivia");
		
		Entrenador entrenadorAyudante = new Entrenador("Isra","Palma",42,17,"cohorte2");

		//imprimiendo los atributos del objeto
		System.out.println(entrenador.toString());
		System.out.println(entrenadorAyudante.toString());
		

		Kinesiólogo kine = new Kinesiólogo();
		kine.setNombre("Jane");
		kine.setApellido("Doe");
		kine.setEdad(52);
		kine.setTitulo("Kinesiología");
		kine.setEspecialidad("motor");
		


		ArrayList<Basquebolista> ListaJugadores = new ArrayList<Basquebolista>();

		Basquebolista basque = new Basquebolista();
		basque.setNombre("Michel");
		basque.setApellido("Pipen");
		basque.setAltura(2.5F);
		
		ListaJugadores.add(basque);
		
		Basquebolista basque2 = new Basquebolista();
		basque2.setNombre("Steve");
		basque2.setApellido("Curry");
		basque2.setAltura(2.0F);
		
		ListaJugadores.add(basque2);
		
		//recorrer
		
		for (Basquebolista basquebolista: ListaJugadores) {
			System.out.println(basquebolista.toString());
		}
		
		kine.metodoImprimir();
		basque2.metodoImprimir();
		entrenador.metodoImprimir();

		//instancia clase hija de ayudante
		Ayudante ayudante = new Ayudante();
		ayudante.metodoImprimir();
	}

}
