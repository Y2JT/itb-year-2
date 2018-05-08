package Exception;
/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 22/02/2017
 * 
 */
public class NotMyNetworkException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NotMyNetworkException(String errorMessage){
		super(errorMessage);
	}//end NotMyNetworkException

}//end class