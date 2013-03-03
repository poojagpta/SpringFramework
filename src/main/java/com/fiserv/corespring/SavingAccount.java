package com.fiserv.corespring;

public class SavingAccount implements Account
{

	private String name;
	private int accountId;
	private int balance;
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
	 * @return the accountId
	 */
	public int getAccountId() {
		return accountId;
	}
	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	/**
	 * @return the balance
	 */
	public int getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	public String getAccountBalance()
	{
		return "In SavingAccount accountBalance"+this.balance;
	}
	
	public String deposit(int amount)
	{
		this.balance = amount;
		return "In SavingAccount  deposit"+amount;
	}
	
	public String withdrawl(int amount)
	{
		this.balance -= amount;
		return "In SavingAccount withdrawl"+amount;
	}
	
}
