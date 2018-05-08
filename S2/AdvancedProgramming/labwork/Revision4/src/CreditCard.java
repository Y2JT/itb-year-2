/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 19/03/2017 
 *
 */
public class CreditCard {
	
	private String nameOnCard;
	private String expiryDate;
	private String dateOfIssue;
	private int cvnNumber;
	
	public CreditCard(String nameOnCard, String expiryDate, String dateOfIssue, int cvnNumber){
		this.nameOnCard = nameOnCard;
		this.expiryDate = expiryDate;
		this.dateOfIssue = dateOfIssue;
		this.cvnNumber = cvnNumber;
	}//end constructor 1
	
	public CreditCard(String nameOnCard, String expiryDate, String dateOfIssue){
		this.nameOnCard = nameOnCard;
		this.expiryDate = expiryDate;
		this.dateOfIssue = dateOfIssue;
	}//end constructor 2
	
	public CreditCard(String nameOnCard, String expiryDate){
		this.nameOnCard = nameOnCard;
		this.expiryDate = expiryDate;
	}//end constructor 3
	
	public String toString(){
		return "Name on Card: " + nameOnCard + "\nExpiry Date: " + expiryDate + "\nDate of Issue: " + dateOfIssue + "\nCVN Number: " + cvnNumber + "\n";
	}//end toString

}//end class