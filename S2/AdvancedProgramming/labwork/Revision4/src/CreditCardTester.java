/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 19/03/2017 
 *
 */
public class CreditCardTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CreditCard c1 = new CreditCard("Joey Tierney","02/12","02/20",111);
		CreditCard c2 = new CreditCard("Dean Ambrose","11/10","11/17");
		CreditCard c3 = new CreditCard("Tim Phillip","05/16");
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());

	}//end main

}//end class