<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SpringmvcDemo</title>
</head>
<body>
	<p>怎么</p>
	<p>${name}</p>
	<form action="login.do" method="post">
		<span>userName</span><input name="username">
		<span>passWord</span><input name="password">
		<input type="submit" value="登录"/>
	</form>
</body>
</html>