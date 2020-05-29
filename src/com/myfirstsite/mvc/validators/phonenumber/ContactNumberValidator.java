package com.myfirstsite.mvc.validators.phonenumber;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ContactNumberValidator implements  ConstraintValidator<ContactNumberConstraint, String> {

	@Override
    public void initialize(ContactNumberConstraint contactNumber) {
    }
	
	@Override
	public boolean isValid(String contactField, ConstraintValidatorContext context) {
		return contactField != null && contactField.matches("[0-9]+")
				&& (contactField.length() > 6 || contactField.length() < 14);
	}

}
