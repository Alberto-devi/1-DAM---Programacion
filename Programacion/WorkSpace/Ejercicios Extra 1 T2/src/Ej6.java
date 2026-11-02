import java.util.Scanner;

public class Ej6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("¿Que idioma prefieres?");
		System.out.println("a) Valenciano");
		System.out.println("b) Castellano");
		System.out.println("c) Inglés");
		
		char idioma = sc.next().charAt(0);
		
		saludar(nombre, idioma);
		
		sc.close();
	}
	
	public static void saludar(String nombre, char caracter) {
		if(caracter == 'a') {System.out.println("Bon dia " + nombre);}
		if(caracter == 'b') {System.out.println("Buenos dias " + nombre);}
		if(caracter == 'c') {System.out.println("Good morning " + nombre);}
	}
}
