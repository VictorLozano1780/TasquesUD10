/**
 * 
 */
package Ejercicio5;

/**
 * @author Víctor Lozano
 *
 */
public class Password {
	private final int LONGITUD = 8;
	
	private String contraseña;
	private int longitud;
	
	/**
	 * 
	 */
	public Password() {
		this.longitud = LONGITUD;
	}

	/**
	 * @return the longitud
	 */
	public int getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	/**
	 * @return the contraseña
	 */
	public String getContraseña() {
		return contraseña;
	}

	/**
	 * @param contraseña
	 * @param longitud
	 */
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarPassword(longitud);
	}

	/**
	 * @param longitud2
	 * @return
	 */
	private String generarPassword(int longitud2) {
		String opciones = "QWERTYUIOPASDFGHJKLÑÇZXCVBNMqwertyuiopasdfghjklñçzxcvbnm1234567890";
		String contraseña = "";
		for (int i = 0; i < longitud; i++) {
			contraseña+= opciones.charAt((int) (Math.random()*opciones.length()));
		}
		return contraseña;
	}
	
	public boolean esFuerte() {
		int mayuscula = 0;
		int minuscula = 0;
		int numeros = 0;
		for (int i = 0; i < longitud; i++) {
			if(contraseña.charAt(i) >= 'A' && contraseña.charAt(i) <= 'Z') {
				mayuscula++;
			} else if(contraseña.charAt(i) >= 'a' && contraseña.charAt(i) <= 'z') {
				minuscula++;
			} else {
				numeros++;
			}
		}
		if(mayuscula >= 2 && minuscula >= 1 && numeros >= 5) {
			return true;
		}return false;
	}

	@Override
	public String toString() {
		return "Password [contraseña=" + contraseña + ", longitud=" + esFuerte() + "]";
	}
	
	
}
