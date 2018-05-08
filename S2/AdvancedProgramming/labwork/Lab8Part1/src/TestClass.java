/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 24/03/2017
 *
 */
public class TestClass {
	
	public static void main(String[] args){
		Gun peacemaker1 = new Revolver("B12345678");
		Gun peacemaker2 = new SemiAutomatic("A12345678");
		Gun peacemaker3 = new Cannon("C12345678");
		
		System.out.println(peacemaker1.getReloadInstructions() + "\n");
		System.out.println(peacemaker2.getReloadInstructions() + "\n");
		System.out.println(peacemaker3.getReloadInstructions() + "\n");
		
	}//end main

}//end class