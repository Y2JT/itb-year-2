/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 17/03/2017
 *
 */
public class BankTransaction extends Thread{
	
	public static BankAccount bank = new BankAccount(10000);
	
	public void run(){
		bank.makeWithdrawl(10);
		System.out.println(bank.getBalance());
	}//end run

}//end class