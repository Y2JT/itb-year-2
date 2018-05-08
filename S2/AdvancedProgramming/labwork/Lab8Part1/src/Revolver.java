/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 24/03/2017
 *
 */
public class Revolver implements Gun{
	
	String serialNumber;
	
	public Revolver(String serialNumber){
		this.serialNumber = serialNumber;
	}//end Revovler
	
	public String getReloadInstructions(){
		String desc = "Reload for " + this.getClass().getSimpleName();
		String step1 = "Pop open the revolving chamber and load bullets";
		String step2 = "Pop the revolving chamber back in place";
		
		return desc + "\n" + step1 + "\n" + step2;
	}//end getReloadInstructions

	@Override
	public String getSerialNumber() {
		// TODO Auto-generated method stub
		return null;
	}

}//end class