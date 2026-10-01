public class Ej2 {
    public static void main(String[] args) {
        int a = 50;
        int b = 2;
        for (int i = a; i >= 0; i -= b) {
            if (i > 0) {
                System.out.print(i + ", ");
            } else {
                System.out.println(i);
            }
        }
    }
}