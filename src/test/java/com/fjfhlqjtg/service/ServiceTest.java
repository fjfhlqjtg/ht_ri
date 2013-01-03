package com.fjfhlqjtg.service;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ServiceTest {

	private static final String SERVICE_ADDRESS="http://localhost:9999/reinService?wsdl";
	private static ReinSuranceService service=null;
	
	@Before
	public void initService(){
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setAddress(SERVICE_ADDRESS);
		factory.setServiceClass(ReinSuranceService.class);
		service=(ReinSuranceService) factory.create();
	}
	
	@Test
	public void testOutContAcc(){
		String msg=service.outcontacc("");
		System.out.println(msg);
	}
	
	@After
	public void destroy(){
		service=null;
	}
}
