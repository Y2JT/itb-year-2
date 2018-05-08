/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 04/03/2017 
 *
 */
public class MobilePhone extends HandHeldDevice{
	
	private String networkName;

	public MobilePhone(String manufacturer, int weight, String networkName) {
		super(manufacturer, weight);
		this.networkName = networkName;
	}//end constructor
	
	public String toString(){
		return super.toString() + "Network: " + networkName;
	}//end toString

}//end class