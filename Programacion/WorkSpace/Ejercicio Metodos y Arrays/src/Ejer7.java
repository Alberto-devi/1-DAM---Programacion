import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un numero: ");
		int num = sc.nextInt();

		int[] lista = factorial(num);

		for (int i = 0; i < num; i++) {
			System.out.print(lista[i]);
			if (i < num - 1) {
				System.out.print(" * ");
			}
		}
		System.out.println(" = " + lista[num]);

		sc.close();
	}

	public static int[] factorial(int n) {
		int[] lista = new int[n + 1];
		int aux = 1;

		for (int i = 0; i < n; i++) {
			lista[i] = n - i;
			aux *= lista[i];
		}
		
		lista[n] = aux;

		return lista;
	}
}