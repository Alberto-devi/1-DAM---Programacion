import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce la longitud del array: ");
		int Long = sc.nextInt();
		int[] num = new int[Long];
		
		for(int i = 0; i < Long; i++) {
			System.out.print("Introduce un numero para la posicion " + i + ":");
			num[i] = sc.nextInt();
		}
		
		int res = mostrar(num, Long);
		System.out.println(res);
		
		sc.close();
	}
	
	public static int mostrar(int[] lista, int Long) {
		int may = lista[0];
		for(int i = 0; i < Long; i++) {
			if(lista[i] > may) {
				may = lista[i];
			}
		}
		return may;
	}
}
