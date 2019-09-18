<%@page import="com.lywgames.bean.Student"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>EL表达式获取获取Map中的值</title>
	</head>
	<body>
		<%
			Map<String, Student> id2Student = new HashMap<String, Student>();
			Student xiaocui = new Student("小翠", 16);
			Student xiaomi = new Student("小明", 18);
			id2Student.put("s001", xiaocui);
			id2Student.put("s002", xiaomi);
			session.setAttribute("id2Student", id2Student);
		%>
		
		<!-- EL表达式获取获取Map中的值 -->
		<!-- EL表达式使用.xxx获取值, xxx必须是字符串, 数值类型的字符串也不行 -->
		${ sessionScope.id2Student.s001.name } ${ sessionScope.id2Student.s001.age }<br/>
		${ sessionScope.id2Student.s002.name } ${ sessionScope.id2Student.s002.age }
	</body>
</html>