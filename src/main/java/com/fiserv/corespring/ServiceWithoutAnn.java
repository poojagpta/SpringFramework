package com.fiserv.corespring;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ServiceWithoutAnn {

	private static Log log = LogFactory
			.getLog("com.fiserv.corespring.ServiceWithoutAnn");

	private Account account;

	/**
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}

	/**
	 * @param account
	 *            the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
	}

	public void performTellerOperation(int amount) {
		// Deposit operation
		String dept = account.deposit(amount);
		log.info(dept);

		// Withdrwal operation
		String with = account.withdrawl(amount - 10);
		log.info(with);

		// Account Balance
		String bal = account.getAccountBalance();
		log.info(bal);

	}

}
