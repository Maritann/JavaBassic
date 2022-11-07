package cl.generation.f20221025;

import java.util.ArrayList;

public class ArregloDinámico {

	public static void main(String[] args) {
		// No
		// ArrayList<TIPODATO> nombre_array = new ArrayList<TIPODATO>();
		// ArrayList<String> grupoUno = new ArrayList<string>();
		ArrayList<String> grupoUno = new ArrayList<String>();
		grupoUno.add("Alexander");
		grupoUno.add("Judiza");
		grupoUno.add("Adolfo");
		grupoUno.add("Nicolás");
		grupoUno.add("María");
		System.out.println(grupoUno);

		// tamaño
		System.out.println(grupoUno.size());
		// length parraarreglo estatico, size para dinámico

		// obtener un elemento dentro del arrelo
		grupoUno.get(3);
		System.out.println(grupoUno.get(3));
		// System.out.println(grupoUno.get(6)); fuera de indice

		// eliminar un elemento dentro del arreglo:
		grupoUno.remove(2);
		System.out.println(grupoUno);

		// agregar
		grupoUno.add("Adolfo"); // pero se agrega al fina, no donde estaba antes

		// recorrer el arrayList
		for (int i = 0; i < grupoUno.size(); i++) {
			System.out.println("relator: " + grupoUno.get(i));
		}

		System.out.println("**************");
		// for iterador o for de objeto
		// for(tipodedato dato: nombregrupo){}
		for (String integrante : grupoUno) {
			System.out.println(integrante);
		}
		
		//ejemplo con numeros
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(2);
		numeros.add(3);
		numeros.add(6);
		
		for (Integer numerito : numeros) {
			System.out.println(numerito);
		}
		// fin numero

	}
     
}
//ctrl + tecla al lado de la z + F (ordena la tabulacion)