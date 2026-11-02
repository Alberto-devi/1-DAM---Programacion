import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Cuantos alumnos vas a registrar? ");
        int cant = sc.nextInt();
        sc.nextLine();

        Alumno[] lista = new Alumno[cant];

        for (int i = 0; i < cant; i++) {
            lista[i] = new Alumno();
            
            System.out.print("Nombre del alumno " + (i + 1) + ": ");
            lista[i].nombre = sc.nextLine();
            
            System.out.print("Nota del alumno " + (i + 1) + ": ");
            lista[i].nota = sc.nextInt();
            sc.nextLine();
        }
        
        System.out.printf("%-15s %-6s %s%n", "Alumno", "Nota", "Mensaje");

        for (int i = 0; i < cant; i++) {
            String mensaje;
            if (lista[i].nota >= 5) {
                mensaje = lista[i].felicitar();
            } else {
                mensaje = lista[i].animar();
            }
            System.out.printf("%-15s %-6d %s%n", lista[i].nombre, lista[i].nota, mensaje);
        }
        
        sc.close();
    }
}
