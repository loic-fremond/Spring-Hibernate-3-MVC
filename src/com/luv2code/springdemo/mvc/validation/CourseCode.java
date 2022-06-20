package com.luv2code.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

// who will handle the validation ?
@Constraint(validatedBy = CourseCodeConstraintValidator.class)
// the annotation will apply to a method or a field
@Target( { ElementType.METHOD, ElementType.FIELD })
// how long will the marked annotation be stored or used ?
// retain this annotation in the Java class file
// process it at runtime
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	// define default course code
	public String[] value() default {"LUV"};
	
	// define default error message
	public String message() default "must start with LUV";
	
	// define default groups
	public Class<?>[] groups() default {};
	
	// define default payloads
	public Class<? extends Payload>[] payload() default {};	

}
