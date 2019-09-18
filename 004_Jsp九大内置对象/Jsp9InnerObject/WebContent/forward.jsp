<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>一次请求获取Jsp的4个作用域的值</title>
	</head>
	<body>
		<%=pageContext.getAttribute("pageContext") %><br/>
		<%=request.getAttribute("request") %><br/>
		<%=session.getAttribute("session") %><br/>
		<%=application.getAttribute("application") %><br/>
	</body>
</html>