<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Student Confirmation</title>
</head>
<body>

The student is confirmed: ${student.firstName} ${student.lastName}

<br><br>

Country: ${student.country}

<br><br>

Favourite: ${student.favouriteLanguage}

<br><br>

Operating Systems: ${student.operatingSystem}

<ul>
	<c:forEach var="temp" items="${student.operatingSystem}">
	<li> ${temp} </li>
	</c:forEach>
</ul>

</body>
</html>