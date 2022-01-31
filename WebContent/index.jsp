<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags"  prefix="h" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h:Header color="#95b1c2">"You make your own choices"</h:Header>
	<b>Login to continue</b><br>
	<form method="post" action="Daniel.do">
		  Username: <input type="text" name="username">
		  Password: <input type="password" name="password">
		  <input type="submit">
 	</form>
 	
 <c:if test="${verified == 'false'}">
 	<em>Invalid username or password!</em>
 </c:if>
 
</body>
</html>