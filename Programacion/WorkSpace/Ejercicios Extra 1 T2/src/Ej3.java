import java.util.Scanner;
public class Ej3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el caracter que quieres imprimir: ");
		char car = sc.next().charAt(0);
		System.out.print("¿Cuantas veces lo quieres imprimir? - ");
		int num = sc.nextInt();
		
		bucle(car, num);
		
		sc.close();
		
	}
	
	public static void bucle(char car, int num) {
		for(int i = 1; i <= num; i++) {
			System.out.println(i + " - " + car);
		}
	}
}
