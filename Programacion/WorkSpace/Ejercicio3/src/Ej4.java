public class Ej4 {
	public static void main(String[] args) {
		int a = 25;
		boolean b = false;
		if(a % 2 == 0) {
			b = true;
		}
		for(int i = 1; i <= a; i++) {
			if(i % 2 == 0) {
				if(b == true && i == a) {
					System.out.println(i);
				} else if(b == false && i == a - 1) {
					System.out.print(i);
				} else {
					System.out.print(i + ", ");
				}
			}
		}
	}
}
