import java.util.Scanner;
public class Ejer5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Intruduce un numero: ");
		int num = sc.nextInt();
		
		String res = esPrimo(num);
		System.out.println(res);
		
		sc.close();
	}
	
	public static String esPrimo(int num) {
		boolean primo = true;
		
		for(int i = 2; i * i <= num; i++) {
			if(num % i == 0) {
				primo = false;
			}
		}
		
		if(primo == true) {
			return "Es primo";
		} else {
			return "No es primo";
		}
		
	}
}
