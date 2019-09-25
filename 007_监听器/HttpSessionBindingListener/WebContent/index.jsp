<%@page import="com.lywgames.listener.HttpSessionBindingListenerBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		HttpSessionBindingListenerBean bean = new HttpSessionBindingListenerBean();
		bean.setName("lisisi");
	
		session.setAttribute("bean", bean);
		session.removeAttribute("bean");
	%>
</body>
</html>