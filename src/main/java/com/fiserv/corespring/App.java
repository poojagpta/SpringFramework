package com.fiserv.corespring;

public class App {
	
	
	public static void main(String str[])
	{
		ServiceWithoutAnn servWithoutAnn = (ServiceWithoutAnn)SpringFactory.getBean("ServiceWithoutAnn");
		servWithoutAnn.performTellerOperation(500);
		
		ServiceWithAnnotation servWithAnn = (ServiceWithAnnotation)SpringFactory.getBean("serviceWithAnnotation");
		servWithAnn.performTellerOperation(500);
		
		
	}

}
