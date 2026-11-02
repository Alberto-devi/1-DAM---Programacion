import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		int aux;
		char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		Persona p = new Persona();
		p.obtenDatos();
		
		aux = p.dni % 23;
		if(aux < 0 || aux > 22) {
			JOptionPane.showMessageDialog(null, "El DNI no es valido");
		} else {
			p.nif = letras[aux];
			p.muestraDatos();
		}
	}

}