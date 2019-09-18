<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>jsp:forward动作标签</title>
	</head>
	<body>
		<!-- 设置request的 -->
	    <% request.setCharacterEncoding("UTF-8"); %>
	    
		<!-- 使用jsp动作标签跳转到另外一个界面包含一个页面 -->
		<jsp:forward page="other.jsp">
			<jsp:param value="北京" name="address"/>
		</jsp:forward> 
		<%-- <% request.getRequestDispatcher("other.jsp").forward(request, response); %>  --%>
	</body>
</html>