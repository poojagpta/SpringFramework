package com.fiserv.corespring;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fiserv.corespring.autowire.annotated.Customer;

public class AnnotatedAutoWireBeanIOC {

	private static Log log = LogFactory
			.getLog("com.fiserv.corespring.AnnotatedAutoWireBeanIOC");

	public static void main(String str[]) {
		BeanFactory fac = new ClassPathXmlApplicationContext(
				"AnnotatedAutoWireBeanIOC.xml");
		Customer customer = (Customer) fac.getBean("CustomerBean");
		log.info("####" + customer.getAction());
		log.info("####" + customer.getPerson().getAddress());
	}

}
