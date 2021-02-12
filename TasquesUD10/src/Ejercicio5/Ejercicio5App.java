/**
 * 
 */
package Ejercicio5;

import java.util.Scanner;

/**
 * @author Víctor Lozano
 *
 */
public class Ejercicio5App {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		try {
			System.out.println("Longitud del array");
			int array = in.nextInt();
			System.out.println("Longitud de la contraseña");
			int pass = in.nextInt();
			Password contra[] = new Password[array];
			boolean fuertes[] = new boolean[array];
			generaNumeros(contra, pass, fuertes);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	/**
	 * @param contra
	 * @param pass 
	 * @param fuertes 
	 */
	private static void generaNumeros(Password[] contra, int pass, boolean[] fuertes) {
		for (int i = 0; i < contra.length; i++) {
			contra[i] = new Password(pass);
			fuertes[i] = contra[i].esFuerte();
			System.out.println(contra[i].getContraseña() + "\t" + fuertes[i]);
		}
	}
}
