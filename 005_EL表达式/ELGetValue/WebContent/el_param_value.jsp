<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>EL表达式获取获取parameter中的值</title>
	</head>
	<body>
		<%=new String(request.getParameter("address").toString().getBytes("ISO-8859-1"), "utf-8")%>
		<!-- el表达式不能转码 -->
		<br/>${param.address}
	</body>
</html>