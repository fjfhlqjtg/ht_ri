package com.fjfhlqjtg.service.impl;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.fjfhlqjtg.service.ReinSuranceService;

@WebService(endpointInterface="com.fjfhlqjtg.service.impl.ReinServiceImpl")
@SOAPBinding(style=Style.RPC)
public class ReinSuranceServiceImpl implements ReinSuranceService{

	@Override
	public String outcontacc(String xmlStr) {
		return "hello,in outcontacc."+xmlStr;
	}

	@Override
	public String outfacacc(String xmlStr) {
		return null;
	}

	@Override
	public String outfacclm(String xmlStr) {
		return null;
	}

}
