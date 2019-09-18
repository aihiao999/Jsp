<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>jstl set</title>
	</head>
	<body>
	<!-- 
		var声明一个对象
		value对象的值
		scope存储的作用域, 默认是pageContext作用域
	 -->
	<c:set var="name" value="zhangsan" scope="session"/>
	
	${name}
	</body>
</html>