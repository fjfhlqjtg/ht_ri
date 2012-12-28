package com.fjfhlqjtg.service;

/**
 * 对外服务接口
 *  1、分出合同计算
 *  2、分出临分计算
 *  3、分出理赔计算
 * @author fjfhlqjtg
 * @date 2012-12-28
 */
public interface ReinSuranceService {

	/**
	 * 分出合同计算
	 * @author fjfhlqjtg
	 * @date 2012-12-28
	 * @param xmlStr xml入参
	 * @return 出参报文
	 */
	public String outcontacc(String xmlStr);
	
	/**
	 * 分出临分计算
	 * @author fjfhlqjtg
	 * @date 2012-12-28
	 * @param xmlStr xml入参
	 * @return 出参报文
	 */
	public String outfacacc(String xmlStr);
	
	/**
	 * 分出理赔计算
	 * @author fjfhlqjtg
	 * @date 2012-12-28
	 * @param xmlStr xml入参
	 * @return 出参报文
	 */
	public String outfacclm(String xmlStr);
}
