<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生列表页面</title>
<script type="text/javascript">
	function doDelete(sid) {
		var flag = confirm("是否确定删除?");
		if(flag){
			location.href="DeleteServlet.action?sid="+sid;
		}
	}
</script>
</head>
<body>
	<form action="SearchStudentServlet.action" method="post">
	<table border="1px" width="1300px" align="center">
		<tr>
			<td colspan="8">
				按姓名查询:<input type="text" name="sname"/>
				&nbsp;
				按性别查询:<select name="gender">
							<option value="">--请选择--
							<option value="男">男
							<option value="女">女
						  </select>
				&nbsp;&nbsp;&nbsp;
				<input type="submit" value="查询">
				&nbsp;&nbsp;&nbsp;
				<a href="add.jsp">添加</a>
			</td>
		</tr>
		<tr>
			<td width="100px">编号</td>
			<td width="100px">姓名</td>
			<td width="50px">性别</td>
			<td width="150px">电话</td>
			<td width="200px">爱好</td>
			<td width="400px">详情</td>
			<td width="200px">出生年月日</td>
			<td width="100px">操作</td>
		</tr>
		<c:forEach items="${studentList}" var="student">
			<tr>
				<td>${student.sid}</td>
				<td>${student.sname}</td>
				<td>${student.gender}</td>
				<td>${student.phone}</td>
				<td>${student.hobby}</td>
				<td>${student.info}</td>
				<td>${student.birthday}</td>
				<td><a href="EditServlet.action?sid=${student.sid}">修改</a>&nbsp;&nbsp;&nbsp;<a href="#" onclick="doDelete(${student.sid})">删除</a></td>
			</tr>
		</c:forEach>
	</table>
	</form>
</body>
</html>