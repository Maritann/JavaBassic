package cl.generation.f20221024;

import java.util.Arrays;

public class arreglos {

	public static void main(String[] args) {
		// Arreglos (array) en java (estatáticos, no cambian de tamaño)
		int [] arreglo = new int [3];
		//arreglo.length; tamaño del arreglo
		//agregar datos
		
		arreglo[0] = 4;
		arreglo[1] = 8;
		arreglo[2] = 12;  
		//arreglo[3] = 24; no se puede poner, porque ya dijimos que medirá solo 3 cuando le pusimos new int [3]
		//no puedo ponerle 12L porque solo le entran ints
		System.out.println(arreglo.toString());
		System.out.println(Arrays.toString(arreglo));
		System.out.println(arreglo[0]);
		System.out.println(arreglo.length+"");
		
		//{}
		

		
		String[] vocales = {"a","e","i","o","u"};
		System.out.println("cantidad de elementos "+vocales.length);
		vocales [1]="o";
		vocales [3]="e";
		vocales [2]="y";
		
		//crear un array de numeros flotantes de tamaño 6
		//agregar 6 elementos al arreglo
		
		float [] flotantes = new float [6];
		flotantes [0] = 2.5f;
		flotantes [1] = 33; // quedaría como 33.0
	    flotantes [2] = -0.6f;
	    
	    int [] numeroEntero = new int [2];
	    //numeroEntero [0]= 0.2; // solo puede ser double o float, hay que casterlo así como entero:
	    numeroEntero [0]= (int)0.2;
	    System.out.println(numeroEntero[0]); //solo imprimirá la parte entera osea 0
		
		
		//crear un arreglo de enteros tamaño 100 y agregar valores dinamicamente desde el 1 al 100
	    int [] unoAlCien = new int [100];
		for (int i = 0; i < unoAlCien.length; i = i + 1) {
			unoAlCien[i] = i+1;
		}
		
		System.out.println(Arrays.toString(unoAlCien));

		
		//otra forma del profe, solo cuando sabemos la cantidad de numeros en el arreglo:
		
		int [] unoAlCienprofe = new int [100];
		for (int i = 1; i<=100; i++) {
		unoAlCienprofe [i-1]=i;
			}
		System.out.println(Arrays.toString(unoAlCienprofe));
		
		//lo mismo pero ahora del 100 al 1
		
		
		//crear un arreglo de enteros tamaño 100 y agregar valores dinamicamente desde el 1 al 100
	    int [] CienAlUno = new int [100];
		for (int i = 0; i>100; i--) {
			CienAlUno[i-100] = i;
		}
		
		System.out.println(Arrays.toString(CienAlUno));
		
		
		//del 100 al 1 de Carlos 
				int[] arreint3 = new int[100];
				for (int i = arreint3.length ; i >=1 ; i=i-1) {
					arreint3[i-1]=i-1;
					System.out.println("Elemento :"+(i)+ "posicion: "+(i-1));
					
				}

		//de maria teresa
				int [] cienAlCeroTere = new int [100];
				for (int i= 0; i<cienAlCeroTere.length; i++) {
					cienAlCeroTere[i]= 100-i;
				}
				System.out.println(Arrays.toString(cienAlCeroTere));
				
		//del profe

				int[] arreglo100a1 = new int[100];
				//{100,99,98,97...0}
				for(int i =arreglo100a1.length; i>0  ;i-- ) {
					arreglo100a1[arreglo100a1.length - i]= i;
				}
				System.out.println(Arrays.toString(arreglo100a1));

	//grupal
				
	// Escribir un arreglo de tamaño de 10 ,con números positivos y negativos , capturar en máximo y mínimo
				
				//int [] arreglo10 = new int {-3,-5,4,12,3,35,-35,77,-1,0};
				

				//una forma creada por alexander
				/*var n1,n2,n3,comparador,mayor;
			    n1= parseInt(prompt());
			    n2= parseInt(prompt());
			    n3= parseInt(prompt());

			    if (n1>n2) {
			        n1=comparador
			        
			    } else {
			        n2=comparador
			    }
			    if (comparador>n3) {
			        mayor=comparador
			    } else {
			        mayor=n3    
			    }
			    console.log(mayor); */
				
				int[] arreglo_numeros = {-3,-5, 4,12, 3,35, -35,77,-1, 0};
				
				int maximo=arreglo_numeros[0];
	            for(int i =0; i <arreglo_numeros.length;i++){
	                if(maximo < arreglo_numeros[i]){
	                    maximo= arreglo_numeros[i];     
	            } 
	        }
	        System.out.println(maximo);
	        
			int minimo=arreglo_numeros[0];
            for(int i =0; i <arreglo_numeros.length;i++){
                if(minimo > arreglo_numeros[i]){
                    minimo= arreglo_numeros[i];     
            } 
        }
        System.out.println(minimo);
	     
	            
	                

			
    // 2. El mismo arreglo crear otros 2 arreglos, uno con solo los pares y otro arreglo solo con los impares
        int [] pares = new int [arreglo_numeros.length];
        int [] impares = new int [arreglo_numeros.length];
        
        for (int i=0; i <arreglo_numeros.length; i++){
        	if(arreglo_numeros[i]%2==0) { //obteniendo el par
        	    pares[i]=arreglo_numeros[i]; // {0,0,4,12
        	}else{
        		impares[i]=arreglo_numeros[i]; //{-3,-5,0,0,
        	}
        
        }
				System.out.println(Arrays.toString(pares));
				System.out.println(Arrays.toString(impares));
    // 3. 3. Para el mismo arreglo, sacar el promedio de los números.
        
        

	

	}

}
