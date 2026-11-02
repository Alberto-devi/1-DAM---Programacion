public class Ej3 {
	public static void main(String[] args) {
		int[] lista = {1, 7, 3, 4, 6};
		boolean[] primo = new boolean [lista.length];
		
		buscaPrimo(lista);
		compruebaPrimo(lista);
	}
	
	public static void buscaPrimo(int[] lista) {
		for(int i = 0; i < lista.length; i++) {
			if(lista[i] >= 2 && lista[i] % 2 != 0) {
				System.out.println(lista[i] + " es primo");
			} else {
				System.out.println(lista[i] + " no es primo");
			}
		}
	}
	
	public static boolean[] compruebaPrimo(int[] lista) {
		boolean[] primo = new boolean [lista.length];
		for(int i = 0; i < lista.length; i++) {
			if(lista[i] >= 2 && lista[i] % 2 != 0) {
				primo[i] = true;
			}
		}
		return primo;
	}
}
