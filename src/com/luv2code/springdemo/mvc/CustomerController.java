package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// add an initbinder... to convert trim input strings
	// remove leading and trailing whitespace
	// resolve issue for last name validation (it accepted only white spaces as last name)
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true); // true means that all whitespace will be trimmed down to null
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		theModel.addAttribute("customer", new Customer());
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	// @Valid performs validation rules on the Customer object
	// the results of the validation are placed in the BindingResult object
	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult theBindingResult) {
		System.out.println("Last name: |" + theCustomer.getLastName() + "|");
		System.out.println(theBindingResult);
		System.out.println("\n\n");
		if (theBindingResult.hasErrors()) {
			return "customer-form";
		} else {		
			return "customer-confirmation";
		}
	}

}
