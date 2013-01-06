package com.fjfhlqjtg.validator.validator;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.fjfhlqjtg.outcontacc.dao.OutContAccDao;
import com.fjfhlqjtg.utils.StringUtil;
import com.fjfhlqjtg.validator.annotation.ContReadyCheck;

/**
 * 合同是否就绪校验
 * 
 * @author fjfhlqjtg
 * 
 */
public class ContReadyValidator implements
		ConstraintValidator<ContReadyCheck, String> {
	private Logger log = LogManager.getLogger(this.getClass());
	@Autowired
	private OutContAccDao dao;

	@Override
	public void initialize(ContReadyCheck constraintAnnotation) {
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (StringUtil.isNull(value))
			return false;
		try {
			Date insuDate = DateUtils.parseDate(value, "YYYYMMDD");
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(insuDate);
			int year = calendar.get(Calendar.YEAR);
			String readyMrk = dao.queryForContIsReady(year);
			if (StringUtil.isNotNull(readyMrk)) {
				if ("1".equals(readyMrk))
					return true;
				else
					return false;
			} else
				return false;
		} catch (ParseException e) {
			e.printStackTrace();
			log.error("转换错误");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			log.error("转换格式错误");
		}
		return false;
	}

}
