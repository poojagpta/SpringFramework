package com.fiserv.corespring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fiserv.corespring.component.annotated.Customer;

public class ComponentAutoWireBeanIOC {

	public static void main(String str[]) {
		BeanFactory fac = new ClassPathXmlApplicationContext(
				"ComponentAutoWireBeanIOC.xml");
		Customer customer = (Customer) fac.getBean("customer");
		System.out.println("####"+customer.getAction());
	}

}
