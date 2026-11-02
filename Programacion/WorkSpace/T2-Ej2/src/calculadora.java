import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char op = '2';

		
		do {
			System.out.println("Introduce 2 numeros");
			System.out.print("1- ");
			double num1 = sc.nextDouble();
			System.out.print("2- ");
			double num2 = sc.nextDouble();
			
			System.out.println("Que operacion quieres realizar?");
			System.out.println("Suma (+)");
			System.out.println("Resta (-)");
			System.out.println("Multiplicacion (x)");
			System.out.println("Division (/)");
			System.out.println("Salir (0)");
			op = sc.next().charAt(0);
			
			if(op == '+') {
				System.out.println(num1 + " + " + num2 + " = " + suma(num1, num2));
			}
			if(op == '-') {
				if(num2 <= num1) {
					System.out.println(num1 + " - " + num2 + " = " + resta(num1, num2));
				} else {
					System.out.println("No se puede restar por que el segundo numero (" + num2 + ") es mayor que el primero (" + num1 + ")");
				}
			}
			if(op == 'x') {
				if(num2 < 1 && num2 > 10) {
					System.out.println("No se puede multiplicar por que el segundo numero (" + num2 + ") no esta comprendido entre 1 y 10");
				} else {
					System.out.println(num1 + " * " + num2 + " = " + multiplicar(num1, num2));
				}
			}
			if(op == '/') {
				if(num2 != 0) {
					System.out.println(num1 + " / " + num2 + " = " + dividir(num1, num2));
				} else {
					System.out.println("No se puede dividir " + num1 + "entre 0");
				}
			}
		}while(op != '0');

	}
	
	public static double suma(double num1, double num2) {
		return(num1 + num2);
		
	}
	
	public static double resta(double num1, double num2) {
		return(num1 - num2);
	}
	
	public static double multiplicar(double num1, double num2) {
		return(num1 * num2);
	}
	public static double dividir(double num1, double num2) {
		return(num1 / num2);
	}
	

}
