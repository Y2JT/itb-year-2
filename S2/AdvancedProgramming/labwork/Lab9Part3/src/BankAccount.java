/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 17/03/2017
 *
 */
public class BankAccount {
	
	int bal;
	
	public BankAccount(int bal){
		this.bal = bal;
	}//end constructor
	
	public void makeWithdrawl(int var){
		bal = bal - var;
	}//end makeWithdrawl
	
	public int getBalance (){
        return bal;
    }//end getBalance

}//end class