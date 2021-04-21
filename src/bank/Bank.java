/*
 * 
 * @Author Bahaeldin Bahar
 * 
 */

package bank;

import java.util.ArrayList;

import account.Account;
import client.Client;

public class Bank {
	
	private String name;
	private String address;
	private String phone;
	private ArrayList<Account> accounts;
	private ArrayList<Client> clients;
	
	/**
	 * @param name
	 * @param address
	 * @param phone
	 */
	
	public Bank(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		accounts = new ArrayList<Account>();
		clients = new ArrayList<Client>();
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
	
}
