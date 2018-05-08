/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 07/03/2017
 *
 */
public class TestThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new ThreadWithRunnable(), "My Thread");
		Thread t2 = new Thread(new ThreadWithRunnable(), "My Thread");
		Thread t3 = new Thread(new ThreadWithRunnable(), "My Thread");
		
		t1.start();
		t2.start();
		t3.start();

	}//end main

}//end class