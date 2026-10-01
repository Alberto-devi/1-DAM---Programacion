import java.util.Scanner;

public class Ejer10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce una palabra: ");
		String palabra = sc.next();
		
		mostrar(conversor(palabra), palabra);
		
		sc.close();
	}
	
	public static char[] conversor(String palabra) {
		char[] convertido = new char[palabra.length()];
		for(int i = 0; i < palabra.length(); i++) {
			convertido[i] = palabra.charAt(i);
		}
		
		return convertido;
	}
	
	public static void mostrar(char[] cadena, String palabra) {
		for(int i = 0; i < palabra.length(); i++) {
			System.out.println(cadena[i]);
		}
	}
}
