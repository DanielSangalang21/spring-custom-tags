<%@ attribute name="color" required="true" rtexprvalue="true" %>
<%@ tag body-content="tagdependent" %>
<!DOCTYPE html>
<html><img alt="Movies_Logo" src="images/movies.jpg">
<em><strong><font color="${color}"><jsp:doBody/></font></strong></em><br><br>
</html>