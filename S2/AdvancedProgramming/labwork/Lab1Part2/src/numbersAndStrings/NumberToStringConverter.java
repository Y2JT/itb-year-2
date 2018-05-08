/**
 * 
 */
package numbersAndStrings;

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 01/02/2017
 *
 */
public class NumberToStringConverter {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		int x = 1;
		String result;
		
		result = convertNo(x);
		
		System.out.print(result);
	}//end main
	
	/**
	 * 
	 * @param x
	 * @return String version of number
	 * 
	 */
	public static String convertNo(int x){
		String num;
		
		if(x==1){
			num = "One";
		}//end if
		else if(x==2){
			num = "Two";
		}//end else if
		else{
			num = "Three";
		}//end else
		
		return num;
	}//end convertNo

}//end class