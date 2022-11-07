package cl.generation.f20221026;

import java.util.Arrays;

public class Funciones1 {

	public static void main(String[] args) {
		// Funciones
		// main para gatillar el llamado a otras funciones
		// 2. llamar al método...
		nombreMetodo();
		metodo2("Mari");
		metodo3(1);
		metodo4(11, 0.4f);

		String[] vocales = { "a", "e", "i", "o", "u" };

		metodo5(vocales);

		// metodos con llamados
		retorno1(); // no hace nada con el valor retornado
		System.out.println(retorno1()); // llamado de la función
		Integer valorRetornado = retorno1();// variable tipo integer
		System.out.println(valorRetornado);// se imprime solo el valor
		System.out.println(valorRetornado + 35); // puede hacerse operaciones con el valor retornado
		System.out.println(valorRetornado / 7);

		String nombreCompleto = obtenerNombreCompleto("María", "Trincado", "Alvarado"); // nombreCompleto o cualquier
																						// cosa que sea significativa
																						// para mí
		System.out.println("El nombre completo es: " + nombreCompleto);
		
		llamadaAotroMetodo();
		
		
	}

	public static void nombreMetodo() {
		System.out.println("Estoy dentro del método inicial");

		// static nos permite acceder sin instanciar, osea no hay que crear una
		// instancia de la clase (el new)
		// void el método no retorna ningún valor
		// nombreMetodo(){} el de main, llama
	}

	public static void metodo2(String nombre) {
		System.out.println("Hola soy " + nombre);
	}

	public static void metodo3(Integer numero) {
		System.out.println("Soy del grupo " + numero);
	}

	public static void metodo4(Integer numero1, Float numero2) {
		System.out.println("soy la numero " + numero1);
		System.out.println("soy la numero " + numero2);
	}

	public static void metodo5(String[] arreglito) {
		System.out.println("Soy el arreglo " + Arrays.toString(arreglito));
	}

	// funciones con retorno
	public static Integer retorno1() {
		Integer totalAlumnos = 35;
		return totalAlumnos;

	}

	/**
	 * @param nombre
	 * @param apePaterno
	 * @param apeMaterno
	 * @return
	 */
	// esto de arriba se llama javadoc

	public static String obtenerNombreCompleto(String nombre, String apePaterno, String apeMaterno) {
		String nombreCompleto = nombre + " " + apePaterno + " " + apeMaterno;
		return nombreCompleto; // retornamos el contenido de la variable
	}
	
	//metodo que llama a otro metodo
	
	public static void llamadaAotroMetodo() {
		System.out.println("llamada a otro metodo desde un metodo");
		metodo4(1234,54.3f);
	}
}
