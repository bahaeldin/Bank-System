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
		Bank bank = new Bank("Cairo", "14 downtown new cairo", "+22074136");
		String choice;
		while (true) {

			System.out.println("Enter your choice:");
			System.out.println("1: Create account enter 1");
			System.out.println("2: Exit enter 0");
			choice = input.next();
			switch (choice) {
			case "1": {
				Client client;
				Account account;
				System.out.println("Normal account enter: 1");
				System.out.println("Commercial account enter: 1");
				choice = input.next();

				switch (choice) {
				case "1": {
					client = new Client();
					System.out.println("Enter your name:\n");
					input = new Scanner(System.in);
					client.setName(input.nextLine());
					System.out.println("Enter your nationaId:\n");
					client.setNationaId(input.next());
					System.out.println("Enter your Address:\n");
					client.setAddress(input.next());
					System.out.println("Enter your phone:\n");
					client.setPhone(input.next());
					System.out.println("For normal account enter: 1");
					System.out.println("For speical account enter: 2");
					switch (choice) {
					case "1": {
						int num = 1000;
						account = new Account();
						System.out.println("Enter your Initial balance:\n");
						input = new Scanner(System.in);
						account.setBalance(input.nextDouble());
						account.setAccountNumber(Integer.toString(num++));
						client.setAccount(account);
						break;
					}
					case "2": {
						int num = 2000;
						account = new Account();
						System.out.println("Enter your Initial balance:\n");
						input = new Scanner(System.in);
						account.setBalance(input.nextDouble());
						account.setAccountNumber(Integer.toString(num++));
						client.setAccount(account);
						break;
					}
					}
					break;
				}
				case "2": {
					System.out.println("speical account");
					break;
				}
				default:
					System.out.println("wrong input!");
				}
				break;
			}
			default:

			}

			if (choice.equals("0"))
				break;
		}

	}

}
