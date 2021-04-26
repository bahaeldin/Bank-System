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
		Client client = null;
		Account account;
		int num = 20210000;
		while (true) {

			System.out.println("Enter your choice:");
			System.out.println("1: Create account enter 1");
			System.out.println("2: Withdraw enter 2");
			System.out.println("3: Deposit enter 3");
			System.out.println("4: Exit enter 0");
			choice = input.next();
			switch (choice) {
			case "1": {
				System.out.println("===========================<< Create Account >>=============================");
				System.out.println("1: Normal account enter: 1");
				System.out.println("2: Special account enter: 2");
				System.out.println("3: Commercial account enter: 3");
				System.out.println("Enter your choice:");
				choice = input.next();
				switch (choice) {
				case "1": {
					System.out.println("===========================<< Normal Account >>=============================");
					client = new Client();
					System.out.println("Enter your name:");
					input = new Scanner(System.in);
					client.setName(input.nextLine());
					System.out.println("Enter your nationaId:");
					client.setNationaId(input.next());
					System.out.println("Enter your Address:");
					client.setAddress(input.next());
					System.out.println("Enter your phone:");					
					client.setPhone(input.next());					
					account = new Account();
					System.out.println("Enter your Initial balance:");
					input = new Scanner(System.in);
					account.setBalance(input.nextDouble());
					account.setAccountNumber(Integer.toString(num++));
					client.setAccount(account);
					bank.addNewClient(client);				
					System.out.println();
					System.out.println(client);
					System.out.println();
					break;
				}
				case "2": {
					System.out.println("===========================<< Special Account >>=============================");
					client = new Client();
					client = new Client();
					System.out.println("Enter your name:");
					input = new Scanner(System.in);
					client.setName(input.nextLine());
					System.out.println("Enter your nationaId:");
					client.setNationaId(input.next());
					System.out.println("Enter your Address:");
					client.setAddress(input.next());
					System.out.println("Enter your phone:");					
					client.setPhone(input.next());
					account = new SpecialAccount();
					System.out.println("Enter your Initial balance:");
					input = new Scanner(System.in);
					account.setBalance(input.nextDouble());
					account.setAccountNumber(Integer.toString(num++));
					client.setAccount(account);
					bank.addNewClient(client);
					System.out.println();
					System.out.println(client);
					System.out.println();
					break;
				}
				case "3": {
					System.out.println("===========================<< Commercial Account >>=============================");
					client = new CommercialClient();					
					System.out.println("Enter your name:");
					input = new Scanner(System.in);
					client.setName(input.nextLine());					
					System.out.println("Enter your Address:");
					client.setAddress(input.next());
					System.out.println("Enter your phone:");					
					client.setPhone(input.next());
					account = new Account();
					System.out.println("Enter your Initial balance:");
					input = new Scanner(System.in);
					account.setBalance(input.nextDouble());
					account.setAccountNumber(Integer.toString(num++));
					client.setAccount(account);
					bank.addNewClient(client);
					System.out.println();
					System.out.println(client);
					System.out.println();
					break;
				}
				}
				break;
			}
			case "2": {
				System.out.println("===========================<< Withdraw >>=============================");
				System.out.println("Enter the amount:");
				client.getAccount().withdraw(input.nextDouble());
				System.out.println();
				System.out.println(client);
				System.out.println();
				break;
			}
			case "3": {
				System.out.println("===========================<< Deposit >>=============================");
				System.out.println("Enter the amount:");
				client.getAccount().deposit(input.nextDouble());
				System.out.println();
				System.out.println(client);
				System.out.println();
				break;
			}
			}

			if (choice.equals("0"))
				break;
		}
	}
}