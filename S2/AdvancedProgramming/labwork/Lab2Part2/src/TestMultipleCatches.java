/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 08/02/2017
 * 
 */
public class TestMultipleCatches {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String myArray[] = {"Joey", "Joseph", "Joe", "Jo"};
		//String s = null;
		
		try{
			System.out.println(myArray[5]);
			//s.toString();
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("The array out of bounds catch statement was executed");
		}
		catch(NullPointerException e){
			System.out.println("Null Pointer Error");
		}
		catch(Exception e){
			System.out.println("Exception error");
		}

	}//end main

}//end class
