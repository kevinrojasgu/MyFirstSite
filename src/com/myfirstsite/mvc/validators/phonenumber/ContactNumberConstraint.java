package com.myfirstsite.mvc.validators.phonenumber;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;

import org.springframework.messaging.handler.annotation.Payload;

@Documented
@Constraint(validatedBy = ContactNumberValidator.class) //class which executes the validation
@Target({ElementType.METHOD, ElementType.FIELD}) //destiny of the validation 
@Retention(RetentionPolicy.RUNTIME) // when it's going to be executed
public @interface ContactNumberConstraint {

	public String value() default ""; //default value for our field
    public String message() default "Invalid phone number"; // default message validator
    Class<?>[] groups() default {}; //
    Class<? extends Payload>[] payload() default {};
}
		