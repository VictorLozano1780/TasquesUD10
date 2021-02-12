/**
 * 
 */
package Ejercicio5;

/**
 * @author V�ctor Lozano
 *
 */
public class Password {
	private final int LONGITUD = 8;
	
	private String contrase�a;
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
	 * @return the contrase�a
	 */
	public String getContrase�a() {
		return contrase�a;
	}

	/**
	 * @param contrase�a
	 * @param longitud
	 */
	public Password(int longitud) {
		this.longitud = longitud;
		this.contrase�a = generarPassword(longitud);
	}

	/**
	 * @param longitud2
	 * @return
	 */
	private String generarPassword(int longitud2) {
		String opciones = "QWERTYUIOPASDFGHJKL��ZXCVBNMqwertyuiopasdfghjkl��zxcvbnm1234567890";
		String contrase�a = "";
		for (int i = 0; i < longitud; i++) {
			contrase�a+= opciones.charAt((int) (Math.random()*opciones.length()));
		}
		return contrase�a;
	}
	
	public boolean esFuerte() {
		int mayuscula = 0;
		int minuscula = 0;
		int numeros = 0;
		for (int i = 0; i < longitud; i++) {
			if(contrase�a.charAt(i) >= 'A' && contrase�a.charAt(i) <= 'Z') {
				mayuscula++;
			} else if(contrase�a.charAt(i) >= 'a' && contrase�a.charAt(i) <= 'z') {
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
		return "Password [contrase�a=" + contrase�a + ", longitud=" + esFuerte() + "]";
	}
	
	
}
