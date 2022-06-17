package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showPage() {
		/* thanks to our config file (spring-mvc-demo-servlet / (step 5) Spring MVC view resolver),
		Spring will prepend "WEB-INF/view" and append ".jsp" to the String that is returned by this method
		--> so it will take "main-menu" and turn it to "WEB-INF/view/main-menu.jsp" */
		return "main-menu";
	}

}
