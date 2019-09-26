<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>登录界面</title>
	</head>
	<body>
		<c:if test="${not empty userBean }">
			<% response.sendRedirect("index.jsp"); %>
		</c:if>
		${loginError}
		<form action="LoginServlet.action" method="post">
			账号:<input type="text" name="username"><br/>
			密码:<input type="password" name="password"><br/>
			<input type="checkbox" name="autologin" value="1">自动登录<br/>
			<input type="submit" value="登录">
		</form>
	</body>
</html>