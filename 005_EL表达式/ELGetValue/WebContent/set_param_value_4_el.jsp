<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>set parameter value for el</title>
	</head>
	<body>
		<a href="el_param_value.jsp?address=北京">beijing</a>
		<form action="el_param_value.jsp" method="post">
			<input type="text" name="address" value="北京"/>
			<input type="submit"/>
		</form>
	</body>
</html>