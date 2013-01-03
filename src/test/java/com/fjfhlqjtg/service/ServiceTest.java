package com.fjfhlqjtg.service;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ServiceTest {

	private static final String SERVICE_ADDRESS="http://localhost:9999/reinService?wsdl";
	private static ReinSuranceService service=null;
	private static Validator validator=null;
	
	@Before
	public void init(){
		ValidatorFactory validatorFactory=Validation.buildDefaultValidatorFactory();
		validator=validatorFactory.getValidator();
		
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
