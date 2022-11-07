package cl.generation.f20221027;

import java.util.Scanner;

public class areasPerimetros {

	public static void main(String[] args) {

	// Menu de opciones
	// terminar la ejecución
	// ofrecer opciones de repeticion (bucles)
	// menu();

	// Calculadora con 4 operaciones basicas
	// solicitar y capturar 2 numeros float
	// imprimir resultados y guardar en una variable

	// definir los metodos
	// validaciones

	// limpiar las variables

	// Lo que me enseñaron a hacer ...float prueba= perimetroTriangulo(3,2,3);
	// float prueba2= areatriangulo (3,4);
	// float prueba3 = multiplicar3 (2,1,6);

		    
		    Scanner sc = new Scanner(System.in);

				//un programa que realice el calculo de las areas y perimetros de triangulo, 
				//rectangulos, y circunferencias, se puede usar la libreria math (cbrt, sqrt)
				
				/* FORMULAS 
				 * AREA TRIANGULO = (BASE * ALTURA)/2-------------------------------------> Adolfo LISTO
				 * AREA RECTANGULO = (BASE * ALTURA) O (LARGO POR ANCHO)  ----------------> judi	LISTO
				 * AREA CIRCUNFERENCIA = (PI * R * R) (PI * RADIO AL CUADRADO)------------> nico LISTO
				 * 
				 * PERIMETRO TRIANGULO = suma de sus tres lados.--------------------------> Mari LISTO
				 * PERIMETRO RECTANGULO = suma de las longitudes de sus cuatro lados. ----> alexander LISTO
				 * PERIMETRO CIRCUNFERENCIA = 2π * R (2 pi por radio)-    ----------------> nico  LISTO
				 */
				float resultado = 0;  // se puede usar para entregar el resultado
				/*switch (opciones) {
				case 1: // Area triangulo    // ADOLOFO
					System.out.println("Ingrese Base");
					float base = sc.nextFloat();
					System.out.println("Ingrese altura");
					float altura = sc.nextFloat();
					resultado = areaTriangulo(base,altura);
					break;
					case 2:// PERIMETRO TRIANGULO
						System.out.println("Ingresa el lado 1");
						float numero1 = sc.nextFloat();
						System.out.println("Ingresa el lado 2");
						float numero2 = sc.nextFloat();
						System.out.println("Ingresa el lado 3");
						float numero3 = sc.nextFloat();
						
						resultado = numero1 + numero2 + numero3;
						System.out.println("El perímetro es " + resultado);
						break;
					case 3: // AREA RECTANGULO JUDI LISTO
		       		System.out.println("Ingrese la base de rectangulo ");
				      float lado1= sc.nextFloat();
				      System.out.println("Ingrese la altura del rectangulo ");
				      float lado2= sc.nextFloat();
					 		float area1 = areaRectangulo(lado1, lado2);

						break;
		        
					case 4: // CASO ALEXANDER
		        System.out.println("Ingrese largo rectangulo");
		        float largo=sc.nextFloat();
		        System.out.println("Ingrese ancho rectangulo");
		        float ancho=sc.nextFloat();
		        
			
						break;

		        
		        
					default:
						System.out.println("Opción no valida");
						break;
		    
		    
				}*/
				}

	public static void menu() {
		System.out.println("*****************************");
		System.out.println("**          MENU           **");
		System.out.println("*****************************");
		System.out.println("*1.-AREA TRIANGULO          *"); // case 1
		System.out.println("*2.-PERIMETRO TRIANGULO     *"); // case 2
		System.out.println("*3.-AREA RECTANGULO         *"); // case 3
		System.out.println("*4.-PERIMETRO RECTANGULO    *"); // case 4
		System.out.println("*5.-AREA CIRCUNFERENCIA     *"); // case 5
		System.out.println("*6.-PERIMETRO CIRCUNFERENCIA*"); // case 6
		System.out.println("*0.-         SALIR          *");
		System.out.println("*****************************");
		Scanner sc = new Scanner(System.in);
		int opciones = 0;
		int contadorErrores = 4;

		do {
			System.out.println("*  Seleccione una opcion  *");
			opciones = sc.nextInt();

			// si la opcion es cero, salir del do-while
			if (opciones == 0) {
				System.out.println("Usted a salido del programa");
				break;

			}

			if (opciones < 1 || opciones > 6) { // condicion de error
				contadorErrores--;
				System.out.println("Quedan " + contadorErrores + " intentos");
			}
			if (contadorErrores == 0) {
				System.out.println("Agoto la cantidad de intentos");
				break;
			}

		} while (opciones < 1 || opciones > 6);
		sc.close();

	}
	/* FUNCIONES */

	// Funcion area del triangulo

	public static float areaTriangulo(float base, float altura) {
		float Area = (base * altura) / 2;
		System.out.println("El area de un triangulo es " + Area);
		return Area;
	}

	// Funcion perimetro triangulo
	public static float perimetroTriangulo(float cateto1, float cateto2, float cateto3) {
		float perimetroT = cateto1 + cateto2 + cateto3;
		System.out.println("dentro de la función" + perimetroT);
		return perimetroT;
	}

	// Funcion Area rectangulo
	public static float areaRectangulo(float lado1, float lado2) {
		float area = lado1 * lado2;
		System.out.println("El area de su rectangulo es " + area + "M2");
		return area;
	}

	// area circunferencia
	public static double AreaCircunferencia(double radio) {
		double AreaCircunferencia = Math.PI * radio * radio;

		return AreaCircunferencia;

	}

	// perimetro circunferencia
	public static double PerimetroCircunferencia(double radio) {
		double PerimetroCircunferencia = Math.PI * 2 * radio;
		return PerimetroCircunferencia;

	}

	

	// PERIMETRO DE UN RECTANGULO
	public static float calculoPerimetroRectangulo (float largo,float ancho) {
			 float perimetrorectangulo=(largo+ancho)*2;
			 System.out.println("EL AREA DEL RECTANGULO ES"+perimetrorectangulo+"CM");
			 return perimetrorectangulo;
		    }
}