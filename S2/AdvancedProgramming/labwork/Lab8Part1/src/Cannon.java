/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 24/03/2017
 *
 */
public class Cannon implements Gun{

	String serialNumber;
	
	public Cannon(String serialNumber) {
		this.serialNumber = serialNumber;
	}//end Cannon

	@Override
	public String getReloadInstructions() {
		String desc = "Reload for " + this.getClass().getSimpleName();
		String step1 = "Put cannon ball into cannon";
		String step2 = "Stuff down with that weird stick thing";
		
		return desc + "\n" + step1 + "\n" + step2;
	}//end getReloadInstructions

	@Override
	public String getSerialNumber() {
		// TODO Auto-generated method stub
		return null;
	}

}//end class