package com.fiserv.corespring;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ServiceWithAnnotation {
	
	@Autowired
	@Qualifier("chequingAccount")
	private Account account;
	
	private static Log log = LogFactory.getLog("com.fiserv.corespring.ServiceWithAnnotation");
	
	
	public void performTellerOperation(int amount)
	{
		//Deposit operation
		String dept=account.deposit(amount);
		log.info(dept);
		
		//Withdrwal operation
		String with=account.withdrawl(amount-10);
		log.info(with);
		
		//Account Balance
		String bal=account.getAccountBalance();
		log.info(bal);
		
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


	/**
	 * 
	 */
	public ServiceWithAnnotation() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param account
	 */
	public ServiceWithAnnotation(Account account) {
		super();
		this.account = account;
	}

}
