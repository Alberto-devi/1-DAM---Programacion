public class Ej6 {
    public static void main(String[] args) {
        int a = 257;
        boolean esPrimo = true;
        
        if (a <= 1) {
            esPrimo = false;
        } else {
            for (int c = 2; c < a; c++) {
                if (a % c == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        
        if (esPrimo) {
            System.out.println(a + " es primo");
        } else {
            System.out.println(a + " no es primo");
        }
    }
}