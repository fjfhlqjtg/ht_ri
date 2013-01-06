package com.fjfhlqjtg.validator.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;

import com.fjfhlqjtg.outcontacc.dao.OutContAccDao;
import com.fjfhlqjtg.utils.StringUtil;
import com.fjfhlqjtg.validator.annotation.DeptCodeCheck;

/**
 * 部门编号是否合法校验
 * @author fjfhlqjtg
 *
 */
public class DeptCodeValidator implements
		ConstraintValidator<DeptCodeCheck, String> {
	private Logger log = LogManager.getLogger(this.getClass());
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
			log.info("通过部门编号:" + value + ",在数据库中未查询到相关数据");
		}
		if (StringUtil.isNotNull(deptCode))
			return true;
		else
			return false;
	}

}
