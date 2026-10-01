
public class Ej4 {
	public static void main(String[] args) {
		int num = 200;
		int mTres = 0;
		int mSiete = 0;
		int ambos = 0;
		
		for(int i = 1; i <= num; i++) {
			if(i % 3 == 0) {
				mTres++;
			}
			if(i % 7 == 0) {
				mSiete++;
			}
			if(i % 7 == 0 && i % 3 == 0) {
				ambos++;
			}
		}
		
		System.out.println("Múltiplos de 3: " + mTres);
		System.out.println("Múltiplos de 7: " + mSiete);
		System.out.println("Múltiplos de 3 y 7: " + ambos);
	}
}
