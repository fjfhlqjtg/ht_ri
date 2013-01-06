package com.fjfhlqjtg.validator.annotation;

import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.fjfhlqjtg.validator.validator.DeptCodeValidator;

@Target({ METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DeptCodeValidator.class)
@Documented
public @interface DeptCodeCheck {
	String message() default "{部门编号错误}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
