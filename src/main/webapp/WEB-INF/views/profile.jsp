<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <%@ page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2> Welcome : User </h2>
	<h3> Name : ${model_user.getName()}</h3>
	<h3> Email Id : ${model_user.getEmail()}</h3>
	<h3> Phone No. : ${model_user.getPhoneno()}</h3>
</body>
</html>