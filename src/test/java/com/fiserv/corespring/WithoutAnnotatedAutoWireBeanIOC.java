package com.fiserv.corespring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fiserv.corespring.autowire.withoutannotated.Customer;

public class WithoutAnnotatedAutoWireBeanIOC {

	public static void main(String str[]) {
		BeanFactory fac = new ClassPathXmlApplicationContext(
				"WithoutAnnotatedAutoWireBeanIOC.xml");
		Customer customer = (Customer) fac.getBean("CustomerBean");
		System.out.println("####"+customer.getAction());
		System.out.println("####"+customer.getPerson().getAddress());
	}

}
