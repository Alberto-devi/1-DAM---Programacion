
public class Ej3 {
	public static void main(String[] args) {
		int num = 50;
		int suma = 0;
		System.out.print("Suma = ");
		for(int i = 1; i <= 50; i++) {
			if(i % 2 == 0) {
				suma += i;
				if (i < num) {
					System.out.print(i + " + ");
				} else {
					System.out.print(i);
				}
			}
		}
		System.out.println(" = " + suma);
	}
}
