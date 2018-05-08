/**
 * 
 */
package application;

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 01/02/2017
 * 
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 42;
		
		int ans = mathematics.MathHelper.toThePowerOf(num1, num2);
		
		System.out.println(ans);
	}//end main

}//end class