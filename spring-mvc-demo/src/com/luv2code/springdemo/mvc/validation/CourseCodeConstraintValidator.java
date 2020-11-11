package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator 
	implements ConstraintValidator<CourseCode, String> {

	private String[] coursePrefixes;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefixes = theCourseCode.value();
		
	}

	@Override
	public boolean isValid(String theCode, 
			ConstraintValidatorContext theConstraintValidatorContext) {

		boolean result = false;
		
		if(theCode != null) {
			// loop thru course prefix
			// check to see if the code matches 
			for (String tempPrefix : coursePrefixes) {
				result = theCode.startsWith(tempPrefix);
				
				// if match then break the loop
				if (result) {
					break;
				}
			}
		}
		else {
			result = true;
		}
		
		return result;
	}
}
