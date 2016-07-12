<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="kendo" uri="http://www.kendoui.com/jsp/tags"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
 <link href="resources/styles/kendo.common.min.css" rel="stylesheet" type="text/css" />
    <link href="resources/styles/kendo.default.min.css" rel="stylesheet" type="text/css" />
    <script src="resources/js/jquery.min.js"></script>
    <script src="resources/js/kendo.web.min.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> 
    
<style>
    div.right{
       width: 22%
}

div.absolute {
    width: 50%
    position: absolute;
    box-sizing: border-box;
    width: 300px;
    height: 200px;
    margin-top:70px;
    margin-bottom:50px;
    border: 3px solid black;
    align:center;
    margin:0 auto;
    background: olive;
    
}

div.left{
width: 22%
}

div.login{
	
	height: 200px;
	width: 200px:
}
</style> 

</head> 
    
<body>
 <div class="absolute" align="center">
 <form method="post" action="LoginServlet">
 

<div class="login">
<h3>Login Page</h3>
<table>
<h3>
<% if( session.getAttribute("loginResult")!=null ) {%>
<%= session.getAttribute("loginResult") %>
<% } %>
</h3>
<tr><td>UserName::</td>  <td> <kendo:maskedTextBox name="userName"></kendo:maskedTextBox><br></td></tr>
<tr><td>Password::</td>  <td> <kendo:maskedTextBox type="password" name="password"></kendo:maskedTextBox><br><br></td></tr>
<tr><td></td><td><kendo:button name="submit">Login</kendo:button></td></tr>
<tr><td></td><td><a href="SignUp.jsp">Sign Up</a></td></tr>
</table>


</div>
 </form>
  </div>
</body>
</html>