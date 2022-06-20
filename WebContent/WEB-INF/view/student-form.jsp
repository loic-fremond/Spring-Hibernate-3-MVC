<!-- import of tag library for forms -->
<!-- prefix distinguishes between different taglibs -->
<!-- uri stands for "uniform resource identifier" -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Student Registration Form</title>
	</head>
	<body>
		<!-- action="processForm" refers to controller method (in StudentController.java) -->
		<!-- modelAttribute="student" refers to the name of the attribute that we added to the model in StudentController.java -->
		<form:form action="processForm" modelAttribute="student">
			<!-- path="firstName" will make use of getFirstName() (on load) and setFirstName() (on submit) methods in Student.java -->
			First name: <form:input path="firstName" />
			
			<br><br>
			
			<!-- path="lastName" will convert to getLastName() (on load) and getFirstName() (on submit) methods from Student.java -->
			Last name: <form:input path="lastName" />
			
			<br><br>
			
			Country:
			<!-- On submit, Spring MVC will call student.setCountry() -->
			<form:select path="country">
				<!-- <form:option value="Brazil" label="Brazil" />
				<form:option value="France" label="France" />
				<form:option value="Germany" label="Germany" />
				<form:option value="India" label="India" /> -->
				<form:options items="${student.countryOptions}" />
			</form:select>
			
			<br><br>
			
			Favorite language:
			Java <form:radiobutton path="favoriteLanguage" value="Java" />
			C# <form:radiobutton path="favoriteLanguage" value="C#" />
			PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
			Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />
			
			<br><br>
			
			Operating Systems:
			Linux <form:checkbox path="operatingSystems" value="Linux"/>
			Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
			MS Windows <form:checkbox path="operatingSystems" value=" MS Windows"/>
			
			<br><br>
			
			<input type="submit" value="Submit" />
		</form:form>
	</body>
</html>