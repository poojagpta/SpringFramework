package com.fiserv.corespring;

import org.springframework.stereotype.Component;

@Component
public class ChequingAccount implements Account {
	
	private String name;
	private int accountId;
	private int balance;
	/**
	 * @param name
	 * @param accountId
	 * @param balance
	 */
	public ChequingAccount(String name, int accountId, int balance) {
		super();
		this.name = name;
		this.accountId = accountId;
		this.balance = balance;
	}
	
	/**
	 * 
	 */
	public ChequingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getAccountBalance()
	{
		return "In ChequingAccount accountBalance"+this.balance;
	}
	
	public String deposit(int amount)
	{
		this.balance = amount;
		return "In ChequingAccount  deposit"+amount;
	}
	
	public String withdrawl(int amount)
	{
		this.balance -= amount;
		return "In ChequingAccount withdrawl"+amount;
	}

}
