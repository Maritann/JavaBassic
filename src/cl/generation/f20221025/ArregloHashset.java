package cl.generation.f20221025;

import java.util.HashSet;

public class ArregloHashset {

	public static void main(String[] args) {
		// 1. HashSet <TIPODATO> nombre_array = new HashSet <TIPODATO>();
		HashSet<String> grupoUno = new HashSet<String>();
		// agrega solo un dato, no duplica como el anterior y no sigue el orden de
		// ingreso

		// 2- agregar elementos
		grupoUno.add("Alexander");
		grupoUno.add("Judiza");
		grupoUno.add("Nicolás");
		grupoUno.add("Nicolás");
		System.out.println(grupoUno);
		System.out.println("tamaño "+grupoUno.size());

		//3 verificar el contenido del arreglo
		boolean verificacionNombre = grupoUno.contains("Andrea");
		System.out.println("existe el relator?" + verificacionNombre );

		//4 eliminar elemento
		grupoUno.remove("Judiza"); //ya no elimina por posicón sino que se elimina por el elemento
		System.out.println(grupoUno);
		
		//5. tamaño 
		System.out.println("tamaño "+grupoUno.size());
		
		// 6 recorrer el arreglo

		
		
		

		

	}

}
