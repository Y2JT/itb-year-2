/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 07/03/2017
 *
 */
public class ThreadWithRunnable implements Runnable{
	
	static int numbers[] = {1,2,3};

	public void run() {
			try{
				for(int i=0;i<10;i++){
					System.out.println("Number: " + numbers[i]);
				}//end for loop
				Thread.sleep((long) (Math.random() *1000));
			}//end try
			catch(InterruptedException e){
				e.printStackTrace();
			}//end catch
			
	}//end run

}//end class
