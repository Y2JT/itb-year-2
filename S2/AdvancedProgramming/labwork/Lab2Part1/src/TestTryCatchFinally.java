/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 08/02/2017
 * 
 */
public class TestTryCatchFinally {
	
	public static void main(String args[]){
		String s = "H";
		
		try{
			Integer.parseInt(s);
		}
		catch (NumberFormatException e){
			e.printStackTrace();
		}
		finally{
			System.out.println("Joseph Tierney");
		}
	}//end main

}//end class
