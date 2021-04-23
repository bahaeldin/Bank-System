/**
 * 
 */
package client;

import account.Account;

/**
 * @author bahae
 *
 */
public class Client {
	
	private String name;
	private String nationaId;
	private String address;
	private String phone;
	private Account account;
	
	public Client(String name, String nationaId, String address, String phone, Account account) {
		super();
		this.name = name;
		this.nationaId = nationaId;
		this.address = address;
		this.phone = phone;
		this.account = account;
	}

	public Client() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the nationaId
	 */
	public String getNationaId() {
		return nationaId;
	}

	/**
	 * @param nationaId the nationaId to set
	 */
	public void setNationaId(String nationaId) {
		this.nationaId = nationaId;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Client Info:\nName :" + name + "\tNationaId: " + nationaId +
				"\nAddress: " + address + "\tPhone: " + phone + "\n" + account;
	}
	
	
	
}
