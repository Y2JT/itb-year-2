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
		
		ThreadWithExtends thread1 = new ThreadWithExtends("1");
		ThreadWithExtends thread2 = new ThreadWithExtends("2");
		ThreadWithExtends thread3 = new ThreadWithExtends("3");
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
