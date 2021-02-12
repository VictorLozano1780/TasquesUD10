/**
 * 
 */
package Ejercicio4;

/**
 * @author Víctor Lozano
 *
 */
public class CalculosSimples {
	private double num1;
	private double num2;
	/**
	 * @param num1
	 * @param num2
	 */
	public CalculosSimples(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	/**
	 * @return the num1
	 */
	public double getNum1() {
		return num1;
	}
	/**
	 * @param num1 the num1 to set
	 */
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	/**
	 * @return the num2
	 */
	public double getNum2() {
		return num2;
	}
	/**
	 * @param num2 the num2 to set
	 */
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	/**
	 * @param num1
	 * @param num2
	 */
	public double suma(double num1, double num2) {
		return num1 + num2;
	}
	public double resta(double num1, double num2) {
		return num1 - num2;
	}
	public double multiplicacion(double num1, double num2) {
		return num1 * num2;
	}
	public double potencia(double num1, double num2) {
		return Math.pow(num1, num2);
	}
	public double raizCuadrada(double num1) {
		return Math.sqrt(num1);
	}
	public double raizCubica(double num1) {
		return Math.cbrt(num1);
	}
	public double division(double num1, double num2) {
		return num1 / num2;
	}
	
	
}
