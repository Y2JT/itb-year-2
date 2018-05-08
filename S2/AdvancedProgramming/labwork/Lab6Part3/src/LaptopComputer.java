/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 04/03/2017 
 *
 */
public class LaptopComputer extends Computer{
	
	private String batterylife;

	public LaptopComputer(int speed, int memory, double scrsize, String batterylife) {
		super(speed, memory, scrsize);
		this.batterylife = batterylife;
	}//end constructor
	
	public String toString(){
		return super.toString() + "\nBattery Life: " + batterylife + "\n";
	}//end toString

}//end class