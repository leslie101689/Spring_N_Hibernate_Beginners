<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
	First name: <form:input path="firstName" />
	
	<br><br>
	
	Last name: <form:input path="lastName" />
	
	<br><br>
	
	Country: 
	<form:select path="country">
		
		<form:options items="${theCountryOptions}" />
	
	</form:select>
	
	<br><br>
	
	Favourite Language:
	
	<form:radiobuttons path="favouriteLanguage" items="${student.favouriteLanguageOptions}" />
	
	<br><br>
	
	Operating Systems:
	
	<form:checkboxes path="operatingSystem" items="${student.operatingSystemOptions}" />
	
	<br><br>
	
	<input type="submit" value="Submit" />
	
	</form:form>
</body>
</html>