public class Ej5 {
	public static void main(String[] args) {
		int num = 50;
		int big = 0;
		int small = num;
		int suma = 0;
		for(int i = 1; i <= num; i++) {
			if (i < small) {
				small = i;
			}
			if (i > big) {
				big = i;
			}
			suma += i;
		}
		System.out.println("El mas grande: " + big);
		System.out.println("El mas pequeño: " + small);
		System.out.println("La suma de todos ellos: " + suma);
	}
}
