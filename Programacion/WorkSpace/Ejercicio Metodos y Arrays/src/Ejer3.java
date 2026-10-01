import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce la longitud del array: ");
		int Long = sc.nextInt();
		int[] num = new int[Long];
		
		for(int i = 0; i < Long; i++) {
			System.out.print("Introduce un numero para la posicion " + i + ":");
			num[i] = sc.nextInt();
		}
		
		for(int i = 0; i < Long; i++) {
			System.out.print(num[i] + " ");
		}
		
		
		
		sc.close();
	}
}
