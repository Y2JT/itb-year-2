import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 03/03/2017
 * 
 */
public class Revision1 {
	
	static final Logger LOGGER = Logger.getLogger(Revision1.class.getName());
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = new int[3]; 
		
		try{
			array[3]=1;
		}
		catch(ArrayIndexOutOfBoundsException e){
			LOGGER.log(Level.SEVERE,e.toString(),e);
		}

	}

}
