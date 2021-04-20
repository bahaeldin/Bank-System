package account;

public class Account {
	private double balance;
	private int accountNumber;

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
	public int getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Account(double balance, int accountNumber) {
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	public void withdraw(double amount) {

	}

	public void deposit(double amount) {

	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + ", accountNumber=" + accountNumber + "]";
	}

}
