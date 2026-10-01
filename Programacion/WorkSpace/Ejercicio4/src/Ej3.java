//Imprimer los primero 5 multiplos de 5
public class Ej3 {
    public static void main(String[] args) {
        int num = 5;
        int cam = 0;
        int res = 0;
        
        for(int i = 1; cam < num; i++) {
            if(i % 3 == 0) {
                System.out.print(i);
                res += i;
                cam++;                

                if(cam < num) {
                    System.out.print(" + ");
                } else {
                    System.out.println(" = " + res);
                }
            }
        }
    }
}