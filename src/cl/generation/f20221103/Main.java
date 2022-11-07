package cl.generation.f20221103;

public class Main {

	public static void main(String[] args) {
		// Objetos de colaboracion

		Usuario us = new Usuario();
		/*
		 * ArrayList <String> telefono = new ArrayList <String>(); String telefonito =
		 * "123456789"; telefono.add(telefonito); telefono.add("543452342");
		 */
		us.getTeléfono().add("2345678");
		us.getTeléfono().add("23343623");
		System.out.println(us.getTeléfono());

		Direccion direccion = new Direccion();
		direccion.setCalle("Los pablos");
		direccion.setNumero("1234");
		direccion.setCiudad("Temuco");
		direccion.setRegion("Araucania");

		us.setDireccion(direccion); // pasandole al usuario

		System.out.println(us.getDireccion().toString());

	}

}
