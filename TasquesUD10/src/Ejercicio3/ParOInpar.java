/**
 * 
 */
package Ejercicio3;

import java.util.Random;

import Ejercicio2.MiException;

/**
 * @author Víctor Lozano
 *
 */
public class ParOInpar {

	/**
	 * @param numero
	 */
	public ParOInpar() {
		Random rand = new Random();
		int random = rand.nextInt(1000);
		try {
			System.out.println("El numero random es " + random);
			if (random % 2 == 0) {
				throw new MiException(0);
			}else {
				throw new MiException(1);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
}
