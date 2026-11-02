package B;

class Hobbits {

    String name;

    public static void main(String [] args) {

        Hobbits [] h = new Hobbits[3];
        int z = 0;

        while (z < 3) { //Ponemos que unicamente se ejecute 3 veces ya que es el numero de posiciones del array
            h[z] = new Hobbits();
            h[z].name = "bilbo";
            if (z == 1) {
                h[z].name = "frodo";
            }
            if (z == 2) {
                h[z].name = "sam";
            }
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");
            
            z = z + 1; //Esto que estaba en la primera linea de la ejecucion del bucle lo pasamos al final, por que si no, se salta la primera posicion del array.
        }
    }
}