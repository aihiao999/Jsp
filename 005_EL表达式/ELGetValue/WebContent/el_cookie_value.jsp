<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>EL表达式获取获取cookie中的值</title>
	</head>
	<body>
		<%response.addCookie(new Cookie("last_login_time", "2020-10-01"));%>
		
		<!-- EL表达式获取获取cookie中的值 -->
		${ cookie.last_login_time.value }
	</body>
</html>