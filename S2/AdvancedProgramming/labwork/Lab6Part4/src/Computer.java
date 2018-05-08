/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 04/03/2017 
 *
 */
public class Computer extends ElectronicDevice{
	
	private int speed;
	private int memory;
	private double scrsize;

	public Computer(String manufacturer, int speed, int memory, double scrsize) {
		super(manufacturer);
		this.speed = ((speed>0)?speed : 1);
		this.memory = ((memory>0)?memory : 1);
		this.scrsize = ((scrsize>0)?scrsize : 1);
	}//end constructor
	
	public String toString(){
		return super.toString() + "Speed in GHz: " + speed + "\nMemory in GB: " + memory + "\nScreen Size: " + scrsize;
	}//end toString

}//end class