package com.fjfhlqjtg.validator.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.fjfhlqjtg.infacacc.dao.InFacAccDao;
import com.fjfhlqjtg.utils.StringUtil;
import com.fjfhlqjtg.validator.annotation.SaleSysCheck;

public class SaleSysValidator implements
		ConstraintValidator<SaleSysCheck, String> {

	@Autowired
	private InFacAccDao dao;

	@Override
	public void initialize(SaleSysCheck constraintAnnotation) {
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (StringUtil.isNull(value))
			return false;
		String saleSys = dao.queryForSaleSys(value);
		if (StringUtil.isNotNull(saleSys))
			return true;
		return false;
	}

}
