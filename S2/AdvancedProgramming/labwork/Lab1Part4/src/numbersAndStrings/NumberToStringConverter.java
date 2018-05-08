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
	
	public static String result = "";

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 0;
		
		result = convertNo(input);
	}//end main
	
	/**
	 * 
	 * @param x
	 * @return String version of number
	 * 
	 */
	public static String convertNo(int x){
		int num = x;
		
		if(x==1){
			result = "One";
			return result;
		}//end if
		else if(x==2){
			result = "Two";
			return result;
		}//end else if
		else{
			result = "Three";
			return result;
		}//end else
	}//end convertNo

}//end class