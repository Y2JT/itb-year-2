/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 08/03/2017
 *
 */
public class SynchronizedPart1 extends Thread{
	
	static String letters[] = {"A", "B", "C"};
	
	public SynchronizedPart1(String str){
		super(str);
	}
	
	public void run(){
		try{
			for(int i=0;i<10;i++){
				for(int j=0;j<3;j++){
				System.out.println(letters[i] + " " + getName());
				}
			sleep((long)(Math.random() * 1000));
		  }
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
