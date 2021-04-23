/**
 * 
 */
package client;

import account.Account;

/**
 * @author bahae
 *
 */
public class CommercialClient extends Client {
	private String commercialID;

	/**
	 * @param name
	 * @param nationaId
	 * @param address
	 * @param phone
	 * @param account
	 * @param commercialID
	 */
	public CommercialClient(String name, String nationaId, String address, String phone, Account account,
			String commercialID) {
		super(name, "00000000000000", address, phone, account);
		this.commercialID = commercialID;
	}

	public CommercialClient() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the commercialID
	 */
	public String getCommercialID() {
		return commercialID;
	}

	/**
	 * @param commercialID the commercialID to set
	 */
	public void setCommercialID(String commercialID) {
		this.commercialID = commercialID;
	}

	@Override
	public String toString() {
		return "Client Info:\nName: " + this.getName() + "\tNationaId: " + 
				"\tCommercialID: "+ commercialID + this.getNationaId() +
				"\nAddress: " + this.getAddress() + "\tPhone: " + this.getPhone() +
				"\n" + this.getAccount();
	}
	
	
	
}
