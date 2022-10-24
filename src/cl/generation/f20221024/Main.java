package cl.generation.f20221024;

public class Main {

	public static void main(String[] args) {
		//variables, establecemos y decimos tipo de dato
		//tipo de variable según su genero
		
		//variables primitivas: number, string y boolean. Son de carácter estático
		int numero1 = 2; //variable numérica -2^31 y +2^31-1 
		// valor mínimo es -2,147,483,648 y el máximo 2,147,483,647 (inclusive).
		long numero2 = 21474836481l; //2^63 y 2<{63-1
		// tamaño, 8 bytes (64 bits), con un rango de valores desde -263 a 263-1.

		
		float decimal= 2.5f; 
		float decimal2= (float)2.5; // castear ..conocido como tipo de precisión simple, emplea un total de 32 bits. Con este tipo de datos es posible representar números en el rango de 1.4x10-45 a 3.4028235x1038.
		double decimal3= 9.8d;

		char caracter = '4';// si está con comilla doble no se toma como caracter. solo es 1 caracter
        boolean respuesta = true; // o false
        
        //investigar short y byte, tipo, para que sirve y en tamaño
		
		//variables objeto o literal
		Integer numero3= 2;
		//numero2.
		
		// no primitiva
		
		System.out.println(numero1+" "+numero2+" "+decimal+" "+decimal2);
		System.out.println(decimal3+" "+caracter+" "+respuesta);
		
		
		String palabra= "adfakef"; //siempre comilla doble. son cadenas de caracteres q para nosotros forman palabras
		
		Long numero4 = 1234567890L; //todos son por defecto Int por eso debemos ponerle la mayuscula para que lo vea como objeto
		Float numero5 = 7891F; // o Float numer = (Float) 7891
		Double numero6 = 12345678345D;
		boolean presente = false;

		
		//conversion a otros tipos de datos numéricos
		
		//tipovariablenueva variablenueva = tipovariablenueva mivariable 
		
		Long numero7 = 345674L;
		Float numero8 = (float) numero7;
		
		System.out.println(numero7);
		System.out.println(numero8);
		
		Double numero9 = (double) numero5;
		System.out.println(numero5);
		
		
		//***************************************
		
		
		
		
		
		
		

		
		
	}

}
