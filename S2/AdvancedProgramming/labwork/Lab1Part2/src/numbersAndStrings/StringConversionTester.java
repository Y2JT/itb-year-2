/**
 * 
 */
package numbersAndStrings;

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 01/02/2017
 */
public class StringConversionTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String con = numbersAndStrings.NumberToStringConverter.convertNo(1);
		int num = numbersAndStrings.StringToNumberConverter.convertWord("One");
		
		System.out.println(con);
		System.out.println(num);
	}//end main

}//end cass