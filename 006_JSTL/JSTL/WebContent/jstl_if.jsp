<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>jstl if</title>
	</head>
	<body>
		<!-- 向page作用域中存储一个age对象, 值为18 -->
		<c:set var="age" value="18" scope="page"/>
		
		<!-- 向session作用域中存储了一个 bigAgeResult对象, 值为test属性的结果-->
		<c:if test="${age > 18}" var="bigAgeResult" scope="session">
			年龄大于18
		</c:if>
		
		<c:if test="${age <= 18}" var="littleAgeResult" scope="session">
			年龄小于等于18
		</c:if>
		
		<br/>${sessionScope.bigAgeResult }
	</body>
</html>