import javax.swing.JOptionPane;

public class Persona {
	String nombre;
	int dni;
	char nif;
	
	void obtenDatos() {
		nombre = JOptionPane.showInputDialog("Introduce tu nombre:");
		String dniString = JOptionPane.showInputDialog("Introduce tu DNI:");
		dni = Integer.parseInt(dniString);
	}
	
	void muestraDatos() {
		String mensaje = "Nombre: " + nombre + "\n" +
		                 "DNI: " + dni + "\n" +
		                 "NIF: " + dni + nif;
		JOptionPane.showMessageDialog(null, mensaje);
	}
}