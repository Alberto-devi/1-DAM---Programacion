public class Ej7 {
    public static void main(String[] args) {
        int a = 10;
        int suma = 0;
        int contador = 0;
        
        // Este bucle se ejecutara hasta que lleguemos al numero puesto en la variable a.
        for(int i = 2; contador <= a; i++) {
            boolean esPrimo = true;
            
            //Este bucle lo que hace es que divide todos los numeros de la variable i hasta llegar al mismo numero que hay en i.
            for(int b = 2; b < i; b++) {
                if (i % b == 0) {
                    esPrimo = false;
                    break;
                }
            }
            
            if (esPrimo && contador != 10) {
                System.out.print(i + ", ");
                suma += i;
                contador ++;
            }
        }
        
        System.out.println(suma);
    }
}