package com.fiserv.corespring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SpringFactory {

	public static Object getBean(String beanName) {
		// BeanFactory fac = new XmlBeanFactory(new FileSystemResource("src\\main\\resources\\bean.xml"));

		BeanFactory fac = new XmlBeanFactory(new ClassPathResource("bean.xml"));
		return fac.getBean(beanName);
		// AbstractApplicationContext aac = new ClassPathXmlApplicationContext("bean.xml");
		// aac.registerShutdownHook();
		//return aac.getBean(beanName);
	}

}
