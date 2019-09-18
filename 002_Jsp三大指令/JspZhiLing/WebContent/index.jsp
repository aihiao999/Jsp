<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="true" extends="org.apache.jasper.runtime.HttpJspBase" import="java.util.*"%>
<%@ page errorPage="error.jsp"%>
<%@ include file="inner.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Jsp三大指令介绍</title>
	</head>
	<body>
		<h1>Jsp三大指令介绍</h1>
		<!-- 这里抛出一个除0错误, 看能不能自动跳到error.jsp。 -->
		<%-- <%int value = 10 / 0;%> --%>
	</body>
</html>