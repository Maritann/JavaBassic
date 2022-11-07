package cl.generation.f20221028;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		
		Estudiante estudiante = new Estudiante();
		System.out.println(estudiante.toString());
		estudiante.setEdad(3);
		estudiante.setCorreo("m@m.cl");*/
		

		Scanner sc = new Scanner(System.in);
		int continuar = 2;
		
		//arreglo de estudiantes
		ArrayList<Estudiante> estudiantes = new ArrayList <Estudiante>();
		//String nombre = "";
		do {
			//instancia al objeto estudiante
			Estudiante estudiante = new Estudiante ();
			//Estudiante estudiante = new Estudiante (nombre,apellido);
			System.out.println("Ingrese el nombre del estudiante");
			String nombre = sc.nextLine();// israel alexis
			System.out.println("Ingrese el apellido del estudiante");
			String apellido = sc.nextLine();//
			estudiante.setNombre(nombre);
			estudiante.setApellido(apellido);
			
			estudiantes.add(estudiante);
			System.out.println("¿Quiere agregar otro estudiante?");
			System.out.println("(1) - sí / (2) - No");
			continuar =sc.nextInt();
			sc.nextLine();
			
		}while(continuar==1);
		System.out.println("*******************");
		for (Estudiante estudiante :estudiantes) {
			System.out.println("nombre:"+ estudiante.getNombre());
			System.out.println("apellido:"+ estudiante.getApellido());
			System.out.println();
			System.out.println("*******************");
		}
		//obtener un estudiante
		System.out.println(estudiantes.get(0));
		
		
		//accedemos al atributo
		System.out.println(estudiantes.get(0).getApellido());
		sc.close();
	}

	
}
//arreglo dinámico, bucle que nos pida los datos y luego la opción de salir