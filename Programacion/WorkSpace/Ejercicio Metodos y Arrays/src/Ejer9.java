import java.util.Scanner;

public class Ejer9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		int num1 = sc.nextInt();
		
		System.out.print("Introduce un numero: ");
		int num2 = sc.nextInt();
		
		int res = suma(num1, num2);
		
		System.out.println(res);
		
		
		sc.close();
	}
	
	public static int suma(int num1, int num2) {
		return (num1 + num2);
	}
}
