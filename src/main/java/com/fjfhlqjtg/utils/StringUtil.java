package com.fjfhlqjtg.utils;

import org.apache.commons.lang3.StringUtils;

public class StringUtil {

	public static boolean isNull(String str) {
		if (StringUtils.isEmpty(str) || StringUtils.isBlank(str))
			return true;
		else
			return false;
	}

	public static boolean isNotNull(String str) {
		if (isNull(str))
			return false;
		else
			return true;
	}
}
