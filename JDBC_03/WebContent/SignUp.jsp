<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="kendo" uri="http://www.kendoui.com/jsp/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="resources/styles/kendo.common.min.css" rel="stylesheet" type="text/css" />
    <link href="resources/styles/kendo.default.min.css" rel="stylesheet" type="text/css" />
    <script src="resources/js/jquery.min.js"></script>
    <script src="resources/js/kendo.web.min.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> 
    
    <style type="text/css">
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

div.signup{
	
	height: 200px;
	width: 200px:
}
    
    
    </style>
    
</head>
<body>
 <div class="absolute" align="center">
 <form method="post" action="SignUpServlet">
 <div class="signup">

<h3>Sign Up</h3>
<table>
<tr><td>Email::</td> <td><kendo:maskedTextBox name="email" /> </td></tr>
<tr><td>First Name::</td> <td> <kendo:maskedTextBox name="firstname"/> </td></tr>
<tr><td>Last Name::</td><td> <kendo:maskedTextBox name="lastname"/></td></tr>
<tr><td>Password::</td><td> <kendo:maskedTextBox name="password"/></td></tr>
<tr><td></td><td> <kendo:button name="submit">Sign Up</kendo:button> </td>
</table>
</div>
</form>
</div>
</html>
