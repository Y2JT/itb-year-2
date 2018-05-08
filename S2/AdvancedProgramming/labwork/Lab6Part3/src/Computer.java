/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 04/03/2017 
 *
 */
public class Computer {
	
	private int speed;
	private int memory;
	private double scrsize;
	
	public Computer(int speed, int memory, double scrsize){
		this.speed = ((speed>0)?speed : 1);
		this.memory = ((memory>0)?memory : 1);
		this.scrsize = ((scrsize>0)?scrsize : 1);
	}//end constructor
	
	public String toString(){
		return "Speed in GHz: " + speed + "\nMemory in GB: " + memory + "\nScreen Size: " + scrsize + "\n\n";
	}//end toString

}//end class
