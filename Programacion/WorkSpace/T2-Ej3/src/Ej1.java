import java.util.Scanner;
public class Ej1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce una palabra: ");
		String palabra = sc.next();
		char[] invertido = new char[palabra.length()];
		
		invertido = invert(invertido, palabra);
		
		System.out.print(palabra + " -> ");
		
		for(int i = 0; i < palabra.length(); i++) {
			System.out.print(invertido[i]);
		}
	}
	
	public static char[] invert(char[] invertido, String palabra) {
		int aux = palabra.length()-1;
		for(int i = 0; i < palabra.length(); i++) {
			invertido[i] = palabra.charAt(aux);
			aux--;
		}
		return invertido;
	}

}
