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
<h:Header color="#4e9180">"Bad Choices Make Good Stories"</h:Header>
	<b>Welcome ${user["username"]}!</b><br>
	Tell us your movie genre choice:<br>
	<form action="Select.do">
		<select name="choice">
			<c:if test="${choice eq null}">
				<s:choices>
					<option value="${choice}">${choice}</option>
				</s:choices>
			</c:if>
		</select>
	<input type="submit" value="See Advice">
	</form>	
</body>
</html>