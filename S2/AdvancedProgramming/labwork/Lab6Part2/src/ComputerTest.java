/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 04/03/2017 
 *
 */
public class ComputerTest {

	/**
	 * @param args
	 * Print toString from main class
	 */
	public static void main(String[] args) {
		Computer computer1 = new Computer(2,16,15.5);
		Computer computer2 = new Computer(1,8,12.0);
		Computer computer3 = new Computer(4,32,15.0);
		
		System.out.print(computer1.toString());
		System.out.print(computer2.toString());
		System.out.print(computer3.toString());

	}//end main

}//end class