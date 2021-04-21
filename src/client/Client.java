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
	private int nationaId;
	private String address;
	private String phone;
	private Account account;
	
	public Client(String name, int nationaId, String address, String phone, Account account) {
		super();
		this.name = name;
		this.nationaId = nationaId;
		this.address = address;
		this.phone = phone;
		this.account = account;
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
	public int getNationaId() {
		return nationaId;
	}

	/**
	 * @param nationaId the nationaId to set
	 */
	public void setNationaId(int nationaId) {
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
		return "Client [name=" + name + ", nationaId=" + nationaId + ", address=" + address + ", phone=" + phone
				+ ", account=" + account + "]";
	}
	
	
	
}
