<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import= "world.model.City" %>
   <%--  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>World Table</h3>
<%-- <% City city=(City)session.getAttribute("city"); %>

<table>
<tr><td><%=city.getCityName()%></td></tr> 


</table>--%>

<table>

  <c:forEach items="${list}" var="city">
    <tr>
      <td><c:out value="${city.name}" /></td>
    </tr>
  </c:forEach>
</table> 
<form method="post" action="CityController">
</form>

</body>
</html>