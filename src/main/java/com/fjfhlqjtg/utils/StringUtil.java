package com.fjfhlqjtg.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * 字符串工具类
 * @author fjfhlqjtg
 *
 */
public class StringUtil {

	/**
	 * <p>判断字符串是否为空</p>
	 * @author fjfhlqjtg
	 * @param str 要校验的字符串
	 * @return {@code true} 如果字符串为空或为null
	 */
	public static boolean isNull(String str) {
		if (StringUtils.isEmpty(str) || StringUtils.isBlank(str))
			return true;
		else
			return false;
	}

	/**
	 * <p>判断字符串是否不为空</p>
	 * @author fjfhlqjtg
	 * @param str 要校验的字符串
	 * @return {@code true} 如果字符串不为空并且不为null
	 */
	public static boolean isNotNull(String str) {
		if (isNull(str))
			return false;
		else
			return true;
	}
}
