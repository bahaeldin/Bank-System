/**
 * 
 */
package account;

/**
 * @author bahae
 *
 */
public class SpecialAccount extends Account{

	public SpecialAccount(double balance, String accountNumber) {
		super(balance, accountNumber);		
	}

	public SpecialAccount() {
		super();
	}
	
	public void withdraw(double amount) {
		if (this.getBalance() - amount >= -1000 ) {
			double newBalance = this.getBalance() - amount;
			this.setBalance(newBalance);			
			System.out.println("Done successfully!\nYour Balance is : " + this.getBalance() + "$");
		} else {
			System.out.println("Sorry! You don't have enogh balance");
		}
	}

}
