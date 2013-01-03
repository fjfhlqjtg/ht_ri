package com.fjfhlqjtg.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * 对外服务接口
 *  1、分出合同计算
 *  2、分出临分计算
 *  3、分出理赔计算
 * @author fjfhlqjtg
 * @date 2012-12-28
 */
@WebService(name="reinService")
@SOAPBinding(style=Style.RPC)
public interface ReinSuranceService {

	/**
	 * 分出合同计算
	 * @author fjfhlqjtg
	 * @date 2012-12-28
	 * @param xmlStr xml入参
	 * @return 出参报文
	 */
	@WebMethod
	public String outcontacc(@WebParam(name="xmlStr")String xmlStr);
	
	/**
	 * 分出临分计算
	 * @author fjfhlqjtg
	 * @date 2012-12-28
	 * @param xmlStr xml入参
	 * @return 出参报文
	 */
	@WebMethod
	public String outfacacc(@WebParam(name="xmlStr")String xmlStr);
	
	/**
	 * 分出理赔计算
	 * @author fjfhlqjtg
	 * @date 2012-12-28
	 * @param xmlStr xml入参
	 * @return 出参报文
	 */
	@WebMethod
	public String outfacclm(@WebParam(name="xmlStr")String xmlStr);
}
