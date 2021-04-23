import java.util.Scanner;

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
		Scanner input = new Scanner(System.in);
		// Create a Bank
		Bank bank = new Bank("Cairo","14 downtown new cairo","+22074136");	
		String choice;
		while(true) {
			
			System.out.println("Enter your choice:");
			choice = input.next();	
			
						
			if(choice.equals("0"))
				break;
		}
		
	}

}
