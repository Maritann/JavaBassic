package cl.generation.f20221102.interfases;

public class main {

	public static void main(String[] args) {
		// 
		
		Caballo caballo = new Caballo ();
		caballo.setAltura(2.5F);

		Humanos humano = new Humanos ();
		humano.metodoAnimal();
		
		Leon leon = new Leon ();
		leon.setAltura(0.80f);
		leon.setPeso(200f);
		//imprimir valores seteados
		
		System.out.println(leon.toString());
		leon.metodoAnimal();
		
		Persona persona = new Persona();
		
	}

}

