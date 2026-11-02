import java.util.Scanner;
public class Ej2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Cuantos numeros vas a introducir? - ");
		int cantidad = sc.nextInt();
		
		
		int[] lista = new int[cantidad];
		
		System.out.println("Introduce " + cantidad + " numeros");
		
		for(int i = 1; i <= cantidad; i++) {
			System.out.print(i + "- ");
			int num = sc.nextInt();
			lista[i - 1] = num;
		}
		
		System.out.print(mayor(lista, cantidad) + " es el mayor numero");
		
		sc.close();
	}
	
	public static int mayor(int[] lista, int cantidad) {
		int res = lista[0];
		
		for(int i = 1; i < cantidad; i++) {
			if(lista[i] > res) {
				res = lista[i];
			}
		}
		
		return res;
	}
}
