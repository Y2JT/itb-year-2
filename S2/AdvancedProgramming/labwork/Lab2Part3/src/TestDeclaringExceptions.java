import java.io.File;
import java.io.IOException;

/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 08/02/2017
 * 
 */
public class TestDeclaringExceptions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		reverseString(null);
		try{
			openFile(null);
		}
		catch (IOException e){
			
		}
	}//end main
	
	public static String reverseString(String name) throws NullPointerException{
		String s = "Joey Tierney";
		s = new StringBuffer(s).reverse().toString();
		System.out.println(s);
		return s;
	}//end reverseString
	
	public static String openFile(String FileName) throws IOException{
		
		File file = new File(FileName);
		
		if(file.exists()){
			System.out.println("File exists");
		}
		else{
			System.out.print("Nope");
		}
		
		return FileName;
		
	}//end openFile
}//end class