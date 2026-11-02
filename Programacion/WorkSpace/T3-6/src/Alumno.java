public class Alumno {
	String nombre;
	int nota;
	String aux;
	
	String felicitar() {
		aux = "¡¡¡Enhorabuena!!! ¡¡¡Has aprobado!!!";
		return aux;
	}
	
	String animar() {
		aux = "Has suspendido.... Pero animo!!! ¡¡¡No te rindas o acabaras siendo influencer!!!";
		return aux;
	}
}
