package com.fjfhlqjtg.utils;

/**
 * 返回信息工具类
 * 
 * @author fjfhlqjtg
 * 
 */
public class MsgUtil {

	/**
	 * 构建出参信息
	 * 
	 * @author fjfhlqjtg
	 * @param serviceName
	 *            服务名称
	 * @param serviceType
	 *            服务编号
	 * @param errorCode
	 *            错误编号
	 * @param errorMsg
	 *            错误信息
	 * @return 出参xml字符串
	 */
	public static String buildReturnMsg(String serviceName, String serviceType,
			String errorCode, String errorMsg) {
		return "<?xml version='1.0' encoding='UTF-8'?>" + "<" + serviceName
				+ ">" + "<SERVICE_TYPE>" + serviceType + "</SERVICE_TYPE>"
				+ "<ERROR_CODE>" + errorCode + "</ERROR_CODE>"
				+ "<ERROR_MESSAGE>" + errorMsg + "</ERROR_MESSAGE>" + "</"
				+ serviceName + ">";
	}

}
