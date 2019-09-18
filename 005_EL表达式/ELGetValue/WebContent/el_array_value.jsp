<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>EL表达式获取获取数组中的值</title>
	</head>
	<body>
		<%
			String[] nameArray = {"zhangsan", "lisi", "wangwu"};
			pageContext.setAttribute("nameArray", nameArray);
		%>
		
		<!-- EL表达式获取获取数组中的值 -->
		${ pageScope.nameArray[0] } ${ pageScope.nameArray[1] } ${ pageScope.nameArray[2] }
	</body>
</html>