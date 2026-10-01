// Muestra todos los numeros decimales del 1 al 5, utilizando variables enteras
public class Ej4 {
	public static void main(String[] args) {
		int entero = 5;
		
		for(int i = 0; i < entero; i++) {
			
			for(int j = 0; j < 10; j++) {
				
				if(j == 9) {
					System.out.println(i + "." + j);
				} else {
					System.out.print(i + "." + j + " - ");
				}
			}
		}
	}
}
