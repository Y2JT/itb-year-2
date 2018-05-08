/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 17/03/2017
 *
 */
public class RunBank {
	
	public static void main(String[] args){
		for(int i=0; i<1000; i++){
			BankTransaction thread = new BankTransaction();
            thread.run();
		}//end for loop
	}//end main

}//end class