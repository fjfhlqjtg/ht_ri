package com.fjfhlqjtg.validator.validator;

import java.util.Calendar;
import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

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
		ConstraintValidator<ContReadyCheck, Date> {
	private Logger log = LogManager.getLogger(this.getClass());
	@Autowired
	private OutContAccDao dao;

	@Override
	public void initialize(ContReadyCheck constraintAnnotation) {
	}

	@Override
	public boolean isValid(Date value, ConstraintValidatorContext context) {
		if (value == null)
			try {
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(value);
				int year = calendar.get(Calendar.YEAR);
				String readyMrk = dao.queryForContIsReady(year);
				if (StringUtil.isNotNull(readyMrk)) {
					if ("1".equals(readyMrk))
						return true;
					else
						return false;
				} else
					return false;
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
				log.error("转换格式错误");
			}
		return false;
	}

}
