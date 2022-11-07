package cl.generation.f20221025;

import java.util.HashMap;
import java.util.Iterator;

public class Map {

	public static void main(String[] args) {

		// buscar sobre los Hashmap, definición, funcionalidades,ejemplo, compararlo con
		// el arreglo dinamico y el hashset}
		// recorrer con while y con iterator los 3 tipos de arreglos

		HashMap<Integer, String> ingredientes = new HashMap<Integer, String>();
		ingredientes.put(0, "Cebolla");// para agregar datos a la variable se usa el nombre de el arreglo mas el .put
		ingredientes.put(1, "Pimenton");
		ingredientes.put(2, "Carne");
		ingredientes.put(3, "Mantequilla");
		ingredientes.put(4, "Laurel");

		// obtener cierto valor -> llamamos a la key
		System.out.println("Quiero ver el ingrediente numero 2 " + ingredientes.get(2));

		// Tamaño
		ingredientes.size();
		System.out.println("Tamaño del arreglo " + ingredientes.size());

		// Recorrer
		System.out.println("Recorrer con un iterator");

		Iterator<Integer> it = ingredientes.keySet().iterator();
		while (it.hasNext()) {
			Integer clave = it.next();
			String valor = ingredientes.get(clave);
			System.out.println("Clave: " + clave + ", valor: " + valor);
		}

		System.out.println("*************************");
		// *++++++++++++++++++++++++

		HashMap<Integer, String> relatores = new HashMap<Integer, String>();
		relatores.put(11, "alejandro");
		relatores.put(2, "andrea");
		relatores.put(43, "laura");
		relatores.put(74, "pamela");
		relatores.put(11, "isrrael"); // si existe la clave, sobre escribe su valor
		System.out.println("map " + relatores);

		// tamaño
		System.out.println(relatores.size());

		// acceder
		relatores.get(33);
		System.out.println(relatores.get(43));

		// eliminar

		relatores.remove(11);
		System.out.println("map " + relatores);

		// recorrer

		// 6.- recorremos un map
		/*
		 * for (Map.Entry<keyType, valType> entry : map.entrySet()) { keyType key =
		 * entry.getKey(); valType val = entry.getValue();
		 * 
		 * }
		 */
		for(Integer clave : relatores.keySet() ) {
			System.out.println("clave "+clave+" valor "+relatores.get(clave));
		}


	}

}
