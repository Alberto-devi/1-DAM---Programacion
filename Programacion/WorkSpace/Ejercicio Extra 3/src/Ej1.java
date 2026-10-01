
public class Ej1 {
    public static void main(String[] args) {
        int a = 100;
        int b = 4;
        for (int i = 1; i <= a; i++) {
            if (i % b == 0) {
                if (i != a) {
                    System.out.print(i + ", ");
                } else {
                    System.out.print(i);
                }
            }
        }
    }
}
