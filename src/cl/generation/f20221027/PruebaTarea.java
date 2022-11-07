package cl.generation.f20221027;

import java.util.Scanner;

public class PruebaTarea {

	
		public static void main(String[] args) {
			//
			// un programa que realice el calculo de las areas y perimetros de triangulo,
			// rectangulos, y circunferencias, se puede usar la libreria math (cbrt, sqrt)

			/*
			 *                FORMULAS 
			 * AREA TRIANGULO = (BASE * ALTURA)/2 
			 * AREA RECTANGULO = (BASE * ALTURA) O (LARGO POR ANCHO) 
			 * AREA CIRCUNFERENCIA = (PI * R * R) (PI * RADIO AL CUADRADO)
			 * PERIMETRO TRIANGULO = suma de sus tres lados. 
			 * PERIMETRO RECTANGULO = suma de las longitudes de sus cuatro lados. 
			 * PERIMETRO CIRCUNFERENCIA = 2π * R (2 pi por radio)
			 */
			menu();

		}
		

		public static void menu() {
			System.out.println("*****************************");
			System.out.println("**          MENU           **");
			System.out.println("*****************************");
			System.out.println("*1.-AREA TRIANGULO          *");
			System.out.println("*2.-PERIMETRO TRIANGULO     *");
			System.out.println("*3.-AREA RECTANGULO         *");
			System.out.println("*4.-PERIMETRO RECTANGULO    *");
			System.out.println("*5.-AREA CIRCUNFERENCIA     *");
			System.out.println("*6.-PERIMETRO CIRCUNFERENCIA*");
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

			if (opciones == 0 || contadorErrores == 0) {
				System.out.println("adiooooooos");

			} else {// solo ingresara para opciones 1,2,3,4
				float resultado = 0;

				switch (opciones) {
				case 1: // Area triangulo    // ADOLOFO
					System.out.println("Ingrese Base");
					float base = sc.nextFloat();
					System.out.println("Ingrese altura");
					float altura = sc.nextFloat();
					resultado = areaTriangulo(base,altura);
					break;
					
				case 2:// PERIMETRO TRIANGULO    // MARI
					System.out.println("Ingresa el lado 1");
					float numero1 = sc.nextFloat();
					System.out.println("Ingresa el lado 2");
					float numero2 = sc.nextFloat();
					System.out.println("Ingresa el lado 3");
					float numero3 = sc.nextFloat();
					resultado = numero1 + numero2 + numero3;
					System.out.println("El perímetro es " + resultado);
					break;
					
				case 3: // AREA RECTANGULO JUDI LISTO  //JUDI
		       	System.out.println("Ingrese la base de rectangulo ");
				    float lado1= sc.nextFloat();
				    System.out.println("Ingrese la altura del rectangulo ");
				    float lado2= sc.nextFloat();
				    float area1 = areaRectangulo(lado1, lado2);
				    break;
				      
	          
	          
	          
				//case 4  perimetro traingulo // ALEXANDER
				    
	          
	          
	          
				case 5: // Area Circunferencia   //NICO
					System.out.println("Ingresa el radio de la circunferencia");
					float radio = sc.nextFloat();
					resultado = (float) AreaCircunferencia(radio);
					System.out.println("El Area de la circunferencia es " + resultado);
					sc.close();
					break;

				case 6: // Perimetro Circunferencia  //NICO
					System.out.println("Ingresa el radio de la circunferencia");
					float radio2 = sc.nextFloat();
					resultado = (float) PerimetroCircunferencia(radio2);
					System.out.println("El Area perimetro de la circunferencia es " + resultado);
					sc.close();
					break;

				default:
					System.out.println("Opción no valida");
					break;

				}
				sc.close();

			}

		}

		public static double AreaCircunferencia(double radio) {
			double AreaCircunferencia = Math.PI * radio * radio;

			return AreaCircunferencia;

		}

		public static double PerimetroCircunferencia(double radio) {

			double PerimetroCircunferencia = Math.PI * 2 * radio;
			return PerimetroCircunferencia;

		}

		public static float areaTriangulo(float base, float altura) {
			float Area = (base * altura) / 2;
			System.out.println("El area de un triangulo es " + Area);
			return Area;
		}

		public static  float areaRectangulo(float lado1 , float lado2) {
				float area = lado1 * lado2;
				System.out.println("El area de su rectangulo es "+area);
				return area;
			}
	}