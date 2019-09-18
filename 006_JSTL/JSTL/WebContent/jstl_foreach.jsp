<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.lywgames.bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>jstl forEach</title>
	</head>
	<body>
		<!-- 
			begin起始值
			end结束值
			step步长
			var不值存的一个对象 
		-->
		<c:forEach begin="1" end="10" var="value" step="2">
			${value}
		</c:forEach>
		<br/>
		<%
			List<User> users = new ArrayList<User>();
			users.add(new User("张三", 18));
			users.add(new User("小花", 16));
			
			session.setAttribute("users", users);
		%>
		<!-- items使用EL表达式访问域对象 -->
		<c:forEach var="user" items="${users}">
			[${user.name},${user.age}]<br/>
		</c:forEach>
	</body>
</html>