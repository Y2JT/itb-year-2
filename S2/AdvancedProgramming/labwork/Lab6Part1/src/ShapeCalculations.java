/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 04/03/2017 
 *
 */
public class ShapeCalculations {
	
	private static final double pi = 3.14159265;
	
	public static double getVolumeOfCylinder(double height, double radius){
		return pi*Math.pow(radius,2) * height;	
	}//end getVolumeOfCylinder
	
	public static double getVolumeOfCube(double size){
		return Math.pow(size,3);
	}//end getVolumeOfCube
	
	public static double getAreaOfSphere(double radius){
		return (4/3) * pi * Math.pow(radius,3);
	}//end getAreaOfSphere

}//end class
