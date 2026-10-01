public class Ej1 {
	public static void main(String[] args) {
		int a = 5;
		int l;
		
		System.out.println("1");
		
		for(int i = 0; i < a - 1; i++) {
			for(l = 1; l <= (i*2+1); l+= 2) {
				
			}
			while(l >= 0) {
				System.out.print((l) + " ");
				l -= 2;
			}
			System.out.println("");
		}
	}
}
