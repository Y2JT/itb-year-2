/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 08/03/2017
 *
 */
public class GenericClassInfoProvider {
	
	public <T> String getSimpleClassName(T type){
		
		return type.getClass().getSimpleName();
	}//end getSimpleClassName
}//end class