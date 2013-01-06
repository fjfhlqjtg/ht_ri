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

import com.fjfhlqjtg.validator.validator.ExcludeValidator;

@Target({ METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ExcludeValidator.class)
@Documented
public @interface ExcludeCheck {

	String message() default "{除外标的不正确}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
