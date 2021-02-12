package Ejercicio1;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Víctor Lozano
 *
 */
public class TasquesUD10_1 {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		opciones();
	}

	/**
	 */
	private static void opciones() {
		int numRandom = numeroRandom();
		int intentos = 1;
		boolean continua = true;
		while (continua) {
			try {
				System.out.println("Pon un numero entre 0 y 500");
				int numero = in.nextInt();
				if(numero == numRandom) {
					System.out.println("Has necesitado " + intentos + " intentos para acerta el numero");
					continua = false;
				} else if(numero > numRandom) {
					System.out.println("El numero es menor");
					intentos++;
				}else {
					System.out.println("El numero es mayor");
					intentos++;
				}
				} catch (InputMismatchException e) {
				System.out.println("Has puesto un dato incorrecto");
				intentos++;
				in.nextLine();
			}
		}
	}

	/**
	 * @return 
	 * 
	 */
	private static int numeroRandom() {
		int num = (int) (Math.random() * 500);
		System.out.println(num);
		return num;
		
	}
}
