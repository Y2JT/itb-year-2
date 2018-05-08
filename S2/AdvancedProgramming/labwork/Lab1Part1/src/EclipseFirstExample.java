/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 01/02/2017
 *
 */
public class EclipseFirstExample {
	
	/**
	 * @param args
	 * Print favourite subject
	 */
	public static void main(String[] args) {
		String favsubject = "";
		
		favsubject = favouriteSubject(favsubject);
		
		System.out.print("My favourite subject is: " + favsubject);

	}//end main
	
	/**
	 * 
	 * @param favsubject
	 * @return favsubject to the main method
	 * Set favsubject to your favourite subject
	 */
	public static String favouriteSubject(String favsubject){
		favsubject = "Advanced Programming";
		return favsubject;
	}//end favouriteSubject

}//end class
