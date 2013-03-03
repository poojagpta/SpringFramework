package com.fiserv.corespring;

public interface Account {

	
	public String getAccountBalance();
		
	public String deposit(int amount);
	
	public String withdrawl(int amount);
	
}
