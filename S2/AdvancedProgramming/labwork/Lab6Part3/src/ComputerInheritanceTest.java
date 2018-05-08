/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 04/03/2017 
 *
 */
public class ComputerInheritanceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Computer comp1 = new Computer(2,16,15.5);
		Computer comp2 = new Computer(4,8,13.0);
		
		LaptopComputer laptop1 = new LaptopComputer(2,16,15.5,"9 hours");
		LaptopComputer laptop2 = new LaptopComputer(4,8,13.0,"6 hours");
		
		System.out.print(comp1.toString());
		System.out.print(comp2.toString());
		System.out.print(laptop1.toString());
		System.out.print(laptop2.toString());

	}//end main

}//end class