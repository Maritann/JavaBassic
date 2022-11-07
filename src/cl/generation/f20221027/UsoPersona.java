package cl.generation.f20221027;

public class UsoPersona {

	public static void main(String[] args) {
		
		
	//instancia 1
	Persona persona1 = new Persona();
	persona1.setNombre("Juan");
	persona1.setApellidoP("Lopez");
	persona1.setEdad(20f);
	persona1.setNacionalidad("Aleman");
	persona1.setEstatura(1.40f);

	//instancia 2
	Persona persona2 = new Persona ("Juan","Lopez",300f,"Italiano",2.90f);

	//impresiones
	
	System.out.println("Datos persona 1 es "+persona1.toString());
	System.out.println("Datos persona 2 es " + persona2.toString());
	}

}
