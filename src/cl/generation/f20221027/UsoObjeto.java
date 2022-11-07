package cl.generation.f20221027;

public class UsoObjeto {

	public static void main(String[] args) {
		 // instancia de clase //aqui estamos inicializando
		//asigna valores a los atributos privados oslo atraves del metodo Set
		Auto auto1 = new Auto();
		auto1.setColor("rojo");
		auto1.setMarca("ñuñuki");
		
		//consultar el contenido de los atribujtos
		System.out.println(auto1.getColor());
		
		//saber elcontenido de los atributos
		System.out.println(auto1.toString());
	    Auto car = new Auto ("Nissan","negro","qashqai", 1.6f,10.0f,240f);
	    System.out.println(car.getModelo());
	
	    System.out.println(car.toString());
	    
	}

}
//objeto: usuario. nombre apellido, correo, telegono,ocupacion 
//clase main instanciar al objeto para imprimirlo