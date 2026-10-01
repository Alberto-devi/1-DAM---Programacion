//Muestra la tabla de multiplicar del 1 al 10
public class Ej2 {
	public static void main(String[] args) {
		int num = 10;
		
		System.out.println("|____________________________");
		System.out.println("TABLAS DE MULTIPLICAR");
		for(int i = 1; i <= num; i++) {
			System.out.println("|____________________________");
			for(int j = 0; j <= 10; j++) {
				int aux = i * j;
				System.out.println("|" + i + " * " + j + " = " + aux);
			}
		}
		System.out.println("|____________________________");
	}
}
