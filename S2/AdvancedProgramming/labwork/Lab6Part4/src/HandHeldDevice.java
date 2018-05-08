/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 04/03/2017 
 *
 */
public abstract class HandHeldDevice extends ElectronicDevice{
	
	private int weight;

	public HandHeldDevice(String manufacturer, int weight) {
		super(manufacturer);
		this.weight = weight;
	}//end constructor
	
	public String toString(){
		return super.toString() + "Weight: " + weight;
	}//end toString

}//end class