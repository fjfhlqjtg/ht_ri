package com.fjfhlqjtg.validator.annotation;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.fjfhlqjtg.validator.validator.ContExistValidator;

@Target({ METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ContExistValidator.class)
@Documented
public @interface ContExistCheck {

	String message() default "{没有可进入的合同}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
