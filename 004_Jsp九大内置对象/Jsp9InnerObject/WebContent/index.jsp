<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>同一页面获取Jsp的4个作用域的值</title>
	</head>
	<body>
		<%
			pageContext.setAttribute("pageContext", "我是pageContext内置对象");
			request.setAttribute("request", "我是request内置对象");
			session.setAttribute("session", "我是session内置对象");
			application.setAttribute("application", "我是application内置对象");
		%>
		
		<%=pageContext.getAttribute("pageContext") %><br/>
		<%=request.getAttribute("request") %><br/>
		<%=session.getAttribute("session") %><br/>
		<%=application.getAttribute("application") %><br/>
		<%-- <%request.getRequestDispatcher("forward.jsp").forward(request, response); %> --%>
		<%response.sendRedirect("forward.jsp"); %>
	</body>
</html>