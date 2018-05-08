/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 07/03/2017
 *
 */
public class ThreadWithExtends extends Thread{
	
	static String letters[] = {"A", "B", "C"};
	
	public ThreadWithExtends(String str){
		super(str);
	}
	
	public void run(){
			try{
				for(int i=0;i<10;i++){
					
					System.out.println(letters[i] + " " + getName());
					
				sleep((long)(Math.random() * 1000));
			}
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
