import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce 4 numeros: ");
		System.out.print("1- ");
		int num1 = sc.nextInt();
		
		System.out.print("2- ");
		int num2 = sc.nextInt();
		
		System.out.print("3- ");
		int num3 = sc.nextInt();
		
		System.out.print("4- ");
		int num4 = sc.nextInt();
		
		capicuo(num1, num2, num3, num4);
		
		sc.close();
		
	}
	
	public static void capicuo(int num1, int num2, int num3, int num4) {
		if(num1 == num4 && num2 == num3) {
			System.out.println("La secuencia es capicua");
		} else {
			System.out.println("La secuencia no es capicua");
		}
	}
}
