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
		
		SynchronizedPart1 thread1 = new SynchronizedPart1("");
		SynchronizedPart1 thread2 = new SynchronizedPart1("");
		SynchronizedPart1 thread3 = new SynchronizedPart1("");
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
