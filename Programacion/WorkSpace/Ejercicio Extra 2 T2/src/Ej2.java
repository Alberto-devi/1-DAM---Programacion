import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char cond = 's';

		do {
			System.out.println("¿Que tipo de conversion quieres?");
			System.out.println("a) Celsius a Fahrenheit");
			System.out.println("b) Fahrenheit a Celsius");
			System.out.println("c) Celsius a Kelvin");
			
			char conv = sc.next().charAt(0);
			
			System.out.println("Introduce los grados:");
			
			int temp = sc.nextInt();
			
			convertirTemp(conv, temp);
			
			System.out.print("¿Quieres hacer otra conversion? (S/N) ");
			cond = sc.next().charAt(0);
		}while(cond == 's' || cond == 'S');
	}
	
	public static void convertirTemp(char conv, int temp) {
		if(conv == 'a') {
			System.out.println("Conversion: " + temp + "C -> " + (temp * 1.8 + 32) + "F");
		}
		if(conv == 'b') {
			System.out.println("Conversion: " + temp + "F -> " + ((temp - 32) / 1.8) + "C");
		}
		if(conv == 'c') {
			System.out.println("Conversion: " + temp + "C -> " + (temp + 273.15) + "K");
		}
	}
}
