/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 15/02/2017
 * 
 */
public class NestedTryCatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			try{
				int x[] = new int[5];
				x[15] = 4;
				
				int y = 30 / 0;
				System.out.println("y = " + y);
			}
			catch (ArithmeticException e){
				e.printStackTrace();
			}
			System.out.println("Nested Try-Catch Example");
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
		System.out.println("Print me!");
	}//end main

}//end class