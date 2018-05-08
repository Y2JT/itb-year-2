/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 04/03/2017 
 *
 */
public abstract class ElectronicDevice {
	
	private String manufacturer;
	
	public ElectronicDevice(String manufacturer){
		this.manufacturer = manufacturer;
	}//end constructor
	
	public String toString(){
		return "\n Manufacturer: " + manufacturer;
	}//end toString

}//end class