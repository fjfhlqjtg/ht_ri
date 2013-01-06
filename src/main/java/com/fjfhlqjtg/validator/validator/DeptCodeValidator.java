package com.fjfhlqjtg.validator.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;

import com.fjfhlqjtg.outcontacc.dao.OutContAccDao;
import com.fjfhlqjtg.utils.StringUtil;
import com.fjfhlqjtg.validator.annotation.DeptCodeCheck;

public class DeptCodeValidator implements
		ConstraintValidator<DeptCodeCheck, String> {

	@Autowired
	private OutContAccDao dao;

	@Override
	public void initialize(DeptCodeCheck constraintAnnotation) {

	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (StringUtil.isNull(value))
			return false;
		String deptCode = null;
		try {
			deptCode = dao.queryForDeptCode(value);
		} catch (EmptyResultDataAccessException e) {
			System.out.println("未查询到数据");
		}
		if (StringUtil.isNotNull(deptCode))
			return true;
		else
			return false;
	}

}
