<!-- Reference JSTL tag library -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Student Confirmation</title>
	</head>
	<body>
		<!-- ${student.firstName} calls student.getFirstName() -->
		<!-- same for student.lastName -->
		The student is confirmed: ${student.firstName} ${student.lastName}
		<br><br>
		Country: ${student.country}
		<br><br>
		Favorite language: ${student.favoriteLanguage}
		<br><br>
		Operating Systems:
		<ul>
			<!-- use JSTL for looping through operatingSystems and create li for each selected system -->
			<c:forEach var="temp" items="${student.operatingSystems}">
				<li> ${temp} </li>
			</c:forEach>
		</ul>
	</body>
</html>