import java.util.Scanner;
import java.util.Random;

public class Ej1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int secreto = rand.nextInt(50) + 1;
		int intentos = 7;
		int num = 71;
		
		while(intentos != 0 || intentos != secreto) {
			num = sc.nextInt();
			comprobarNum(secreto, num);
			
			
			if(num != secreto) {
				intentos--;
				System.out.println("Vidas restantes: " + intentos);
			}
		}
		
		sc.close();
	}
	
	public static void comprobarNum(int secreto, int num) {
		if(num == secreto) {
			System.out.println("¡¡¡Acertaste!!!");
		} else if (num > secreto) {
			System.out.println("El numero secreto es menor");
		} else {
			System.out.println("El numero secreto es mayor");
		}
	}
}
