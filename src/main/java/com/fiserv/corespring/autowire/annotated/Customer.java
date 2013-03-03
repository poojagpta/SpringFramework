package com.fiserv.corespring.autowire.annotated;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer 
{

	private String action;
	private int type;
	@Autowired
	private Person person;
	
	/**
	 * @param action
	 * @param type
	 * @param person
	 */
	public Customer(String action, int type, Person person) {
		super();
		this.action = action;
		this.type = type;
		this.person = person;
	}
	
	
	public Customer() {
		super();
	}
	
	/**
	 * @return the action
	 */
	public String getAction() {
		return action;
	}
	/**
	 * @param action the action to set
	 */
	public void setAction(String action) {
		this.action = action;
	}
	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}
	
	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}
	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
}
