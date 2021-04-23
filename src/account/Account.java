/*
 * @author 
 * 
 **/
package account;

public class Account {
	private double balance;
	private String accountNumber;

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Account(double balance, String accountNumber) {
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount < balance) {
			balance -= amount;
			System.out.println("Done successfully!\nYour Balance is : " + balance + "$");
		} else {
			System.out.println("Sorry! You don't have enogh balance");
		}
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Done successfully!\nYour Balance is : " + balance + "$");
		}
	}

	@Override
	public String toString() {
		return "Account Number: " + accountNumber + "\tBalance: " + balance + "$";
	}

}
