package com.fjfhlqjtg.validator.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.fjfhlqjtg.outcontacc.dao.OutContAccDao;
import com.fjfhlqjtg.utils.StringUtil;
import com.fjfhlqjtg.validator.annotation.ExcludeCheck;

/**
 * 除外标的校验
 * 
 * @author fjfhlqjtg
 * 
 */
public class ExcludeValidator implements
		ConstraintValidator<ExcludeCheck, String> {
	@Autowired
	private OutContAccDao dao;

	@Override
	public void initialize(ExcludeCheck constraintAnnotation) {

	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (StringUtil.isNull(value))
			return true;
		String exclude = dao.queryForExcludeCode(value);
		if (StringUtil.isNotNull(exclude))
			return true;
		else
			return false;
	}

}
