package com.fjfhlqjtg.validator.validator;

import java.util.Calendar;
import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.fjfhlqjtg.outcontacc.dao.OutContAccDao;
import com.fjfhlqjtg.validator.annotation.ContExistCheck;

/**
 * 是否有可进入合同校验
 * @author fjfhlqjtg
 *
 */
public class ContExistValidator implements
		ConstraintValidator<ContExistCheck, Date> {

	@Autowired
	private OutContAccDao dao;

	@Override
	public void initialize(ContExistCheck constraintAnnotation) {

	}

	@Override
	public boolean isValid(Date value, ConstraintValidatorContext context) {
		if (value == null)
			return false;
		try {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(value);
			int year = calendar.get(Calendar.YEAR);
			int count = dao.queryForContIsExist(year);
			if (count > 0)
				return true;
			else
				return false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
