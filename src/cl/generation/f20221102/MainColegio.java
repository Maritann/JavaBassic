package cl.generation.f20221102;

import java.util.ArrayList;

public class MainColegio {

	public static void main(String[] args) {

		ArrayList<Directivos> ListaDirectivos = new ArrayList<Directivos>();

		Directivos direc = new Directivos();
	
		direc.setNombre("José");
		direc.setApellido("Morales");
		direc.setCargo("Sostenedor");
		direc.setProfesión("Ingeniero");

		ListaDirectivos.add(direc);
		
		Directivos direc2 = new Directivos();
		
		direc2.setNombre("Pedro");
		direc2.setApellido("Zúñiga");
		direc2.setCargo("Director");
		direc2.setProfesión("Administración");
		
		Directivos direc3 = new Directivos();
		
		direc3.setNombre("Beatriz");
		direc3.setApellido("Mora");
		direc3.setCargo("Inspectora");
		direc3.setProfesión("Administración");

		ListaDirectivos.add(direc3);

		for (Directivos directivoss: ListaDirectivos) {
			System.out.println(directivoss.toString());
		}
	}
}