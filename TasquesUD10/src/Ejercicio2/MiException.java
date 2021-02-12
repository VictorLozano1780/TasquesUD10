/**
 * 
 */
package Ejercicio2;

/**
 * @author Víctor Lozano
 *
 */
@SuppressWarnings("serial")
public class MiException extends Exception{
	private int codigoExcepcion;
	/**
	 * @param a
	 */
	public MiException(int codigoExcepcion) {
		super();
		this.codigoExcepcion = codigoExcepcion;
	}
	
	public MiException() {
		super();
	}

	@Override
	public String getMessage() {
		String mensaje = "";
		switch(codigoExcepcion) {
		case 111:
			mensaje = "Excepcion 111: El numero es mayor";
			break;
		case 222:
			mensaje = "Excepcion 222: El numero es menor";
			break;
		case 0:
			mensaje = "El numero es par";
			break;
		case 1:
			mensaje = "El numero es impar";
			break;
		}
		
		
		return mensaje;
	}
	
}
