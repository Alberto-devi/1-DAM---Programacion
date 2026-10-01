import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		
		System.out.println("Introduce tu apellido");
		String apellido = sc.nextLine();
		
		System.out.println("Introduce tu edad");
		int edad = sc.nextInt();
		
		datos(nombre, apellido, edad);
		
		
		
		sc.close();
	}
	
	public static void datos(String nombre, String apellido, int edad) {
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellido);
		System.out.println("Edad: " + edad);
	}
}
