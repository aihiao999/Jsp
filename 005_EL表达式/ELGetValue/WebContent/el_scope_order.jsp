<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>EL表达式获取Jsp的4个作用域的值顺序</title>
	</head>
	<body>
		<%
			pageContext.setAttribute("name", "zhangsan");
			request.setAttribute("name", "lisi");
			session.setAttribute("name", "wangwu");
			application.setAttribute("name", "zhaoliu");
		%>
		
		<!-- 
			先从pageContext作用域里找name值; 
			pageContext作用域里没有, 再去request作用域里找name值;
			request作用域里没有, 再去session作用域里找name值;
			session作用域里没有, 再去application作用域里找name值; 
			application作用域里没有, 就为空字符串, 不会报错。
		-->
		${name}<br/>
		<!-- 只能取application作用域中的name值 -->
		${applicationScope.name }
	</body>
</html>