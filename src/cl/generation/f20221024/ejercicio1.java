package cl.generation.f20221024;

public class ejercicio1 {

	public static void main(String[] args) {
		Long numero4 = 1234567890L;
		Float numero5 = 7891F; 
		Double numero6 = 12345678345D;
		
		//conversion a otros tipos de datos numéricos
		
		//tipovariablenueva variablenueva = (tipovariablenueva) mivariableacovertir 
		
		//primitivos****************************++
		
		Long numero7 = 345674L;
		Float numero8 = (float) numero7;
		
		System.out.println(numero7);
		System.out.println(numero8);
		
		Double numero9 = (double) numero5;
		System.out.println(numero5);
		
		
		// lo que hicimos en grupo
		
		int numero_1 = 123;
		float decimal_1 = 12.1f;
		byte numero_2 = 123;
		long numero_3 = 1234566;
		double decimal_2 = 23.4d;
		
		//byte -> double, float, long, int, 
		
		double bad = (double)numero_2;
		float baf =(float)numero_2;
		long bal = (long)numero_2;
		int bai = (int)numero_2;
		
		//int -> double, float, long
		
		double iad =(double)numero_1;
		float iaf =(float)numero_1;
		long ial = (long)numero_1;
		
		
		//long -> double, float
		
		double lad = (double)numero_3;
		float laf = (float)numero_3;
		
		//float -> double
		
		double fad = (double)decimal_2;
		
		
		//ctrl shift f para ordenar
		//de Integer a Long
		  //Integer i = 12345;
		  //Long j = Long.valueOf(i);
		  //System.out.println(j);
		
		//parseInt retorna palabra primitiva
		//VAlueOf retorna un integer (no primitivo)

		

	}

}
