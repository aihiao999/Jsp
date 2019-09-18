<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>EL表达式获取获取集合中的值</title>
	</head>
	<body>
		<%
			List<String> addressList = new ArrayList<String>();	
			addressList.add("北京");
			addressList.add("洛阳");
			addressList.add("郑州");
			request.setAttribute("addressList", addressList);
		%>
		
		<!-- EL表达式获取获取集合中的值 -->
		${ requestScope.addressList[0] } ${ requestScope.addressList[1] } ${ requestScope.addressList[2] }
	</body>
</html>