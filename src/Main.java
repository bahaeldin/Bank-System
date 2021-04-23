import account.Account;
import account.SpecialAccount;
import bank.Bank;
import client.Client;
import client.CommercialClient;

/**
 * 
 * @author Bahaeldin Bahar Date : 19/4/2021
 *
 */
public class Main {

	/**
	 * 
	 * @param args
	 * 
	 */
	public static void main(String[] args) {

		// Create a Bank
		Bank bank = new Bank();

		Account account = new Account();
		Account account1 = new SpecialAccount(0,"0001");

		System.out.println(account1);
		//account.deposit(100);
		//account1.deposit(100);
		account1.withdraw(10000);
		Client client = new CommercialClient();
		System.out.println(client);

	}

}
