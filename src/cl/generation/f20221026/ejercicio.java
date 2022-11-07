package cl.generation.f20221026;

import java.util.Scanner;

public class ejercicio {

	public static void main(String[] args) {
		// nombre, edad, peso, estatura, mensaje si está obeso, etc.
		Scanner scanner = new Scanner(System.in);
		
		int edad = 0;

		do {

			System.out.println("Ingresa tu edad");
			edad = scanner.nextInt();

		} while (edad < 18 || edad > 120);

		System.out.println(edad);

		Float IMC = calculoIMC();
		System.out.println("Su IMC es: " + IMC);
		nivelIMC(IMC);

	}

	public static Float calculoIMC() {

		// como capturamos info para pasarsela a un metodo
		// capturar datos ingresados por el usuario
		Scanner scanner = new Scanner(System.in);
		// calculo del IMC;
		// imc= kilos/(estatura*estatura);

		System.out.println("Ingrese su peso en kilogramos");
		Float peso = scanner.nextFloat();
		System.out.println("el peso del paciente es: " + peso);

		System.out.println("Ingrese su estatura en metros");
		Float estatura = scanner.nextFloat();
		System.out.println("La estatura del paciente es: " + estatura);

		Float IMC = peso / (estatura * estatura);

		scanner.close(); // o sino va a seguir escuchando

		return IMC;
	}

	public static void nivelIMC(Float IMC) {

		/*
		 * <18.5 - bajo peso 18.5 - 24.9 normal 24.9 - 29.9 sobrepeso <29.9 obeso
		 */
		if (IMC < 18.5F) {
			System.out.println("El paciente está bajo peso");
		} else if (IMC >= 18.5F && IMC < 25) {
			System.out.println("El paciente tiene un peso normal");
		} else if (IMC >= 25 && IMC < 30) {
			System.out.println("El paciente está con sobrepeso");
		} else {
			System.out.println("El paciente tiene obesidad I");
		}
	}
	public static String obtenerNombreCompleto(String nombre, String apePaterno, String apeMaterno) {
		String nombreCompleto = nombre + " " + apePaterno + " " + apeMaterno;
		return nombreCompleto;
	}

}
