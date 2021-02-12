/**
 * 
 */
package Ejercicio2;

/**
 * @author Víctor Lozano
 *
 */
public class Ejercicio2App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			int num = 5;
			if (num > 10) {
				throw new MiException(111);
			} else {
				throw new MiException(222);
			}
		} catch (MiException e) {
			System.out.println(e.getMessage());
		}

	}

}
