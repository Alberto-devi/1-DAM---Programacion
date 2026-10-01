import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] abecedario = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		System.out.print("Introduce un numero entre 1 y 26: ");
		int num = sc.nextInt();
		
		char res = abc(num, abecedario);
		
		System.out.println(res);
		
		sc.close();
	}
	
	public static char abc(int num, char[] abecedario) {
		Scanner sc = new Scanner(System.in);
		if (num < 1 || num > 26) {
			while(num < 1 || num > 26) {
				System.out.print("Error. Introduce un numero entre 1 y 26: ");
				num = sc.nextInt();
			}
		}
		
		return abecedario[num - 1];
	}
	
}
