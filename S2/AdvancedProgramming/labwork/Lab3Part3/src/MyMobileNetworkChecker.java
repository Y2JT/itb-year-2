/**
 * 
 */
import Exception.NotMyNetworkException;
/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 22/02/2017
 * 
 */
public class MyMobileNetworkChecker {
	
	public static String mobileNetworks[] = {"Meteor", "O2", "Three"};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			checkMyMobileException("Meteor");
		}
		catch(NotMyNetworkException e){
			e.printStackTrace();
		}
	}//end main

	public static void checkMyMobileException(String network) throws NotMyNetworkException {
		for(int i = 0;i<mobileNetworks.length;i++){
			if(network.equals(mobileNetworks[i])){
				System.out.print("Network matches with current network");
				return;
			}
		}
		
		throw new NotMyNetworkException("This network doesn't match the current network");
		
	}//end checkMyMobileException

}//end class