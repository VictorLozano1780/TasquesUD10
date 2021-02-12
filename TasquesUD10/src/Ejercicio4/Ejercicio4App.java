/**
 * 
 */
package Ejercicio4;

import java.util.Scanner;

/**
 * @author Víctor Lozano
 *
 */
public class Ejercicio4App {
	public static Scanner in = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Operador 1");
			double num1 = in.nextDouble();
			System.out.println("Operador 2");
			double num2 = in.nextDouble();
			CalculosSimples calc = new CalculosSimples(num1, num2);
			System.out.println(calc.suma(num1, num2));
			System.out.println(calc.resta(num1, num2));
			System.out.println(calc.division(num1, num2));
			System.out.println(calc.multiplicacion(num1, num2));
			System.out.println(calc.potencia(num1, num2));
			System.out.println(calc.raizCuadrada(num1));
			System.out.println(calc.raizCubica(num1));
		} catch (Exception e) {
			System.out.println(e);
			in.nextLine();
		}

	}

}
