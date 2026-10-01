import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce tu edad: ");
		int edad = sc.nextInt();
		
		String res = edad(edad);
		System.out.println("Eres " + res + " de edad");
		
		
		
		sc.close();
	}
	
	public static String edad(int num) {
		if(num >= 18) {
			return "Mayor";
		} else {
			return "Menor";
		}
	}
}
