/**
 * 
 */
package numbersAndStrings;

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 01/02/2017
 */
public class StringToNumberConverter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String y = "One";
		int result;
		
		result = convertWord(y);
		
		System.out.print(result);

	}//end main
	
	/**
	 * 
	 * @param y
	 * @return
	 */
	public static int convertWord(String y){
		int num;
		
		if(y=="One"){
			num = 1;
		}//end if
		else if(y=="Two"){
			num = 2;
		}//end else if
		else {
			num = 3;
		}//end else
		
		return num;
	}//end convertWord

}//end class