import java.util.Scanner;

public class Ej5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		
		while(num > 0) {
			System.out.println("Introduce un numero");
			num = sc.nextInt();
			multiplicar(num);
		}
		
		System.out.println("_________________________________");
		System.out.println("Numero negativo. Fin del programa");
		
		sc.close();
	}
	
	public static void multiplicar(int num) {
		for(int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}
}
