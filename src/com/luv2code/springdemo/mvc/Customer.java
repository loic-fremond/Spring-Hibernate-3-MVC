package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	
	private String firstName;
	
	// adding validation rules for last name (literal values)
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String lastName;
	
	// adding validation rules for numeric values
	@Min(value=0, message="must be greater than or equal to zero")
	@Max(value=10, message="must be less than or equal to ten")
	@NotNull(message="is required")
	private Integer freePasses;
	
	// new field for regex validation
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="must be exactly 5 chars/digits")
	private String postalCode;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

}
