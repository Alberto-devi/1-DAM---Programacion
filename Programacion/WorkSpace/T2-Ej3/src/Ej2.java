import java.util.Scanner;
public class Ej2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Cuantas posiciones tendra el Array? - ");
		int espacios = sc.nextInt();
		
		int[] lista = rellenar(espacios);
		
		int res = suma(lista);
		
		System.out.print("La suma es " + res);
		
	}
	
	public static int[] rellenar(int espacios) {
		Scanner sc = new Scanner(System.in);
		int[] lista = new int[espacios];
		
		for(int i = 0; i < espacios; i++) {
			System.out.print("Valor " + i + ": ");
			lista[i] = sc.nextInt();
		}
		
		return lista;
	}
	
	public static int suma(int[] lista) {
		int res = 0;
		
		for(int i = 0; i < lista.length; i++) {
			res += lista[i];
		}
		
		return res;
	}
}
