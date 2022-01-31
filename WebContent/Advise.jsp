<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="SimpleTagAdvice" prefix="s" %>
<%@ taglib tagdir="/WEB-INF/tags"  prefix="h" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h:Header color="#63b5b8">"May Your Choices Reflect Your Hope Not Your Fears"</h:Header>
		<strong>Okay ${sessionScope.user.username}, you chose ${requestScope.choice} try this!</strong>
		<s:advice choice="${requestScope.choice}">
			<h3>${advise}</h3>
		</s:advice>
</body>
</html>