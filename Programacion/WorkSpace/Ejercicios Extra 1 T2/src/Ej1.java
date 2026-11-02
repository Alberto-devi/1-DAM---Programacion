import java.util.Scanner;
public class Ej1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce 2 numeros");
		System.out.print("1- ");
		int num1 = sc.nextInt();
		
		System.out.print("2- ");
		int num2 = sc.nextInt();
		
		System.out.println(mayor(num1, num2) + " es mayor.");
		
		sc.close();
	}
	
	public static int mayor(int num1, int num2) {
		int res = 0;
		
		if(num1 > num2) {
			res = num1;
		} else {
			res = num2;
		}
		
		return res;
	}
}
